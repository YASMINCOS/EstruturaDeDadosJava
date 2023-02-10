
public class Main {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaComeco("Ana");
		System.out.println(lista);
		lista.adicionaComeco("Maria");
		System.out.println(lista);
		lista.adicionaComeco("Carina");
		System.out.println(lista);
		lista.adicionaComeco("Joaquina");
		System.out.println(lista);
		
		//adicionar final
		lista.adiciona("Marina");
		System.out.println(lista);
		
		lista.adicionar(0, "Bianca");
		System.out.println(lista);
		
		lista.remover(0);
		System.out.println(lista);
		
	}
}
