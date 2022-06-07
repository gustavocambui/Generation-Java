package ExerciciosLista01;
/* Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. */

import javax.swing.JOptionPane;

public class ExercicioOperadores02 {
	
	public static void main(String[] args) {
		
		int idade, idadeAnos, idadeMeses, idadeDias;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em dias: "));
		idadeAnos = idade/365;
		idadeMeses = (idade%365)/30;
		idadeDias = (idade%365)%30;
		JOptionPane.showMessageDialog(null, "Você já viveu " + idadeAnos + " ano(s), " + idadeMeses + " meses e " + idadeDias + " dias.");
	}
}
