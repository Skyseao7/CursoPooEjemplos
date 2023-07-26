package CursoPOO.Herencia;


//mother class
public class Persona {
    int id_persona;
    String nombre;
    String apellido;
    String distrito;
    String telefono;
    
    public Persona(int id_persona, String nombre, String apellido, String distrito, String telefono) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.distrito = distrito;
        this.telefono = telefono;
    }

    public int getId_persona() {
        return id_persona;
    }
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

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

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
