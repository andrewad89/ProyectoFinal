package DAO;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import org.bson.Document;

public class Conexion {
    
    private String datab;
    String host;
    private MongoClient client;
    private MongoDatabase database;
    protected MongoCollection<Document> collection;
    
    Conexion(String db) {
        this.datab = db;
        host = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
        if (host == null) {
        client = new MongoClient();
        } else {
        client = openShiftClient();
        }
        }
    
    private MongoClient openShiftClient() {
    
        int port = Integer.parseInt(System.getenv("OPENSHIFT_MONGODB_DB_PORT"));
        String username = System.getenv("OPENSHIFT_MONGODB_DB_USERNAME");
        String password = System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD");

        MongoCredential credential = MongoCredential.createCredential
            (username,"admin", password.toCharArray());

        return new MongoClient
            (new ServerAddress(host, port), Arrays.asList(credential));
    }
    
    protected void setCollection(String collection) {
    this.collection = database.getCollection(collection);
    }
    
    protected MongoCollection<Document> collection(String collection) {
    this.collection = database.getCollection(collection);
    return this.collection;
    }
    
    protected void abrir() {
    if (host == null) {
    client = new MongoClient();
    } else {
    client = openShiftClient();
    }
    client.setWriteConcern(WriteConcern.SAFE);
    database = client.getDatabase(datab);
    }
    
    protected void cerrar() {
    if (client!=null) client.close();
    }
    
    
}