package JavaTech;

import java.util.Scanner;

public class ExercicioArrayVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 1 Array Vetor
		
		int [] numeros = new int[10];
		int i, encontra, posicao=-1;
		
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i < 10; i ++) {
			System.out.println("\nEntre com um número inteiro: ");
			numeros [i] = leia.nextInt();
			
		}
		
		System.out.println("\nEntre com um número inteiro que você deseja encontrar: ");
		encontra = leia.nextInt();
		
		for (i = 0; i <10; i++) {
			if (numeros [i] == encontra) {
				posicao = i;
				
			}	
		}
		
		if (posicao==-1) {
			System.out.println("\nO número " + encontra + " não foi encontrado!");
			
		} else {
			System.out.println("\nO número " + encontra + " está na posição " + posicao + "!");
			
		}
		
	}

}
