package modules.gestorbibliotecario;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class HelloController {
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtAutor;
    @FXML
    private TextField txtAnio;
    @FXML
    private TextField txtEditorial;
    @FXML
    private ListView<Libro> listaLibros;

    private final Gestion gestion;

    public HelloController() {
        gestion = new Gestion();
    }

    @FXML
    private void agregarLibro() {
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        int anio = Integer.parseInt(txtAnio.getText());
        String editorial = txtEditorial.getText();
        Libro libro = new Libro(titulo, autor, anio, editorial);
        gestion.agregarLibro(libro);
        actualizarListaLibros();
        limpiarCamposLibro();
    }

    @FXML
    private void eliminarLibro() {
        int indice = listaLibros.getSelectionModel().getSelectedIndex();
        gestion.eliminarLibro(indice);
        actualizarListaLibros();
    }

    private void actualizarListaLibros() {
        listaLibros.getItems().clear();
        listaLibros.getItems().addAll(gestion.obtenerLibros());
    }

    private void limpiarCamposLibro() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtAnio.setText("");
        txtEditorial.setText("");
    }
}