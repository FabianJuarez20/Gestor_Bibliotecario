package modules.gestorbibliotecario;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String editorial;

    public Libro(String titulo, String autor, int anioPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
    }
/*!Proxima Acualizacion
    // Getter y Setter para cada propiedad
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
*/
    // Método toString para representar el objeto como cadena de texto
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
