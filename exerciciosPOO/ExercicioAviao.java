package exerciciosPOO;

/* Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. */

public class ExercicioAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.modelo =  "Boeing 777-9";
		aviao.marca = "Boeing Commercial Airplanes";
		aviao.tipo = "Transporte";
		aviao.capacidadeMaxPassageiros =  384;
		
		aviao.dadosAviao();

	}

}
