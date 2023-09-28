package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Pessoa;
import repositorio.PessoaRepository;

public class PessoaController {
	
	public void cadastrarPessoa() {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\n CADASTRO DE PESSOA:\n");
			Pessoa pessoa = new Pessoa();
			pessoa.setId(UUID.randomUUID());
			System.out.println("NOME DA PESSOA...:");
			pessoa.setNome(scanner.nextLine());
			System.out.println("INFORME O CPF...:");
			pessoa.setCpf(scanner.nextLine());
			PessoaRepository pessoaRepository = new PessoaRepository();
			pessoaRepository.create(pessoa);
			System.out.println("cadastrado com sucesso!");
			
			
			
			
		} catch (Exception e) {
			System.out.println("\n FALHA AO CADASTRAR "+ e.getMessage());
			
		}
		finally {
			
			scanner.close();
			
			
			
		}
		
		
		
	}

}
