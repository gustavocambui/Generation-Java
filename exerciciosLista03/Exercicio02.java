package exerciciosLista03;
/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		Random sorteio = new Random();
		int par=0, impar=0;
		for(int cont=0; cont<10; cont++) {
			int numero = sorteio.nextInt(101);
			 	if(numero%2==0) {
			 		par++;
			 		System.out.println(numero + " � par.");
			 	}else {
			 		impar++;
			 		System.out.println(numero + " � �mpar.");
			 	}
		}
		System.out.println("Quantidade de n�meros pares: " + par );
		System.out.println("Quantidade de n�meros �mpares: " + impar );
	}
}
