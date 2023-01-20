import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter horaAtual = DateTimeFormatter.ofPattern("HH");
		int hora = Integer.parseInt(horaAtual.format(agora));
		
		if(hora <= 12) {
			System.out.println("Bom dia");
		}
		else if(hora > 12 && hora <= 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
	}
}
