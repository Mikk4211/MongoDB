import com.mongodb.*;

public class MongoDB_Connector {

    public void connect() {
        try{
            // Create a Mongo client
            MongoClient mongo = new MongoClient("localhost", 27017);
        } catch (Exception e){
            e.printStackTrace();
        }

    }



}
