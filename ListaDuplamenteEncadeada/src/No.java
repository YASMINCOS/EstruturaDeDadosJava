
public class No<T> {

	private T conteudo;
	private No<T> noProxi;
	private No<T> noPrev;
	
	public No() {
		
	}

	public No(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getNoProxi() {
		return noProxi;
	}

	public void setNoProxi(No<T> noProxi) {
		this.noProxi = noProxi;
	}

	public No<T> getNoPrev() {
		return noPrev;
	}

	public void setNoPrev(No<T> noPrev) {
		this.noPrev = noPrev;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

	
	
	
}
