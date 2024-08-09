package org.example;

import org.example.clases.Libro;
import org.example.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", true);
        Libro libro2 = new Libro("El alquimista", "Paulo coelo", true);
        Libro libro3 = new Libro("100 años de soledad", "Gabriel Garcia Marques", true);
        Libro libro4 = new Libro("Un mundo feliz", "Auldos Huclay", true);

        List<Libro> LibrosPrestadosUsuario1 = new ArrayList<>();
        LibrosPrestadosUsuario1.add(libro1);
        LibrosPrestadosUsuario1.add(libro4);

        //setear el estado del libro a prestado
        libro1.setDisponible(false);
        libro4.setDisponible(false);

        //setear valor a libro devuelto
        libro1.setDisponible(true);
//        libro4.setDisponible(true);

        Usuario usuario1 = new Usuario("Diego Guevara", LibrosPrestadosUsuario1);

        List<Libro> LibrosPrestadosUsuario2 = new ArrayList<>();
        LibrosPrestadosUsuario1.add(libro2);
        LibrosPrestadosUsuario1.add(libro3);

        Usuario usuario2 = new Usuario("Lisbet Rosales", LibrosPrestadosUsuario2);

        usuario1.getLibrosPrestados();

    }
}