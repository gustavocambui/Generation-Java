package exerciciosLista02;

//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		float n1, n2, n3, numero1=0, numero2=0, numero3=0;
		System.out.println("Digite três números:");
		n1 = leitor.nextFloat();
		n2 = leitor.nextFloat();
		n3 = leitor.nextFloat();
		
		if(n1>n2 && n1>n3){
			numero3= n1;
				if(n2>n3){
					numero1= n3;
					numero2= n2;
				}
				else{
					numero1= n2;
					numero2= n3;
				}
		}
		else if(n2>n1 && n2>n3) {
			numero3= n2;
				if(n1>n3){
					numero1= n3;
					numero2= n1;
				}
				else{
					numero1= n1;
					numero2= n3;
				}
		}
		else if(n3>n1 && n3>n2) {
			numero3= n3;
				if(n1>n2){
					numero1= n2;
					numero2= n1;
				}
				else{
					numero1= n1;
					numero2= n2;
				}
		}
		System.out.println("Números em ordem crescente: " + numero1 + " - " + numero2 + " - " + numero3 + " - ");
	}
}
