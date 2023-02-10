
public class ListaLigada {

	private Celula primeiro = null;
	private int totalElemento = 0;
	private Celula ultimo = null;
	public void adicionaComeco(Object elemento) {
		Celula nova = new Celula (elemento, primeiro);
		this.primeiro = nova;
		
		if(this.totalElemento == 0) {
			this.ultimo = this.primeiro;
		}
		
		this.totalElemento ++;
	}
	@Override
	public String toString() {
		if(this.totalElemento == 0) {
			return "[]";
		}
		Celula atual = primeiro;
		StringBuilder builder = new StringBuilder("[");
		
		for (int i =0 ; i <totalElemento ; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
	public void adiciona(Object elemento) {
		if(this.totalElemento == 0) {
		   adicionaComeco(elemento);
		}else {
			Celula nova = new Celula (elemento , null);
			this.ultimo.setProximo(nova);
			this.ultimo = nova;
			this.totalElemento ++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElemento;
	}
	private Celula pegaCelula(int posicao) {
		if ( posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao nao existe");
		}
		Celula atual = primeiro;
		
		for (int i = 0; i< posicao ; i ++) {
			atual = atual.getProximo();
		}
		return atual ;
		
		
	}
	public void adicionar (int posicao, Object elemento) {
		if (posicao == 0) {
			adicionaComeco(elemento);
		}else if (posicao == this.totalElemento) {
			adiciona(elemento);
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula novo = new Celula( elemento, anterior.getProximo());
			anterior.setProximo(novo);
			
			this.totalElemento ++;
		}
		
	}
	public void remover(int posicao) {
		if(this.totalElemento >0) {
			throw new IllegalArgumentException("lista vazia");
		}
		this.primeiro = this.primeiro.getProximo();
		this.totalElemento ++;
		
		if(this.totalElemento == 0) {
			this.ultimo = null;
		}
	}
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object o) {
		return false;
	}
}
