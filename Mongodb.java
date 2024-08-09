
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Mongodb {
    // 0. Mongodb is a no sql(objects) database and high speed easy maintain
    // 1. Establish the mongodb database connection with   java
    // 2. Create the collection
    // 3. Get the collection
    // 4. Insert the document in collections
    // 5. Update the document in collection
    // 6. Delete the document in collection
    // 7. Get the document from collections
    // 8. Get the specific document from collection
    public static void main(String[] args) {

        // To establish the mongodb connection with java.
        MongoClient client = MongoClients.create("mongodb://localhost:27017/");
        var db =client.getDatabase("railwaydb");
        client.getDatabase("railwaydb");
        System.out.println(db.getName());

        // db.createCollection("staff");

        System.out.println("Railway ban gya ");


        MongoDatabase database = client.getDatabase("advancedjava01");
        System.out.println();
        System.out.println(database.getName());



        // To fetch the collection from the database
        for(String name: db.listCollectionNames()){
            System.out.println(name);
        }




        //To get name
        var userCollections = database.getCollection("Users");



        // To drop the collection
        userCollections.drop();

        // Create new collection using java
        //database.createCollection("faculty");
        // System.out.println("Collection ban gaya");



        // To insert user data in users
        var userCollection =db.getCollection("users");



        // create new document for users Collection
        var userDoc =new Document();
        userDoc.append("name","Tushar Singh");
        userDoc.append("Age","2");
        userDoc.append("Phone number","8957256338");

        userCollection.insertOne(userDoc);




    }
}
