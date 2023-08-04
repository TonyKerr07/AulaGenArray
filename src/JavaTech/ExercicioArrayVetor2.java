package JavaTech;

import java.util.Scanner;

public class ExercicioArrayVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 2
		
		int [] numeros = new int[10];
		int i;
		Float media, soma = (float) 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com 10 número inteiro: ");
		
		for (i = 0; i < 10; i ++) {
			System.out.println("Número " + (i+1) + ": ");
			numeros [i] = leia.nextInt();
			
			soma += numeros [i];
		
		}	
		
		System.out.println("\nElementos nos índices ímpares: ");
		
		for (i = 0; i < 10; i ++) {	
			if (i %2 != 0) {
				System.out.println(numeros[i]);
				
			}	
		}
		
		System.out.println("\nElementos pares: ");
		
		for (i = 0; i < 10; i ++) {
			if (numeros[i] %2 == 0) {
				System.out.println(numeros[i]);
				
			}
		}	
			
		System.out.printf("\nSoma: %.0f", soma);
		
		media = (soma / 10);
		System.out.printf("\nMédia: %.2f", media);
			
	}

}
