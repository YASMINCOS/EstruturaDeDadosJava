
public class Listas {
//listas ligadas-nao permite acesso direto
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	public Listas() {
		
	}
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void adicionar(String novoValor) {
		Elemento novoElemento= new Elemento(novoValor);
		if(primeiro == null && ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		}else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
			
		}
		this.tamanho++;

	}
    public void remover(String valorProcurado) {
    	Elemento anterior=null;
		Elemento atual= this.primeiro;
		for(int i=0 ; i<this.getTamanho() ; i++) {
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) {
				
			}
			atual=atual.getProximo();
		}
	}
    public  Elemento get(int posicao) {
		Elemento atual= this.primeiro;
		for(int i=0; i<= posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			
		}
		return atual;
	}
}
