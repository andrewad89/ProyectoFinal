package daw.ed.spark;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.freemarker.FreeMarkerRoute;

public class App {

    public static void main(String[] args) {
        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "<h1>Esto es la raíz</h1>";
            }
        });
        
        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "<h1>Hello Spark MVC Framework!</h1>";
            }
        });
        
        get(new Route("/test") {
            @Override
            public Object handle(Request request, Response response) {
                return "<h1>Esto es un test!</h1>";
            }
        });
        
        get(new Route("/hello/:name") {
            @Override
            public Object handle(Request request, Response response) {
                String name = request.params(":name");
                
                return String.format("<h1>Hello %s!</h1>",name);
            }
        });
        
        get(new Route("/request/info") {
            @Override
            public Object handle(Request request, Response response) {
                String fmt =  "<ul>" +                        
                        "<li>IP: %s</li>" +
                        "<li>Request Method: %s</li>" +
                        "<li>URL: %s</li>" +
                        "<li>User Agent: %s</li>" +
                        "<li>Host: %s</li>" +
                        "<li>Content Type: %s</li>" +
                        "<li>Content Lenght: %s</li>" +
                        "<li>Headers: %s</li>" +
                        "</ul>";
                return String.format(fmt,
                        request.ip(),
                        request.requestMethod(),
                        request.url(),
                        request.userAgent(),
                        request.host(),
                        request.contentType(),
                        request.contentLength(),
                        request.headers());
            }
        });
        
        get(new Route("/redirect") {
            @Override
            public Object handle(Request request, Response response) {
                response.redirect("http://www.google.com");
                return response;
            }
        });
        
        get(new Route("/protected") {
            @Override
            public Object handle(Request request, Response response) {
                halt(401,"Go Away!!!");
                return null;
            }
         
        });
         get(new Route("/favourite_fruit") {
            @Override
            public Object handle(Request request, Response response) {
              String form ="<html>\n" +
"  <head><title>Fruit Picker</title></head>\n" +
"  <body>\n" +
"     <form action=\"http://localhost:4567/favourite_fruit\" method=\"POST\">\n" +
"        <p>What is your favorite fruit?</p>\n" +
"          <p>\n" +
"             <input type=\"radio\" name=\"fruit\" value=\"Peras\">Peras</input>\n" +
"          </p>    \n" +
"          <p>\n" +
"             <input type=\"radio\" name=\"fruit\" value=\"Manzanas\">Manzanas</input>\n" +
"          </p>    \n" +
"          <p>\n" +
"             <input type=\"radio\" name=\"fruit\" value=\"Naranjas\">Naranjas</input>\n" +
"          </p>    \n" +
"          <p>\n" +
"             <input type=\"radio\" name=\"fruit\" value=\"Platanos\">Platanoss</input>\n" +
"          </p>            \n" +
"        <input type=\"submit\" value=\"Submit\"/>\n" +
"     </form>\n" +
"  </body>\n" +
"</html>"; 
              return form;
            }
            });
          post (new Route("/favourite_fruit") {
            @Override
            public Object handle(Request request, Response response) {
                  String fruit = request.queryParams("fruit");
if ( fruit == null){
return "Elige fruta melón!";
} else {
return "Tu fruta favorita es: " + fruit;
}
}
            });
          get (new FreeMarkerRoute("/freemarker/team"){
        @Override
        public Object handle(Request request,Response response){
               Map<String, Object> data = new HashMap<>();
               data.put("firstname","Pedro");
               data.put("lastname", "Mogort");
               data.put("cumple", "12/12/2000");
               data.put("salario", "2000€");
               data.put("posicion", "Extremo izq");
               data.put("duracioncont", " 5 años");
               return modelAndView(data,"teamfootball.ftl");
          }
    });
          get (new FreeMarkerRoute("/freemarker/herencia"){
        @Override
        public Object handle(Request request,Response response){
               Map<String, Object> data = new HashMap<>();
               data.put("name","Pedro");
              return modelAndView(data,"teamfootball.ftl");
          }
    });
          
    }
}
