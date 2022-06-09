package exerciciosLista04;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
import java.util.Scanner;*/

public class exercicioVetor01 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner leitor = new Scanner (System.in);
		
		float[] notas = new float[5];
		float maiorNota=0;
			
		System.out.println("Digite as notas:");
			
			for(int cont=0; cont<5; cont++) {
			notas[cont] = leitor.nextFloat();
				if(notas[cont]>maiorNota){
					maiorNota=notas[cont];
				}
			}
		System.out.println("Maior nota: " + maiorNota);
		}

	}

