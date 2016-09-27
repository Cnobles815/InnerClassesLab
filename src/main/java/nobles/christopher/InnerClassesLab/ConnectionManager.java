package nobles.christopher.InnerClassesLab;
import java.util.ArrayList;

/**
 * Created by christophernobles on 9/27/16.
 */
public class ConnectionManager {


   static ArrayList<Connection> connectionsList = new ArrayList<Connection>();

    static Connection addConnection(Connection connection){
        connectionsList.add(connection);
        return connection;
    }

    ConnectionManager(){



        if (ConnectionManager.connectionsList.size() > 10);
        return;

    }

   private class ManagedConnection implements Connection{
        public int getIP() {
            return 0;
        }

        public int getPort() {
            return 0;
        }

        public int getProtocol() {

            return 0;
        }

        public String connect() {
            return null;
        }

        public void forProtocol(){

        }
    }
}
