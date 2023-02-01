package com.example.blogpessoalitau.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "o atributo título é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo texto deve conter 10 e no máximo 1000 caracteres.")
	private String titulo;
	
	@NotBlank(message = "Por favor, digite um texto!")
	@Size(min = 10, max = 1000, message = "Por favor entrar com texto entre 10 e no máximo 1000 caracteres.")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
		
}
