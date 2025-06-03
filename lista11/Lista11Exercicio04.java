package lista11;

import java.util.Scanner;

public class Lista11Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para obter a tabuada: ");
		int numero = sc.nextInt();
		
		for (int tabuada = 0; tabuada < 11 ; tabuada++) {
		
			System.out.println(numero+ " X " +tabuada+ " = " +numero * tabuada);
			
		}
		sc.close();
	}

}
