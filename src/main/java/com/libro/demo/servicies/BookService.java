package com.libro.demo.servicies;

import java.util.List;

import com.libro.demo.modelolibro.Libro;

public interface BookService {
    Libro getlLibro(int id);
    List<Libro> getlLibros();
    Libro nuevLibro(Libro libro);
    Libro getLibro(int id);
}
   

    