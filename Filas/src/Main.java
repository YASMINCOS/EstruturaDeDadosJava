import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Filas fila = new Filas();
		
		System.out.println(fila.vazia());
		fila.adicionar("Lucas");
		fila.adicionar("Luis");
		System.out.println(fila);
		
		String x1 = fila.remover();
		System.out.println(x1);
		System.out.println(fila);
		System.out.println(fila.vazia());
		
		
		
		Queue<String> filaJava= new LinkedList<>();
		filaJava.add("Camila");
		String x2 =filaJava.poll();
		//imprime que ira sair
		System.out.println(x2);
	}
}
