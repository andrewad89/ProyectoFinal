/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;



import Entidad.Jugador;
import Aplicacion.JugadoresCrud;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;


public class DAO_JugadoresCrud {
    
    static Conexion datab = new Conexion("equipo");
    
    public static void iniciar() {
    datab.abrir();
    datab.setCollection("jugadores");
    }
    
    public static ArrayList listar(){
        
    ArrayList <Jugador> jugadores = new ArrayList();
    
    Bson sort1 = new Document("firstname",1);
    Bson projection = fields(include(
            "_id",
            "firstname",
            "lastname",
            "fecha_nac",
            "salario",
            "posicion",
            "duracion")
            );
     
        MongoCursor<Document> cursor = datab.collection.find()
                    .sort(sort1)
                    .projection(projection)
                    .iterator();
        try {
            while (cursor.hasNext()) {
                jugadores.add(creaJugador(cursor.next()));
            }
        } finally {
            cursor.close();
            return jugadores;
        }
    }
    public static double nId() {
        
        double id;
        
        try {
        id=1 + datab.collection.find().sort(eq("_id",-1)).first().getDouble("_id");
        } 
        catch (NullPointerException ex) {
        id=1;
        }
        return id;
    }
    private static Jugador creaJugador(Document d) {
            
        Jugador j1 = new Jugador();
        j1.setId(d.getDouble("_id"));
        j1.setFirstname((d.getString("firstname")));
        j1.setLastname(d.getString("lastname"));
        j1.setFecha_nac(d.getString("fecha_nac"));
        j1.setSalario(d.getString("salario"));
        j1.setPosicion(d.getString("posicion"));
        j1.setDuracion(d.getString("duracion"));
        return j1;
        
    }
    
    public static void insertar(Jugador j){
   
        datab.collection.insertOne(creaDoc(j));
    }
    
    private static Document creaDoc(Jugador j) {

        return new Document
           ("_id", j.getId())
    .append("firstname", j.getFirstname())
    .append("lastname",  j.getLastname())
    .append("fecha_nac", j.getFecha_nac())
    .append("salario",   j.getSalario())
    .append("posicion",  j.getPosicion())      
    .append("duracion",  j.getDuracion());
    }
    

     public static void borrar(Double id) {
       
        datab.collection.deleteOne(new Document("_id", id));
}  
     public static void modificar (Jugador j) {
   
        datab.collection.replaceOne(eq("_id", j.getId()), creaDoc(j));
    }
     
    public static Jugador buscar(Double id) {

        Bson filtro = new Document("_id",id);
        
        Jugador j = creaJugador(datab.collection.find(filtro).first());
        
        return j;

    }
}

