package com.HelloWorld;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	@GetMapping("/bsmGeneration")
	public List<String> bsmGeneration() {
		List<String> bsmGeneration = new LinkedList<String>();
		bsmGeneration.add("Mentalidade de Crescimento");
		bsmGeneration.add("Persistência");
		bsmGeneration.add("Responsabilidade Pessoal");
		bsmGeneration.add("Orientação ao Futuro");
		bsmGeneration.add("Comunicação");
		bsmGeneration.add("Proatividade");
		bsmGeneration.add("Orientação ao Detalhe");
		bsmGeneration.add("Trabalho em Equipe");
		return bsmGeneration;
	}

	@GetMapping("/objetivosAprendizagem")
	public List<String> objetivosAprendizagem() {
		List<String> objetivosAprendizagem = new LinkedList<String>();
		objetivosAprendizagem.add("Sedimentar conhecimento sobre POO");
		objetivosAprendizagem.add("Aprofundar em estrutura de dados");
		objetivosAprendizagem.add("Finalizar tasks em atraso");
		return objetivosAprendizagem;
	}

}
