module com.example.resistron {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resistron to javafx.fxml;
    exports com.example.resistron;
}