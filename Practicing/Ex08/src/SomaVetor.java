import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		// - Imprimir todos os elementos do vetor
		// - Mostrar na tela a soma e a média dos elementos do vetor
		
Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double soma = 0.0;
		double media;
		
		while(n < 1) {
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
		}
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		
		System.out.println("\nVALORES:");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
		}
		
		System.out.println("\nSOMA: " + soma);
		media = soma / vetor.length;
		System.out.printf("MEDIA: %.2f", media);
		
		sc.close();

	}

}
