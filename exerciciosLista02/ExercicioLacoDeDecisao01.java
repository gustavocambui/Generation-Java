package exerciciosLista02;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class ExercicioLacoDeDecisao01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n1, n2, n3, maior;
		System.out.println("Digite tr�s n�meros inteiros:");
		n1 = entrada.nextInt();
		maior = n1;
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
	    if(n2>n1 && n2>n3){
	    	maior = n2;
	    }
	    else if(n3>n1){
	    	maior = n3;
	    }
	    System.out.println("O maior n�mero �: " + maior);
		
	}

}
