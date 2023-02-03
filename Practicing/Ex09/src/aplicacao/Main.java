package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String nome;
		int idade;
		double altura;
		double alturaMedia = 0.0;
		double menosDezesseis = 0.0;
		
		System.out.print("Quantas pesssoas serão digitadas? ");
		n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			pessoas[i] = new Pessoa(nome, idade, altura);
			
			alturaMedia += pessoas[i].getAltura(); 
			if(pessoas[i].getIdade() < 16) {
				menosDezesseis += 1.0;
			}
		}
		
		alturaMedia = alturaMedia / pessoas.length;
		
		System.out.printf("%nAltura média: %.2f%n", alturaMedia);
		menosDezesseis = (menosDezesseis / pessoas.length) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , menosDezesseis);
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
	
		sc.close();
	}

}
