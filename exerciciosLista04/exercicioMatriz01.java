package exerciciosLista04;
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

import java.util.Random;

public class exercicioMatriz01 {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		int [][] N1 = new int [4][6], N2 = new int [4][6], SOMA = new int [4][6], DIFERENÇAS = new int [4][6];
		
		for(int l=0; l<4; l++) {
			for(int c=0; c<6; c++){
				N1[l][c]=sorteio.nextInt(100);
				N2[l][c]=sorteio.nextInt(100);
				SOMA[l][c]= N1[l][c] + N2[l][c];
				DIFERENÇAS[l][c]= N1[l][c] - N2[l][c];
			}
		}
		System.out.println("Matriz com as somas de N1 e N2:\n");
		for(int l=0; l<4; l++) {
			for(int c=0; c<6; c++){
				System.out.print(SOMA[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("\nMatriz com as diferenças de N1 e N2:\n");
		for(int l=0; l<4; l++) {
			for(int c=0; c<6; c++){
				System.out.print(DIFERENÇAS[l][c] + " | ");
			}
			System.out.println();
		}
		

	}

}
