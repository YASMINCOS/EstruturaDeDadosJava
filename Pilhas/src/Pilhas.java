import java.util.LinkedList;
import java.util.List;

public class Pilhas {

	private List<String> nomes = new LinkedList<String>();
	public void insere(String nome) {
		nomes.add(nome);
	}
	
	public String remover() {
		return nomes.remove(nomes.size() - 1);
		
	}
	
	public boolean vazia() {
		return nomes.isEmpty();
	}
	@Override
	public String toString() {
		
		return nomes.toString();
	}
}
