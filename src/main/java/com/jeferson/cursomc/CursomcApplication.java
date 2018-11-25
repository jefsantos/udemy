package com.jeferson.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeferson.cursomc.domain.Categoria;
import com.jeferson.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 =  new Categoria(null, "informatica");
		Categoria cat2 =  new Categoria(null, "escritorio");
		Categoria cat3 =  new Categoria(null, "agencia");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2, cat3));
		
		
	}
}
