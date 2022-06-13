package exerciciosPOO;

/* Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console. */

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
