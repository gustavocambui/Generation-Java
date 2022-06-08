package exerciciosLista03;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)*/

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int pessoas=0, feminino=0, masculino=0, outros=0, opcao, fCalma=0, fNervosa=0, fAgressiva=0, mCalmo=0, mNervoso=0, mAgressivo=0;
		int oCalmx=0, oNervosx=0, oAgressivx=0;
		
		while(pessoas!=2) {
			System.out.println("Digite a op��o correspondente a seu sexo : 1-feminino / 2-masculino / 3-Outros");
			opcao = leitor.nextInt();
			if(opcao==1) {
				feminino++;
				System.out.println("Digite a op��o correspondente a seu principal temperamento: 1-calmo / 2-nervoso / 3-agressivo");
				opcao = leitor.nextInt();
				 	if(opcao==1) {
				 		fCalma++;
				 	}else if(opcao==2) {
				 		fNervosa++;
				 	}else {
				 		fAgressiva++;
				 	}
			opcao=0;
			}
			else if(opcao==2) {
				masculino++;
				System.out.println("Digite a op��o correspondente a seu principal temperamento: 1-calmo / 2-nervoso / 3-agressivo");
				opcao = leitor.nextInt();
				 	if(opcao==1) {
				 		mCalmo++;
				 	}else if(opcao==2) {
				 		mNervoso++;
				 	}else {
				 		mAgressivo++;
				 	}
			opcao=0;
			}
			else if(opcao==3) {
				outros++;
				System.out.println("Digite a op��o correspondente a seu principal temperamento: 1-calmo / 2-nervoso / 3-agressivo");
				opcao = leitor.nextInt();
				 	if(opcao==1) {
				 		oCalmx++;
				 	}else if(opcao==2) {
				 		oNervosx++;
				 	}else {
				 		oAgressivx++;
				 	}
			opcao=0;
			}
		pessoas++;
		}
		System.out.println("N�mero de entrevistados do sexo feminino: " + feminino);
		System.out.println("N�mero de entrevistados do sexo feminino com temperamento calmo: " + fCalma);
		System.out.println("N�mero de entrevistados do sexo feminino com temperamento nervoso: " + fNervosa);
		System.out.println("N�mero de entrevistados do sexo feminino com temperamento agressivo: " + fAgressiva);
		System.out.println("\nN�mero de entrevistados do sexo masculino: " + masculino);
		System.out.println("N�mero de entrevistados do sexo masculino com temperamento calmo: " + mCalmo);
		System.out.println("N�mero de entrevistados do sexo masculino com temperamento nervoso: " + mNervoso);
		System.out.println("N�mero de entrevistados do sexo masculino com temperamento agressivo: " + mAgressivo);
		System.out.println("\nOutros: " + outros);
		System.out.println("Outros com temperamento calmo: " + oCalmx);
		System.out.println("Outros com temperamento nervoso: " + oNervosx);
		System.out.println("Outros com temperamento agressivo: " + oAgressivx);

	}

}
