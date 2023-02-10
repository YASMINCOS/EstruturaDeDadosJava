
public class Fila {

	private No referenciaEntradaFila;

	public Fila() {	
		this.referenciaEntradaFila = null;
	}
	
	public void enqueue(No newNo) {
		newNo.setReferencia(referenciaEntradaFila);
		referenciaEntradaFila = newNo;
	}
	
	public No first() {
		if (!isEmpty()) {
			No primeiroNo = referenciaEntradaFila;
			while(true) {
				if (primeiroNo.getReferencia() != null) {
					primeiroNo = primeiroNo.getReferencia();
				}else {
					break;
				}
			}
			
		}
		return null;
	}
	
	public No dequeue() {
		if (!isEmpty()) {
			No primeiroNo = referenciaEntradaFila;
			No noAuxiliar = referenciaEntradaFila;
			while(true) {
				if (primeiroNo.getReferencia() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferencia();
				}else {
					noAuxiliar.setReferencia(null);
					break;
				}
			}
			return primeiroNo;
			
		}
		return null;
	}
	
	private boolean isEmpty() {
		if(referenciaEntradaFila == null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		
		String stringRetorno = "";
		No noAuxiliar = referenciaEntradaFila;
		
		if(referenciaEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]-->";
				if (noAuxiliar.getReferencia() != null) {
					noAuxiliar = noAuxiliar.getReferencia();
				}else {
					stringRetorno += "null";
					break;
				}
			}
		}else {
			stringRetorno = "null";
		}
		
		return stringRetorno;
	}
	
	
}
