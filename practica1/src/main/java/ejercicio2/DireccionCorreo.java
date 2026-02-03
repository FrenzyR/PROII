package ejercicio2;

public class DireccionCorreo {
    static final String SERVIDOR = "esei.uvigo.es";
    String nombre;
    String apellidos;
    String usuario;
    String servidor;

    public DireccionCorreo(String nombre, String apellidos, String usuario, String servidor){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.servidor = servidor;
    }

    @Override
    public String toString() {
        return this.apellidos+", "+this.nombre+":"+this.usuario+"@"+this.servidor;
    }

    
}
