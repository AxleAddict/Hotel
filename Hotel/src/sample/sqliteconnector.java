package sample;

import java.sql.*;
public class sqliteconnector {
    public static Connection connector() {
        try {
            Class.forName("org.sqite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\amogh\\Documents\\signup.db");
            System.out.println(conn);
            return conn;
        } catch (Exception e) {
            return null;
        }
    }
}



