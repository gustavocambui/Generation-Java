package exercicioHeranca;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Spike", 13, "auau", "correndo...");
		Cavalo cav1 = new Cavalo("Pangui�o", 23, "hinn in in", "correndo...");
		Preguica p1 = new Preguica("Soneca", 16, "aaaaaaah", "subindo em �rvore");
		
		System.out.println("======== *CACHORRO* ========");
		System.out.println("Nome: " + c1.nome);
		System.out.println("Idade: " + c1.idade);
		System.out.println("Som emitido: " + c1.som);
		System.out.println("A��o: " + c1.acao);
		
		System.out.println("\n======== *CAVALO* ========");
		System.out.println("Nome: " + cav1.nome);
		System.out.println("Idade: " + cav1.idade);
		System.out.println("Som emitido: " + cav1.som);
		System.out.println("A��o: " + cav1.acao);
		
		System.out.println("\n======== *BICHO PREGUI�A* ========");
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Som emitido: " + p1.som);
		System.out.println("A��o: " + p1.acao);
	}

}
