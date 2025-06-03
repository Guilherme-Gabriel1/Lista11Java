package lista11;

public class Lista11Exercicio07 {

	public static void main(String[] args) {
		
		System.out.println("Conte e imprima quantos números divisíveis por 3 existem entre 1 e 50.");

		int contadora = 0;
		
		for(int numero = 1; numero < 51; numero++) {
			
		
			if (numero % 3 == 0) {
				
				contadora++;
			}
		}
		System.out.println("A quantidade de numero que são divisiveis por 3 entre 1 e 50: " +contadora); 
	}

}
