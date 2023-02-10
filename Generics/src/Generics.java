
public class Generics {

	//evitae casting excessivo
	//evitar codigos redundates
	//encontrar erros em tempo de compilação
	
	//Unknown Wildcard
	
	public void imprimeLista(List<> lista) {
		for (Object obj: lista) {
			System.out.println(obj);
		}
	}
	
	List<Aluno> minhaLista =  new List <Aluno>();
	imprimeLista(minhaLista);
}
