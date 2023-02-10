
public class NoBi<T extends Comparable <T>> {

	private T conteudo;
	private NoBi<T> noEsquerda;
	private NoBi<T> noDireita;
	
	
	public NoBi(T conteudo) {
		this.conteudo = conteudo;
		this.noEsquerda = this.noDireita = null;
	}
	
	
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public NoBi<T> getNoEsquerda() {
		return noEsquerda;
	}
	public void setNoEsquerda(NoBi<T> noEsquerda) {
		this.noEsquerda = noEsquerda;
	}
	public NoBi<T> getNoDireita() {
		return noDireita;
	}
	public void setNoDireita(NoBi<T> noDireita) {
		this.noDireita = noDireita;
	}
	@Override
	public String toString() {
		return "NoBi [conteudo=" + conteudo + "]";
	}
	
	
}
