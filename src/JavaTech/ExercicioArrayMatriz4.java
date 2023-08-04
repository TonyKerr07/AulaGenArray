package JavaTech;

import java.util.Scanner;

public class ExercicioArrayMatriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Array Matriz 4
		
		float [][] notas = new float[10][4];
		float [] media = new float[10];
		float somanota;
		int i, j;
		
		Scanner leia = new Scanner(System.in);
		
		for (i=0;i<10;i++) {
			System.out.println("Aluno " + (i+1) +": ");
			somanota = 0;
			for (j=0;j<4;j++) {
				System.out.println("Digite a nota " + (j+1) + ": ");
				notas[i][j] = leia.nextInt();	
			
				somanota += notas[i][j];
				
			}
			
			media[i] = (somanota / 4);
		
		}
		
		for (i=0;i<10;i++) {
			System.out.printf("\nMédia aluno %d = %.2f", (i+1), media[i]);
			
		}
		
		
		
		
		
	}

}
