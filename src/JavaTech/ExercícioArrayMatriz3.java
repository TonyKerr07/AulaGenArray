package JavaTech;

import java.util.Scanner;

public class ExercícioArrayMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Array 3
		
		int [][] numeros = new int[3][3];
		int i, j;
		String principal = "", secundaria = "";
		
		Scanner leia = new Scanner(System.in);
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.println("Digite o número " + (i+1) + ", " + (j+1) + " da matriz: ");
				numeros[i][j] = leia.nextInt();	
				
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: ");
		for(i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				if (i==j) {
					principal += numeros[i][j] + " ";
							
				}
			}
		}
		System.out.println(principal);
		
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				if (i+j == 2) {
					secundaria += numeros[i][j] + " ";
					
				}	
			}	
		}
		System.out.println(secundaria);
		
	}

}
