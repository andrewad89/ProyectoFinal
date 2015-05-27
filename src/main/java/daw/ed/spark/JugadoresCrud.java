package daw.ed.spark;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.freemarker.FreeMarkerRoute;

/*public class JugadoresCrud {

    public static void main(String[] args) {
        
        Spark.staticFileLocation("/public");
        Map<String, Object> data = new HashMap<>();
        
        get (new FreeMarkerRoute("/freemarker/create"){
        @Override
        public Object handle(Request request,Response response){
             
                
               data.put("users", users);
               
              return modelAndView(data,"prueba.ftl");
          }
    });
   post (new Route("freemarker/create") {
            @Override
            public Object handle(Request request, Response response) {
                  String firstname = request.queryParams("firstname");
                  String lastname = request.queryParams("lastname");
                  
                  User us = new User(firstname,lastname);
                    users.add(us);
                  
                  
response.redirect("http://localhost:4567/freemarker/prueba");
                return response;
}
            });
    });
          
    }
}
*/