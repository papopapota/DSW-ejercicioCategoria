package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Curso;
import com.example.examen.repository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	
	@Override
	public List<Curso> listaCurso() {
		return repository.findAll();
	}

	@Override
	public Curso buscarPorId(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Curso> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub

		List<Curso> cursos = null;
		try {
			cursos = repository.findByNombre(nombre);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cursos;
	}

}
