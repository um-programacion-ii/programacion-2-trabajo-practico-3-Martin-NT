package ar.edu.um.biblioteca.Models;
import ar.edu.um.biblioteca.Enums.Estado;
import lombok.*;

@Data
@AllArgsConstructor
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private Estado estado = Estado.DISPONIBLE;

    // Constructor personalizado
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
}
