package exerciciosPOO;

/* Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console. */

public class ExercicioProdutosEletronicos {

	public static void main(String[] args) {
		
		ProdutosEletronicos produto = new ProdutosEletronicos();
		
		produto.tipo = "Notebook";
		produto.cor = "Preto";
		produto.marca = "Del";
		produto.valor = 3456;
		
		produto.dadosProduto();

	}

}
