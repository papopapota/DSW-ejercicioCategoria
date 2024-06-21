package com.example.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.examen.entity.Libro;

public interface ILibroRepository extends MongoRepository<Libro, Integer> {
    
    List<Libro> findByCategories(String categoria);
}
