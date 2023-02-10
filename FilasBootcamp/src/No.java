
public class No {

	private Object object;
	private No referencia;
	
	public No(Object object) {

		this.referencia = null;
		this.object = object;
	}
	
	public No() {
		
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getReferencia() {
		return referencia;
	}

	public void setReferencia(No referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
}
