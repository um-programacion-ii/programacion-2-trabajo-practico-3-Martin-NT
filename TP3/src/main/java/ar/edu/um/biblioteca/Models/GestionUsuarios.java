package ar.edu.um.biblioteca.Models;

import java.util.ArrayList;
import java.util.List;

public class GestionUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();
    private SistemaPrestamos sistemaPrestamos;

    // Constructor
    public GestionUsuarios(SistemaPrestamos sistemaPrestamos) {
        this.sistemaPrestamos = sistemaPrestamos;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorNombreCompleto(String nombre, String apellido) {
        return usuarios.stream()
                .filter(usuario -> usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido))
                .findFirst()
                .orElse(null);
    }

    public void registrarPrestamo(String nombre, String apellido, String isbn) {
        Usuario usuario = buscarUsuarioPorNombreCompleto(nombre, apellido);
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario no encontrado");
        }
        Prestamo prestamo = sistemaPrestamos.prestarLibro(isbn);
        usuario.getHistorialPrestamos().add(prestamo);

    }
}
