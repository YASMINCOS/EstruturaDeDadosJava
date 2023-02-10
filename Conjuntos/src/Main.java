import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Conjuntos conjunto = new Conjuntos ();
		
		conjunto.adicionar("Ana");
		System.out.println(conjunto);
		conjunto.adicionar("AnaLice");
		System.out.println(conjunto);
		conjunto.adicionar("Bianca");
		System.out.println(conjunto);
		conjunto.adicionar("Bruna");
		System.out.println(conjunto);
		conjunto.adicionar("Gabi");
		System.out.println(conjunto);
		conjunto.adicionar("Gabi");
		System.out.println(conjunto);
		conjunto.adicionar("Guilherme");
		System.out.println(conjunto);
		conjunto.remover("Ana");
		System.out.println(conjunto);
		conjunto.adicionar("Yasmin");
		System.out.println(conjunto);
		
		Set<String> conjuntoJva= new HashSet<>();
		conjuntoJva.add("maria");
		conjuntoJva.add("Paulo");
		System.out.println(conjuntoJva);
		
		String x = "Mariana";
		x.hashCode();
		System.out.println("Mariana".hashCode());
	}
}
