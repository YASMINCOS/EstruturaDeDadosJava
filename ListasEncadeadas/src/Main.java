
public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhalIstaEncadeada = new ListaEncadeada<>();
		
		minhalIstaEncadeada.add("teste1");
		minhalIstaEncadeada.add("teste2");
		minhalIstaEncadeada.add("teste3");
		minhalIstaEncadeada.add("teste4");
		
		System.out.println(minhalIstaEncadeada.get(0));
		System.out.println(minhalIstaEncadeada.get(1));
		System.out.println(minhalIstaEncadeada.get(2));
		System.out.println(minhalIstaEncadeada.get(3));
		
		System.out.println(minhalIstaEncadeada);
		
		System.out.println(minhalIstaEncadeada.remove(3));
		System.out.println(minhalIstaEncadeada);
	}
}
