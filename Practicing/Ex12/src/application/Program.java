package application;

import java.util.Scanner;
import entities.Renter;

public class Program {
	
	public final static int n = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Renter[] room = new Renter[n];
				
		int rents = 0;

		String name, email;
		int number;
		
		System.out.print("How many rooms will be rented? ");
		while(rents < 1 || rents > n) {
			rents = sc.nextInt();
		}
		
		for(int i = 0; i < rents; i++) {
			System.out.printf("\nRent #%d:%n", (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			number = sc.nextInt();
			
			room[number] = new Renter(name, email, number);
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < room.length; i++) {
			if(room[i] != null) {
				System.out.println(i + room[i].toString());
			}
		}
		
		sc.close();
	}
	
}
