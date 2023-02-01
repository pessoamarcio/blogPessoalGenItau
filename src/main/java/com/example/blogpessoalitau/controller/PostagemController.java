package com.example.blogpessoalitau.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogpessoalitau.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	private PostagemRepository postagemRepository;

@GetMapping
public ResponseEntity<List<Postagem>> getAll{
	return ResponseEntity.ok(postagemRepository.findAll());
}

}
