package JavaTech;

import java.util.Scanner;

public class AulaArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aula Array Vetor
		
		float n1, n2, n3, somaMedia = 0, mg;
		int x;
		float [] media = new float[4];
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < 4; x ++) {
			System.out.println("\n\tAluno: " + (x+1));
			System.out.println("Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			somaMedia += media[x];
			
		}
		mg = somaMedia /4;
		System.out.printf("\nA média geral da turma foi de : %.2f" , mg);
		
		for(x = 0; x < 4; x ++) {
			System.out.printf("\nMedia do aluno: %d foi de: %.2f",(x+1), media[x]);
			
		}		
	}
}