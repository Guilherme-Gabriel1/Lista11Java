package lista11;

public class Lista11Exercicio08 {

	public static void main(String[] args) {
		
		System.out.println("Imprima os quadrados dos números de 1 a 20.");

		int contadora = 0;
	
		for(int numero = 1; numero < 21; numero++) {
			
			int quadrado = numero * numero;
			contadora++;
			
			System.out.println("O quadrado de "+contadora+" é "+quadrado);
		}
	}

}
