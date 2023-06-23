public class Capitan {
    //declaracion variables
    private  String nombre;
    private  String apellido;
    private  String matriculaNave;
    //constructor
    public Capitan(String nombre, String apellido, String matriculaNave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNave = matriculaNave;
    }
    //getter y setter
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

    public String getMatriculaNave() {
        return matriculaNave;
    }

    public void setMatriculaNave(String matriculaNave) {
        this.matriculaNave = matriculaNave;
    }

    @Override
    public String toString() {
        return  "Capitan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matriculaNave='" + matriculaNave + '\'' +
                '}';
    }
}
