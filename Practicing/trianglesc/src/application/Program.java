package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle X = new Triangle();
		Triangle Y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		X.a = sc.nextDouble();
		X.b = sc.nextDouble();
		X.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		Y.a = sc.nextDouble();
		Y.b = sc.nextDouble();  
		Y.c = sc.nextDouble();
		
		double areaX = X.area();
		double areaY = Y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		char larger = (areaX > areaY)? 'X' : 'Y';
		System.out.println("Larger area: " + larger);
		
		sc.close();
	}

}
