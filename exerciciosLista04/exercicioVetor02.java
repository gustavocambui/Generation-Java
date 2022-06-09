package exerciciosLista04;

import java.util.Locale;
import java.util.Random;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class exercicioVetor02 {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		
		int[] lancamento = new int[10];
		int maiorPontuacao=0;
		float media=0;
		for(int cont=0; cont<10; cont++) {
			lancamento[cont]= sorteio.nextInt(6);
			System.out.println((cont+1) + "� lan�amento: " +  lancamento[cont]);
			media+=lancamento[cont];
			 if(lancamento[cont]>maiorPontuacao){
				 maiorPontuacao=lancamento[cont];
			 }
		}
		System.out.println("\nM�dia dos lan�amentos: "  + (media/10) + "\nMaior pontua��o: " + maiorPontuacao);
	}

}
