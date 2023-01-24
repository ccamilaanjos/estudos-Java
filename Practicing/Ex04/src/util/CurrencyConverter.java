package util;

public class CurrencyConverter {
	
	public static double amount(double price, double quantity) {
		double iOF = 0.06 * (quantity * price);
		return iOF + (quantity * price);
	}
}
