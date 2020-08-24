package com.kevinbrendo.uml.umltest;

import com.kevinbrendo.uml.umltest.domain.Categoria;
import com.kevinbrendo.uml.umltest.domain.Produto;
import com.kevinbrendo.uml.umltest.repositories.CategoriaRepository;
import com.kevinbrendo.uml.umltest.repositories.ProdutoRepository;
import com.kevinbrendo.uml.umltest.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class UmltestApplication implements CommandLineRunner {

	@Autowired
	public CategoriaRepository categoriaRepository;
	@Autowired
	public ProdutoRepository produtoRepository;

	public static void main(String[] args) {

		SpringApplication.run(UmltestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");

		Produto prod1 = new Produto(null, "Computador", 2000.00);
		Produto prod2 = new Produto(null, "Impressora", 800.00);
		Produto prod3 = new Produto(null, "Mouse", 90.00);

		cat1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
		cat2.getProdutos().addAll(Arrays.asList(prod2));

		prod1.getCategorias().addAll(Arrays.asList(cat1));
		prod2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		prod3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
	}
}
