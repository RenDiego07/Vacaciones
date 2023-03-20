module ec.edu.espol.hilos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.hilos to javafx.fxml;
    exports ec.edu.espol.hilos;
}
