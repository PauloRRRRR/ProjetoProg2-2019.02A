package gui.conta.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {
    private Dbconnect(){

    }
    public static Dbconnect getInstance(){
        return new Dbconnect();
    }
    public Connection getConnection(){
        String connect_string = "jdbc:sqlite:data.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connect_string);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
