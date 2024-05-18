package com.libro.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libro.demo.modelolibro.Libro;
import com.libro.demo.repositorio.BookRepositorio;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepositorio bookRepositorio;

    @Override
    public Libro getlLibro(int id) {
        return bookRepositorio.getLibro(id);
       
    }

    @Override
    public List<Libro> getlLibros() {
        return bookRepositorio.getLibros();

    }

    @Override
    public Libro nuevLibro(Libro libro) {
        throw new UnsupportedOperationException("Unimplemented method 'nuevLibro'");
    }

    @Override
    public Libro getLibro(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'getLibro'");
    }
    
}
