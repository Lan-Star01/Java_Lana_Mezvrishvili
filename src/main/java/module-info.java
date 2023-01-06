module com.example.java_lana_mezvrishvili {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_lana_mezvrishvili to javafx.fxml;
    exports com.example.java_lana_mezvrishvili;
}