
public class Celula {

	private Object elemento;
	private Celula primeiro;
	
	public Celula(Object elemento, Celula proximo) {
		super();
		this.elemento = elemento;
		this.primeiro= proximo;
	}

	
	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return primeiro;
	}

	public void setProximo(Celula proximo) {
		this.primeiro = proximo;
	}
	
	
	
	
}
