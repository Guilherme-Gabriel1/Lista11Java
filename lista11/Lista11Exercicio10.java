package lista11;

public class Lista11Exercicio10 {

	public static void main(String[] args) {

		        int contadorPrimos = 0;

		        System.out.println("Números primos entre 1 e 100:");

		        for (int num = 2; num <= 100; num++) {
		            int divisores = 0;

		            for (int i = 1; i <= num; i++) {
		                if (num % i == 0) {
		                    divisores++;
		                }
		            }

		            if (divisores == 2) {
		                System.out.print(num + " ");
		                contadorPrimos++;
		            }
		        }

		        System.out.println("Total de números primos entre 1 e 100: " + contadorPrimos);
		       
		    }
		}

