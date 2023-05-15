package modules.gestorbibliotecario;

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private String correoElectronico;

    public Usuario(String nombre, String apellido, String direccion, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }
/*!Proxima Actualicacion
    // Getter y Setter para cada propiedad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
*/
    // Método toString para representar el objeto como cadena de texto
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
