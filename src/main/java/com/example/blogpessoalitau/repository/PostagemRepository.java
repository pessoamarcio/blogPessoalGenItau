package com.example.blogpessoalitau.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.blogpessoalitau.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	//public List<Postagem> findAllbyTituloContainingIngnoreCase(String titulo);
	
}
