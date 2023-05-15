package modules.gestorbibliotecario;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }
/*!Proxima Actualicacion
    // Getter y Setter para cada propiedad
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
*/
    // Método toString para representar el objeto como cadena de texto
    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", usuario=" + usuario +
                ", fechaInicio=" + fechaInicio +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}

