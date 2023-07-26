package CursoPOO.Herencia;
    //"extends" means Consultor inherits Persona's attributes
public class Consultor extends Persona{
    String nombre_consultora;
    int num_consultor;

    //constructor with Consultor & Persona atributes
    public Consultor(int id, String nombre, String apellido, String distrito, String telefono, String nombre_consultora,
            int num_consultor) {
        super(id, nombre, apellido, distrito, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    //Consultor getters & setters
    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    
}
