package CursoPOO.Herencia;
    //"extendss" means Empleado inherits Persona's attributes
public class Empleado extends Persona{
    int id_empleado;
    String cargo;
    Double sueldo;

    //empty constructor (I delete it cuz it gave me error)

    //constructor with Empleado & Persona attributes
    public Empleado(int id_persona, String nombre, String apellido, String distrito, String telefono, int id_empleado,
            String cargo, Double sueldo) {
        super(id_persona, nombre, apellido, distrito, telefono);
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //Empleado getters & setters
    public int getId_empleado() {
        return id_empleado;
    }
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
