package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Curso;


public interface CursoService {

	public abstract List<Curso> listaCurso();
	
	public abstract Curso buscarPorId(int id);

	public abstract List<Curso> buscarPorNombre(String nombre);
}
