import ar.edu.um.biblioteca.Enums.Estado;
import ar.edu.um.biblioteca.Models.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroTest {
    Libro libro;

    @BeforeEach
    void setUp() {
        // Crea un libro
        libro = new Libro("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
    }

    @Test
    void testCrearLibroValido() {
        // Verifica que los atributos se asignaron bien con assertEquals que verifica si dos valores son iguales.
        assertEquals("978-3-16-148410-0", libro.getIsbn());
        assertEquals("Clean Code", libro.getTitulo());
        assertEquals("Robert C. Martin", libro.getAutor());
        assertEquals(Estado.DISPONIBLE, libro.getEstado());
    }

    @Test
    void testCambioEstado() {
        // Verifica que el estado inicial del libor sea disponible
        assertEquals(Estado.DISPONIBLE, libro.getEstado());

        // Cambia el estado a PRESTADO
        libro.setEstado(Estado.PRESTADO);

        // Verifica que se haya cambiado el estado del libro a PRESTADO
        assertEquals(Estado.PRESTADO, libro.getEstado());
    }


}
