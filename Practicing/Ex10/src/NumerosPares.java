import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// Faça um programa que leia N números inteiros e armazene-os em um vetor.
		// Em seguida, mostre na tela todos os números pares, e também a quantidade
		// de números pares.
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int qtdPares = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "  ");
				qtdPares++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = "+ qtdPares);
		
		sc.close();

	}

}
