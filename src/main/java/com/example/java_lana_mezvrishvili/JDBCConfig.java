package com.example.java_lana_mezvrishvili;

import javafx.event.ActionEvent;

import java.sql.*;

public class JDBCConfig {
    public static final String  DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    public static final String USER = "root";
    public static final String PASSWORD = "lu$159";

    private static Connection connection;
    private static Statement statement;

    static {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            }
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }

    public static Statement getStatement() throws SQLException {
        try {
            statement = connection.createStatement();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        return statement;
    }
}
