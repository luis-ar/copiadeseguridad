package agenciaDeViajes;

public class Cliente {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int dni;

    public Cliente() {
        this.nombre = "Luis";
        this.apellido = "Santos";
        this.edad = 4;
        this.dni = 44567;

    }

    public Cliente(String nombre, String apellido, int edad, int dni) {
        this.nombre = "Luis";
        this.apellido = "Santos";
        this.edad = 4;
        this.dni = 44567;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
