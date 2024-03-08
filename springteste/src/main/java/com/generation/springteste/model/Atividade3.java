package com.generation.springteste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Criando a segunda lista - meus objetivos BSM
@Entity
@Table(name = "tb_objetivos")
public class Atividade3 {

	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//Objetivo
	@NotBlank(message = "O atributo objetivo é obrigatório!") //Not null
	@Size(min = 5, max = 100, message = "O atributo objetivo deve conter de 05-100 caracteres") //Tamanho
	private String objetivo;

	//Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
}
