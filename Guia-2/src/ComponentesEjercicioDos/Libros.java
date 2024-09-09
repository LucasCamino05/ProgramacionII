package ComponentesEjercicioDos;
import java.util.Objects;

public class Libros {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    // Constructores

    public Libros() {
        this.titulo = null;
        this.precio = 0;
        this.stock = 0;
        this.autor = null;
    }

    public Libros(String titulo, double precio, int stock,Autor autorcito) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        autor = autorcito;
    }

    // Setters y Getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String mostrarLibro(){
        return (this.titulo + autor.)
    }
}
