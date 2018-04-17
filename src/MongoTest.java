public class MongoTest {

    public static void main(String[] args) {

        /*MongoDB_Connector connect = new MongoDB_Connector();
        connect.connect();*/

        MongoDB_RetrieveData data = new MongoDB_RetrieveData();
        data.getCollection2(); // Kan både fungere med .getCollection() og .getCollection2()

    }
}