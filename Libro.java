package agenciaDeViajes;

public class Libro {
    private String isbn;
    private String titulo;
    private String editorial;
    private Autor autor;
    private Tema[] tema;

    public Libro() {

    }

    public Libro(String isbn, String titulo, String editorial, Autor autor, Tema[] tema) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.tema = tema;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Tema[] getTema() {
        return tema;
    }

    public void setTema(Tema[] tema) {
        this.tema = tema;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}
