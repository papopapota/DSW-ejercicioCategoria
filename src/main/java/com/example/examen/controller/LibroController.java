package com.example.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Curso;
import com.example.examen.entity.Libro;
import com.example.examen.service.LibroService;

@RestController
@RequestMapping("/rest/Libro")
public class LibroController {
    @Autowired
    private LibroService service;

    @GetMapping("/listaTodos/{categoria}")
	@ResponseBody
	public List<Libro> lista(@PathVariable String categoria){
		return service.listaLibro(categoria);
	}
}
