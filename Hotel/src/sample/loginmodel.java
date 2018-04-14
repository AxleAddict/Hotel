package sample;
import java.sql.*;

public class loginmodel {

    Connection connection;

    public loginmodel(){
        connection = sqliteconnector.connector();
        if(connection == null){
            System.out.println("not connected");
        }
    }

    public boolean isdbconnected() {
        try{
            return !connection.isClosed();
        }catch (Exception e){
            return false;
        }
    }
}
