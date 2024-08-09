import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Random;

public class MongodbHotelBookingSystem {

    // create hotel booking java application with mongodb
    //1. create the client for establish the connection
    //2. create database and collection (HotelBookingDB BookingCollection)
    //3. Create bookings documents (No of rooms ,No.of adults , checkin date ,hotelName ,checkoutDate,room preference,meal)and insert document into collection
    //4. Update booking documents
    //5. Access all bookings documents
    //6. Delete the booking documents
    public static void main(String[] args) {

        //configure the maven in your projects and add mongodb dependency

        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        // create a database
        var db = mongoClient.getDatabase("hotelBookingSystem");


        // add booking info
        //db.createCollection("bookingCollection");
        var bookingCollection = db.getCollection("bookingCollection");

        //     ArrayList<Document> bookings = new ArrayList<>();


//       var bookingdoc = new Document();
//        var bookingdoc1 = new Document();
//       Random rn = new Random();
//
//        bookingdoc.append("roomNo","01");
//        bookingdoc.append("bookingID",rn.nextInt(99999));
//        bookingdoc.append("hotelName","ABCDE");
//        bookingdoc.append("userName","Tushar Singh");
//        bookingdoc.append("userMobile","123243433");
//        bookingdoc.append("checkinDate","27/12/2024");
//        bookingdoc.append("checkoutDate","29/12/2024");
//        bookingdoc.append("noOfDays","2");
//        bookingdoc.append("price","2100");
//        bookingdoc.append("roomPrefernce","River Face");
//        bookingdoc.append("meal",true);
//        bookings.add(bookingdoc);
//
//        bookingdoc1.append("roomNo","01");
//        bookingdoc1.append("bookingID",rn.nextInt(99999));
//        bookingdoc1.append("hotelName","ABCDEFG");
//        bookingdoc1.append("userName","Rishi Singh");
//        bookingdoc1.append("userMobile","12324343388");
//        bookingdoc1.append("checkinDate","28/12/2024");
//        bookingdoc1.append("checkoutDate","30/12/2024");
//        bookingdoc1.append("noOfDays","3");
//        bookingdoc1.append("price","2700");
//        bookingdoc1.append("roomPrefernce","River Face");
//        bookingdoc1.append("meal",true);
//        bookings.add(bookingdoc1);
//
//        // to insert the document into bookingCollection

//        bookingCollection.insertMany(bookings);

//
//        // to update the single documents


 //  bookingCollection.updateOne(new Document("userName","Tushar Singh"),new Document("$set",new Document("meal",false)));


//   bookingCollection.updateMany(new Document("userName","Tushar Singh"),new Document("$set",new Document("noOfDays",34)));

//   bookingCollection.updateOne(new Document("userName","Rishi Singh"),new Document("$set",new Document("price",3400)));

        // to update the multiple document (DATA)

//   bookingCollection.updateOne(new Document("username", "Rishi Singh"), new Document("$set", new Document("roomPrefernce", "balcony side ")));
//        Document doc = new Document();
//        doc.append("noOfDays", "30");
//        doc.append("price", "28900");
//        doc.append("hotelName", "TAZ");
//
//        bookingCollection.updateOne(new Document("username", "Rishi Singh"), new Document("$set", doc));

        // delete one document

        bookingCollection.deleteOne(new Document("bookingID",89875));
        bookingCollection.deleteMany(new Document("username","Tushar Singh"));

    }
}
