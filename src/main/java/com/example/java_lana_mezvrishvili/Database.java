package com.example.java_lana_mezvrishvili;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;

import java.sql.Connection;
import java.sql.SQLException;

public class Database {

    private static final String CREATE_TABLE = "CREATE TABLE FORM(" +
            "ID INTEGER AUTO_INCREMENT NOT NULL," +
            "CURRENT_LOCATION VARCHAR(100)," +
            "LANDING_LOCATION VARCHAR(100)," +
            "CURRENT_DAT INTEGER," +
            "RETURN_DAT INTEGER," +
            "PASSENGERS INTEGER," +
            "PRICE INTEGER," +
            "PRIMARY KEY(ID))";

    public static void createTable() throws SQLException {
        try {
            JDBCConfig.getStatement().executeUpdate(CREATE_TABLE);
            System.out.println("Create table in given database");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void insert(DatabaseInf info){
        String INSERT_TABLE = "INSERT INTO FORM(CURRENT_LOCATION, LANDING_LOCATION,CURRENT_DAT, RETURN_DAT,PASSENGERS, PRICE)" +
                "VALUES('" + info.getCurrentLocation()+"'," + info.getLandingLocation() +"," + info.getCurrentDat() +"," + info.getReturnDat() +"," + info.getPassengers() +"," + info.getPrice()+ ")";

        try{
            JDBCConfig.getStatement().executeUpdate(INSERT_TABLE);
            System.out.println("Table updated");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
