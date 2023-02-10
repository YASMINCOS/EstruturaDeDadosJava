import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjuntos {

	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	public Conjuntos(){
		for (int i=0 ; i <26 ; i++) {
			tabela.add(new LinkedList<String>());
			
		}
	}
	public void adicionar (String palavra) {
		if (!contem(palavra)) {
			int indice = calculaIndiceTabela(palavra);
			List <String> lista = tabela.get(indice);
			lista.add(palavra);
		}
	}
	private boolean contem (String palavra) {
		int indice = calculaIndiceTabela(palavra);
		return tabela.get(indice).contains(palavra);
	}
	
	private int calculaIndiceTabela(String palavra) {
		return palavra.toLowerCase().charAt(0)%26;
	}
	public void remover (String palavra) {
		if (contem(palavra)) {
			 int indice = calculaIndiceTabela(palavra);
			 List <String> lista = tabela.get(indice);
			 lista.remove(palavra);
		}
	}
	@Override
	public String toString() {
		return tabela.toString();
	}
}
