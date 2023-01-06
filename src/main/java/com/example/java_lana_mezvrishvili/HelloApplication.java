package com.example.java_lana_mezvrishvili;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {

        Database.createTable();

        Text lbl1 = new Text("ქალაქი, აეროპორტი");
        ComboBox comboBox1 = new ComboBox<>();
        comboBox1.getItems().addAll(
                "თბილისი (TBS) საქართველო",
                "ბათუმი (BUS) საქართველო",
                "ქუთაისი (KUT) საქართველო"
        );
        comboBox1.setPromptText("საიდან?");
        //comboBox1.setEditable(true);
        comboBox1.setOnAction(e -> System.out.println("მომხმარებელმა აირჩია: " + comboBox1.getValue()));


        Text lbl2 = new Text("ქალაქი, აეროპორტი");
        ComboBox comboBox2 = new ComboBox<>();
        comboBox2.getItems().addAll(
                "პარიზი (PAR) FRANCE",
                "დიუსელდორფი (DUS) GERMANY",
                "რომი (ROM) ITALY",
                "ამსტერდამი (AMS) NETHERLANDS",
                "ბარსელონა (BCN) SPAIN",
                "ვენა (VIE) AUSTRIA",
                "ბერლინი (BER) GERMANY "
        );
        comboBox2.setPromptText("სად?");
        //comboBox2.setEditable(true);
        comboBox2.setOnAction(e -> System.out.println("მომხმარებელმა აირჩია: " + comboBox2.getValue()));


        Text lbl3 = new Text("გამგზავრება");
        DatePicker datePicker = new DatePicker();
        datePicker.setPromptText("აირჩიე სასურველი დრო");
        datePicker.setOnAction(action -> {
            System.out.println("არჩეული გაფრენის დრო: "+datePicker.getValue());
        });


        Text lbl4 = new Text("დაბრუნება");
        DatePicker datePicker2 = new DatePicker();
        datePicker2.setPromptText("აირჩიე სასურველი დრო");
        datePicker2.setOnAction(action -> {
            System.out.println("არჩეული დაბრუნების დრო: "+datePicker2.getValue());
        });


        Text lbl5 = new Text("მგზავრის ოდენობა");
        Text text = new Text();

        ComboBox<Integer> comboBox5 = new ComboBox<Integer> ();
        comboBox5.getItems().addAll(
                1,
                2,
                3,
                4,
                5,
                6
        );
        comboBox5.setPromptText("მგზავრი");

        //comboBox5.setEditable(true);
        //comboBox5.setOnAction(e -> System.out.println("მომხმარებელმა აირჩია: " + comboBox5.getValue()));
        comboBox5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int price = 2000;
                String result = String.valueOf("სულ თანხა: " + price * comboBox5.getValue());
                text.setText(result);
            }
        });




        Button button = new Button("დაჯავშნა");
        button.setStyle("-fx-background-color: blue; -fx-text-fill: white;");

//////////shesasworebel
// ///////amis gareshe interfeisi mushaobs :/
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                Database.insert(comboBox1,
//                        comboBox2,
//                        comboBox5,
//                        datePicker,
//                        datePicker2,
//                        text);
//            }
//        });


        GridPane gridPane = new GridPane();
        gridPane.setMaxSize(400,200);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(lbl1, 0,0);
        gridPane.add(comboBox1, 1,0);
        gridPane.add(lbl2, 0,1);
        gridPane.add(comboBox2, 1,1);
        gridPane.add(lbl3, 0,2);
        gridPane.add(datePicker, 1,2);
        gridPane.add(lbl4, 0,3);
        gridPane.add(datePicker2, 1,3);
        gridPane.add(lbl5, 0,4);
        gridPane.add(comboBox5, 1,4);
        gridPane.add(text, 1, 5);
        gridPane.add(button,0,7);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}