package firstPassJAVA.Desafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		var escolha = new ArrayList<Integer>();
		var N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			var aux = leitor.nextInt();
			if(aux !=0) {
			escolha.add(aux);
			}
		}
		System.out.println(getMelhorDecisao(escolha));
		leitor.close();
    }
	public static int getMelhorDecisao (List<Integer> escolha) {
		return escolha.indexOf(Collections.min(escolha)) + 1;
	}
}

	


