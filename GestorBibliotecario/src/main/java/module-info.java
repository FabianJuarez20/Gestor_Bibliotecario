module modules.gestorbibliotecario {
    requires javafx.controls;
    requires javafx.fxml;


    opens modules.gestorbibliotecario to javafx.fxml;
    exports modules.gestorbibliotecario;
}