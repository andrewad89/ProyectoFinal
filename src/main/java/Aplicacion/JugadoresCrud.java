package Aplicacion;

import DAO.Conexion;
import DAO.DAO_JugadoresCrud;
import Entidad.Jugador;
import DAO.DAO_JugadoresCrud;
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
       final String IP_ADDRESS = System.getenv("OPENSHIFT_DIY_IP") != null ? 
                                 System.getenv("OPENSHIFT_DIY_IP") : "localhost";
       final int PORT = System.getenv("OPENSHIFT_DIY_PORT") != null ? 
               Integer.parseInt(System.getenv("OPENSHIFT_DIY_PORT")) : 4567;
       
       Spark.staticFileLocation("/public");
        
       DAO_JugadoresCrud.iniciar();
        
        get (new FreeMarkerRoute("/listar"){
            @Override
            public Object handle(Request request,Response response){
            
             Map<String, Object> data = new HashMap<>();
                
               data.put("jugadores", DAO.DAO_JugadoresCrud.listar());
               
              return modelAndView(data,"equipo.ftl");
            }
        });
        get (new FreeMarkerRoute("/form"){
            @Override
            public Object handle(Request request,Response response){
            
              return modelAndView(null,"formulario.ftl");
            }
        });
        
        post (new Route("/create") {
            @Override
            public Object handle(Request request, Response response) {
                 
                  Jugador j1 = new Jugador();
                  j1.setId((DAO_JugadoresCrud.nId()));
                  j1.setFirstname((request.queryParams("firstname")));
                  j1.setLastname(request.queryParams("lastname"));
                  j1.setFecha_nac(request.queryParams("fecha_nac"));
                  j1.setSalario(request.queryParams("salario"));
                  j1.setPosicion(request.queryParams("posicion"));
                  j1.setDuracion(request.queryParams("duracion"));
                  
                  DAO.DAO_JugadoresCrud.insertar(j1);
                  
                  
                response.redirect("/listar");
                return response;
            }
        });
        
        
        
        
        get(new FreeMarkerRoute("/delete/:_id") {
            @Override
            public Object handle(Request request, Response response) {
            DAO_JugadoresCrud.borrar(Double.parseDouble(request.params("_id")));

            response.redirect("/listar");
            return response;
            }
        });

        post (new Route("/updateSearch/update/:_id") {

            @Override
            public Object handle(Request request, Response response) {
                 
                  Jugador j1 = new Jugador();
                  
                  j1.setId(Double.parseDouble(request.params("_id")));
                  j1.setFirstname((request.queryParams("firstname")));
                  j1.setLastname(request.queryParams("lastname"));
                  j1.setFecha_nac(request.queryParams("fecha_nac"));
                  j1.setSalario(request.queryParams("salario"));
                  j1.setPosicion(request.queryParams("posicion"));
                  j1.setDuracion(request.queryParams("duracion"));
                  
                  DAO.DAO_JugadoresCrud.modificar(j1);
                  
                  
                response.redirect("/listar");
                return response;
            }
        });
        
         get(new FreeMarkerRoute("/updateSearch/:_id") {
            @Override
            public Object handle(Request request, Response response) {
                data.put("jugador", 
                DAO_JugadoresCrud.buscar(
                    Double.parseDouble(request.params("_id"))));
            return modelAndView(data, "update.ftl");
            }
        }); 

    }
    
}