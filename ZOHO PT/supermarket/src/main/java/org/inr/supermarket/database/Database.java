package org.inr.supermarket.database;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/supermarket";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection connection=createConnection();

    public static Connection createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected with Driver");
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("Error Connecting with driver");
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Connection Error");
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}