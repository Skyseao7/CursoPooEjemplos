package CursoPOO.Herencia;

public class Jefe extends Persona{
    int id_jefe;
    String nombre_jefe;
    public Jefe(int id_persona, String nombre, String apellido, String distrito, String telefono, int id_jefe,
            String nombre_jefe) {
        super(id_persona, nombre, apellido, distrito, telefono);
        this.id_jefe = id_jefe;
        this.nombre_jefe = nombre_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }
    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }
    public String getNombre_jefe() {
        return nombre_jefe;
    }
    public void setNombre_jefe(String nombre_jefe) {
        this.nombre_jefe = nombre_jefe;
    }

    
}
