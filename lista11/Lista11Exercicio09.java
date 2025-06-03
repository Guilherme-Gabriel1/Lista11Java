package lista11;

import java.util.Scanner;

public class Lista11Exercicio09 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcule a média de 10 números fornecidos pelo usuário.");
		
		int contadora = 0;
		int soma = 0;
		int media = 0;
		
		for(contadora = 0; contadora < 10; contadora++) {
			System.out.println("Digite 10 numeros: ");
			int numeros = sc.nextInt();
	
			soma += numeros;
			
		}
		media = soma / 10;
		System.out.println("media é igual a: " +media);
		
		sc.close();
	}

}
