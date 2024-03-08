package com.generation.springteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.springteste.model.Atividade2;
import com.generation.springteste.model.Atividade3;
import com.generation.springteste.repository.Atividade2Repository;
import com.generation.springteste.repository.Atividade3Repository;


@RestController
@RequestMapping("/atividades") //Endpoint localhost:8080/atividades
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AtividadeController {
	
	//Realizando a atividade 1 - Imprimir o Hello World
	@GetMapping("/hello-world") //Endpoint localhost:8080/atividades/hello-world
	public String helloWorld(){
		return "Hello World!!!";
	}
	
	//Realizando a atividade 2 - Imprimir a lista BSM da Generation
	@Autowired
	private Atividade2Repository atividade2Repository;
	
	@GetMapping("/lista-bsm") //Endpoint localhost:8080/atividades/lista-bsm
	public ResponseEntity<List<Atividade2>> getAll1(){
		return ResponseEntity.ok(atividade2Repository.findAll());
	}
	
	//Realizando a atividade 3 - Imprimir meus objetivos BSM
	@Autowired
	private Atividade3Repository atividade3Repository;
	
	@GetMapping("/objetivos") //Endpoint localhost:8080/atividades/objetivos
	public ResponseEntity<List<Atividade3>> getAll(){
		return ResponseEntity.ok(atividade3Repository.findAll());
	}
	
}