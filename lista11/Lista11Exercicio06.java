package lista11;

import java.util.Scanner;

public class Lista11Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("sequência de Fibonacci.");
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		
		System.out.print(primeiroNumero+ " - " +segundoNumero+ " - ");
		
		for(int contadora = 0; contadora < 8; contadora++) {
			
			int soma = primeiroNumero + segundoNumero;
			System.out.print(soma+ " - ");
			
			primeiroNumero = segundoNumero;
			segundoNumero = soma;
			
		}
		
		sc.close();
	}

}
