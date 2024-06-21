package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Libro;
import com.example.examen.repository.ILibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired ILibroRepository libroRepo ;

    @Override
    public List<Libro> listaLibro(String categoria) {
        return libroRepo.findByCategories(categoria);
    }
    
}
