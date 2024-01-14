package ClasesPersonas;

public class Persona {
    private String nombre;
    private String descripcion;
    private boolean estudiando;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.estudiando = true;
    }
    //métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(boolean estudiando) {
        this.estudiando = estudiando;
    }
    //métodos get

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstudiando() {
        return estudiando;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='"  + nombre + '\'' +
                ", descripcion='"  + descripcion + '\'' +
                ", estudiando=" + estudiando +
                '}';
    }
}
