
public class Celula {

	private Object elemento;
	private Celula proximo;
	private Celula anterior;
	
	public Celula(Object elemento) {
		this(null, elemento);
	}
	public Celula getAnterior() {
		return anterior;
	}


	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}


	

	
	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
	
	
}