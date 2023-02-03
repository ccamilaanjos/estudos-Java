import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		// Faça um programa que leia N números reais e armazene-os em um vetor.
		// Em seguida, mostrar na tela o maior número do vetor (supor não haver
		// empates). Mostrar também a posição do maior elemento, considerando a
		// primeira posição como 0 (zero).

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] numeros = new double[n];
		double maior = numeros[0];
		int posicao = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
