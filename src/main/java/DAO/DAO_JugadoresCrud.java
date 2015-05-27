/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Jugador;
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
import static com.mongodb.ProyectoFinal.util.Helpers.printJson;

/**
 *
 * @author andres
 */
public class DAO_JugadoresCrud {
    public static void main(String [] args) {
        Jugador j1 = new Jugador();
        j1.setFirstname("Pedro");
        j1.setLastname("Mogort");
        j1.setFecha_nac("21-03-1986");
        j1.setSalario("200.000 €");
        j1.setPosicion("Lateral izquierdo");
        j1.setDuracion("2 años");
        
        insertar(j1);
        listar();
    
}
    public static void listar(){
        
    MongoClient client = new MongoClient();
    MongoDatabase database = client.getDatabase("equipo");
    MongoCollection<Document> collection = database.getCollection("jugadores");
    
    ArrayList <Jugador> jugadores = new ArrayList();
    
    Bson sort1 = new Document("nombre",1);
    Bson projection = fields(include("firstname","lastname","fecha_nac","salario","posicion","duracion"),excludeId());
        
        MongoCursor<Document> cursor = collection.find()
                    .sort(sort1)
                    .projection(projection)
                    .iterator();
        try {
            while (cursor.hasNext()) {
                jugadores.add(creaJugador(cursor.next()));
                printJson(cursor.next());
            }
        } finally {
            cursor.close();
        }
    }
    
    private static Jugador creaJugador(Document d) {
            
        Jugador j1 = new Jugador();
        
        j1.setFirstname((d.getString("firstname")));
        j1.setLastname(d.getString("lastname"));
        j1.setFecha_nac(d.getString("fecha_nac"));
        j1.setSalario(d.getString("salario"));
        j1.setPosicion(d.getString("posicion"));
        j1.setDuracion(d.getString("duracion"));
        return j1;
        
    }
    
    public static void insertar(Jugador j){
    MongoClient client = new MongoClient();
    MongoDatabase database = client.getDatabase("equipo");
    MongoCollection<Document> collection = database.getCollection("jugadores");

   

        collection.insertOne(creaDoc(j));

        client.close();
    }
    
    private static Document creaDoc(Jugador j) {

        return new Document

           ("firstname", j.getFirstname())
    .append("lastname",  j.getLastname())
    .append("fecha_nac", j.getFecha_nac())
    .append("salario",   j.getSalario())
    .append("posicion",  j.getPosicion())      
    .append("duracion",  j.getDuracion());
    }
}