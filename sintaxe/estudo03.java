// Fibonacci recursivo
public class estudo03 {
	public static void main(String[] args) {
		int num = 6; // Número do elemento na sequência
		
		System.out.println("O " + num + "o elemento da sequência de Fibonacci é " + fib(num));
		// System.out.println("");
	}
	
	public static int fib(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}
		else {
			return fib(num - 2) + fib(num - 1);
		}
	}
}
