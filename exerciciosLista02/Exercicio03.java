package exerciciosLista02;
/*3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int idade;
		System.out.println("Digite sua idade:");
		idade = leitor.nextInt();
			if(idade>=10 && idade<=14) {
				System.out.println("Categoria: infantil.");
			}
			else if(idade>=15 && idade<=17) {
				System.out.println("Categoria: juvenil.");
			}
			else if(idade>=18 && idade<=25) {
				System.out.println("Categoria: adulto.");
			}
			else {
				System.out.println("Idade fora das categorias estabelecidas.");
			}
	}

}
