
public class Main {

	public static void main(String[] args) {
		
		Listas lista= new Listas();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		System.out.println("Tamanho:" + lista.getTamanho() );
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		System.out.println(lista.get(0).getProximo());
		System.out.println(lista.get(1).getProximo());
		System.out.println(lista.get(2).getProximo());
		System.out.println(lista.get(3).getProximo());




		
	}
}
