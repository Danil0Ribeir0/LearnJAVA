package exe3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja instanciar uma pessoa ou aluno?");
		System.out.print("Digite 1 para pessoa e 2 para aluno: ");
		int move = sc.nextInt();
		System.out.println("");
		
		if (move == 1) {
			System.out.print("Digite seu nome: ");
			String nome = sc.next();
			System.out.print("Digite sua idade: ");
			int idade = sc.nextInt();
			System.out.println("");
			
			System.out.println("Informações Pessoais:");
			Pessoa p = new Pessoa(nome, idade);
			
		} else if (move == 2) {
			System.out.print("Digite seu nome: ");
			String nome = sc.next();
			System.out.print("Digite sua idade: ");
			int idade = sc.nextInt();
			System.out.print("Digite seu curso: ");
			String curso = sc.next();
			System.out.println("");
			
			System.out.println("Informações Pessoais:");
			Aluno a = new Aluno(nome, idade, curso);
			
		} else {
			System.out.println("Escolha uma opção existente.");
		}
		
		sc.close();
	}
}
