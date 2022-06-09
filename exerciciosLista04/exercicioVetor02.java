package exerciciosLista04;

import java.util.Locale;
import java.util.Random;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class exercicioVetor02 {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		
		int[] lancamento = new int[10];
		int maiorPontuacao=0;
		float media=0;
		for(int cont=0; cont<10; cont++) {
			lancamento[cont]= sorteio.nextInt(6);
			System.out.println((cont+1) + "º lançamento: " +  lancamento[cont]);
			media+=lancamento[cont];
			 if(lancamento[cont]>maiorPontuacao){
				 maiorPontuacao=lancamento[cont];
			 }
		}
		System.out.println("\nMédia dos lançamentos: "  + (media/10) + "\nMaior pontuação: " + maiorPontuacao);
	}

}
