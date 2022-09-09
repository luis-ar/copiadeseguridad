import java.util.Scanner;

//problema4
public class App {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public App() {
    }

    public App(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;

    }

    public String Getautor() {
        return autor;
    }

    public void Setautor(String autor) {
        this.autor = autor;

    }

    public int Getejemplares() {
        return ejemplares;
    }

    public void setejemplares(int ejeplares) {
        this.ejemplares = ejeplares;

    }

    public int Getprestados() {
        return prestados;
    }

    public void setprestados(int prestados) {
        this.prestados = prestados;

    }

    public String Gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;

    }

    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;

        } else {
            prestado = false;
        }
        return prestado;
    }

    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    @Override
    public String toString() {

        return "titulo: " + titulo + " \nautor: " + autor + " \nejemplares: " + ejemplares + " \nprestados: "
                + prestados;
    }
}
