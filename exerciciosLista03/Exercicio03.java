package exerciciosLista03;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int idade=0, vinteUmMenos = 0, cinquentaMais = 0;
		
		while(idade!=-99) {
			System.out.println("Digite sua idade: ");
			idade = leitor.nextInt();
				if(idade<21) {
					vinteUmMenos++;
				}else if(idade>50) {
					cinquentaMais++;
				}
		}
		System.out.println(vinteUmMenos + " pessoas possuem menos de 21 anos.");
		System.out.println(cinquentaMais + " pessoas possuem mais de 50 anos.");
	}
}
