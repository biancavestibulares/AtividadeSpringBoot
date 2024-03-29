package com.generation.springteste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Criando a primeira lista - lista BSM da Generation
@Entity
@Table(name = "tb_lista_bsm")
public class Atividade2 {
	
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Nome
	@NotBlank(message = "O atributo nomeBSM é obrigatório!") //Not null
	@Size(min = 5, max = 100, message = "O atributo nomeBSM deve conter de 05-100 caracteres") //Tamanho
	private String nomeBSM;

	//Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeBSM() {
		return nomeBSM;
	}

	public void setNomeBSM(String nomeBSM) {
		this.nomeBSM = nomeBSM;
	}
	
}
