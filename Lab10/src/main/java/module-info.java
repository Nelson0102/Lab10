module com.example.lab10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires com.google.gson;


    opens com.example.lab10 to javafx.fxml;
    exports com.example.lab10;
}