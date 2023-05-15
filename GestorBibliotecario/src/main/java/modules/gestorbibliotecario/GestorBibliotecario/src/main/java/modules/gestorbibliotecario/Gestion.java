package modules.gestorbibliotecario;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Gestion() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

/*!Proxima Actualicacion
    public void editarLibro(int indice, Libro libro) {
        if (indice >= 0 && indice < libros.size()) {
            libros.set(indice, libro);
        } else {
            System.out.println("Índice inválido");
        }
    }
*/
    public void eliminarLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            libros.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    public List<Libro> obtenerLibros() {
        return libros;
    }
/*!Proxima Actualicacion
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void editarUsuario(int indice, Usuario usuario) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.set(indice, usuario);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void eliminarUsuario(int indice) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void devolverPrestamo(int indice) {
        if (indice >= 0 && indice < prestamos.size()) {
            prestamos.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public List<Prestamo> obtenerPrestamos() {
        return prestamos;
    }
*/
}
