package exerciciosPOO;

/*Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class ExercicioCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Lucas Ferreira";
		cliente.dataNascimento = "23/04/1997";
		cliente.telefone = "11 991345789";
		cliente.endere�o = "Rua Alencar Cruz";
		
		cliente.dadosCliente();

	}

}
