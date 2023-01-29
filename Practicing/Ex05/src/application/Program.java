package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?: ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			account = new BankAccount(accountNumber, holderName, sc.nextDouble());
		}
		else {
			account = new BankAccount(accountNumber, holderName);			
		}
				
		System.out.println("\nAccount data:\n" + account.accountData());
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("\nUpdated account data:\n" + account.accountData());
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("\nUpdated account data:\n" + account.accountData());
		
		
		sc.close();
	}
	
}
