import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		/* Faça um programa que leia um número inteiro positivo N (máximo = 10)
		e depois N números inteiros e armazene-os em um vetor. Em seguida,
		mostrar na tela todos os números negativos lidos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		while(n > 10 || n < 1) {
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
		}
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
