package org.example.clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Libro> librosPrestados = new ArrayList<>();

    public Usuario(String nombre, List<Libro> librosPrestados) {
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getLibrosPrestados() {
        for (Libro libro : librosPrestados) {
            System.out.println("libro Prestado a: " + getNombre());
            System.out.println("libro Nombre: " + libro.getTitulo());
            System.out.println("libro Autor: " + libro.getAutor());
            System.out.println("libro devuelto: " + libro.isDisponible());
            System.out.println("--------------------------------------");
        }
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
