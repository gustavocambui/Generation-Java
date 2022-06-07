package ExerciciosLista01;

/*"Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;

public class ExercicioOperadores01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, idade;
		
		System.out.println("Digite sua idade em anos, meses e dias: ");
		
		idadeAnos = entrada.nextInt();
		idadeMeses = entrada.nextInt();
		idadeDias = entrada.nextInt();
		idadeAnos*= 365;
		idadeMeses*= 30;
		idade = idadeAnos + idadeMeses + idadeDias;
		
		System.out.println("Você já viveu " + idade + " dias.");
		
		
	}
}
