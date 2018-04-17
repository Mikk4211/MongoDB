import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MongoDB_RetrieveData {

    MongoClient mongo = new MongoClient("localhost", 27017);
    MongoDatabase database = mongo.getDatabase("users");
    MongoCollection collection = database.getCollection("users");

    List<Document> documents = (List<Document>) collection.find().into(new ArrayList<Document>());

    public void getCollection(){
        try {
            FindIterable<Document> iterDoc = collection.find();
            int i = 1;
            Iterator it = iterDoc.iterator();

            while(it.hasNext()) {
                System.out.println(it.hasNext());
                i++;
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
