package JavaTech;

import java.util.Scanner;

public class AulaArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aula Array Matriz
		
		int [][] numeros = new int[3][2];
		int linha, coluna, somaNumeros = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha = 0; linha < 3; linha ++) {
			for(coluna = 0; coluna < 2; coluna ++) {
				System.out.println("\nEntre com um numero: ");
				numeros [linha][coluna] = leia.nextInt();
				
			}
			
		}
		for (linha = 0; linha < 3; linha ++) {
			for(coluna = 0; coluna < 2; coluna ++) {
				somaNumeros += numeros [linha][coluna];
				
			}
		}
		System.out.println("\nA soma dos numeros é: " + somaNumeros);
		
		
	}

}
