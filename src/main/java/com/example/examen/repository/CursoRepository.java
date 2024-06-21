package com.example.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.examen.entity.Curso;



public interface CursoRepository extends MongoRepository<Curso, Integer> {
    public Curso findByIdCurso(int id);

    @Query("{ 'idCurso' : ?0 }")
    public abstract Curso buscaCursoPorId(int idCurso);

    //@Query("{'nombre' : {$regex: '?0.'} }") //inicien con el parametro
    //@Query("{'nombre' : {$regex: '?0.' , '$options' : 'i'} }") //inicien con el parametro y insensible a mayusculas y minusculas

    //@Query("{'nombre' : {$regex: '^?0'} }") //inicien con el parametro
    @Query("{'nombre' : {$regex: '?0'} }")
    public abstract List<Curso> findByNombre(String nombre);
}
