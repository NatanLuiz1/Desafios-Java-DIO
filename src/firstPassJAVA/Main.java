package firstPassJAVA;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static int TIMER = 8*60;
	private static int ATRASO_MAX = 60;

	public static void main(String[] args) throws IOException{
		Scanner leitor = new Scanner(System.in);
		
		try {
			while (leitor.hasNext()) {
				String[] relogio = leitor.nextLine().split(":");    		
				int hora = Integer.parseInt(relogio[0]);
				int min = Integer.parseInt(relogio[1]);
				System.out.println("Atraso maximo: " + getMaxAtraso(hora, min));
			}
			
		} catch (Exception e) {
			System.out.println("Números inválidos!");
		}
		leitor.close();

	}
	
	public static int getMaxAtraso(int hora, int minuto) {
		return Math.max(ATRASO_MAX + (hora * 60 + minuto) - TIMER, 0);
	}

}
