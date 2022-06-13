package exerciciosPOO;

/* Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
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
