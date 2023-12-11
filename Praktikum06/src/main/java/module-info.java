module com.example.praktikum06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.praktikum06 to javafx.fxml;
    exports com.example.praktikum06;
}