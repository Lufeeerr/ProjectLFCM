public class Libro extends Biblioteca{
    private int ISBN;
    private String Titulo;
    private String Autor;
    private String Editoria;
    private String Categoria;
    private int NumEjemplares;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditoria() {
        return Editoria;
    }

    public void setEditoria(String editoria) {
        Editoria = editoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getNumEjemplares() {
        return NumEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        NumEjemplares = numEjemplares;
    }
}
