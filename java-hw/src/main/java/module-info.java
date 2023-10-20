module com.example.javahw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javahw to javafx.fxml;
    exports com.example.javahw;
}