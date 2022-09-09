package agenciaDeViajes;

public class Tema {
    private Libro[] descripcion;

    public Tema(Libro[] descripcion) {
        this.descripcion = descripcion;
    }

    public Tema() {

    }

    public Libro[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Libro[] descripcion) {
        this.descripcion = descripcion;
    }

}
