package ar.edu.um.biblioteca.Models;
import lombok.Data;
import java.time.LocalDate;

@Data
public class Prestamo {
    private Libro libroPrestado;
    private LocalDate fechaPrestamo;

    //Constructor
    public Prestamo(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
        this.fechaPrestamo = LocalDate.now();
    }
}
