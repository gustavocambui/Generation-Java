package exerciciosLista03;
/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		Random sorteio = new Random();
		int par=0, impar=0;
		for(int cont=0; cont<10; cont++) {
			int numero = sorteio.nextInt(101);
			 	if(numero%2==0) {
			 		par++;
			 		System.out.println(numero + " é par.");
			 	}else {
			 		impar++;
			 		System.out.println(numero + " é ímpar.");
			 	}
		}
		System.out.println("Quantidade de números pares: " + par );
		System.out.println("Quantidade de números ímpares: " + impar );
	}
}
