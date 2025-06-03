package lista11;

import java.util.Scanner;

public class Lista11Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para obter o fatorial: ");
		int numero = sc.nextInt();
		int calculo = 1 ;
		
		for(int valor = numero; valor > 0; valor--) {
			
			calculo = valor * calculo;
			
		}
		System.out.println(calculo);
		sc.close();
	}

}
