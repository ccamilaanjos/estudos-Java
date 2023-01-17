package bot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Bot {
	
	public static void clip(String text) {
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
	}
	
	public static void copypaste() throws AWTException {
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public static void enter() throws AWTException {
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws IOException, AWTException {
		Robot robot = new Robot();
		String[] text = new String[10];
		Scanner sc = new Scanner(System.in);
		int semester = -1;
		
		text[0] = "chrome";
		text[1] = "https://ads.ifba.edu.br/";
		text[2] = "Apresentação";
		text[3] = "Semestre-1";
		text[4] = "Semestre-2";
		text[5] = "Semestre-3";
		text[6] = "Semestre-4";
		text[7] = "Semestre-5";
		text[8] = "Semestre-6";
		
		while(semester < 0 || semester > 6) {
			System.out.println("Digite o número do semestre: ");	
			semester = sc.nextInt();
			if(semester < 0 || semester > 6) {
				System.out.println("Semestre inválido.");
			}
		}
		sc.close();
		
		robot.delay(1000);
		enter();
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		
		robot.delay(200);
		clip(text[0]); // chrome
		copypaste();
		robot.delay(200);
		enter();
		robot.delay(1000);
		
		clip(text[1]); // url
		copypaste();
		robot.delay(400);
		
		switch (semester) {
		case 0:
			clip(text[2]); // home
			break;
		case 1:
			clip(text[3]);
			break;
		case 2:
			clip(text[4]);
			break;
		case 3:
			clip(text[5]);
			break;
		case 4:
			clip(text[6]);
			break;
		case 5:
			clip(text[7]);
			break;
		case 6:
			clip(text[8]);
			break;
		}
		
		copypaste();
		robot.delay(100);
		enter();
	}
}
