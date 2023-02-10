import java.util.LinkedList;
import java.util.List;

public class Filas {

	//primeiro que entra e o primeiro que sai
	private List<String> alunos = new LinkedList<>();
	
	public void adicionar(String aluno) {
		alunos.add(aluno);
	}
	public String remover() {
		return alunos.remove(0);
	}
	
	public boolean vazia() {
		return alunos.isEmpty();
	}
	@Override
	public String toString() {
		return alunos.toString();
	} 
}
