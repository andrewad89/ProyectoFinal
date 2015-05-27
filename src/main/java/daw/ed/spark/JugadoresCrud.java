package daw.ed.spark;

import Entidad.Jugador;
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

public class JugadoresCrud {

    public static void main(String[] args) {
       final Map<String, Object> data = new HashMap<>();
       Spark.staticFileLocation("/public");
        
     get (new FreeMarkerRoute("/freemarker/herencia"){
        @Override
        public Object handle(Request request,Response response){
               
               data.put("name","Andrés");
              return modelAndView(data,"content.ftl");
          }
    });
        
        get (new FreeMarkerRoute("/freemarker/listar"){
            @Override
            public Object handle(Request request,Response response){
            
             Map<String, Object> data = new HashMap<>();
                
               data.put("jugadores", DAO.DAO_JugadoresCrud.listar());
               
              return modelAndView(data,"equipo.ftl");
            }
        });
        
        post (new Route("freemarker/create") {
            @Override
            public Object handle(Request request, Response response) {
                 
                  Jugador j1 = new Jugador();
        
                  j1.setFirstname((request.queryParams("firstname")));
                  j1.setLastname(request.queryParams("lastname"));
                  j1.setFecha_nac(request.queryParams("fecha_nac"));
                  j1.setSalario(request.queryParams("salario"));
                  j1.setPosicion(request.queryParams("posicion"));
                  j1.setDuracion(request.queryParams("duracion"));
                  
                  DAO.DAO_JugadoresCrud.insertar(j1);
                  
                  
                response.redirect("http://localhost:4567/freemarker/listar");
                return response;
            }
        });   
    }
}