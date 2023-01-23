package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.name = sc.nextLine();
		
		System.out.printf("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.printf("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		
		System.out.print("\nWhich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("\nUpdated data: "  + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
	}
}
