
public class ListasDuplamenteEncadeadas <T>{

	
	private No<T> primeitroNo;
	private No<T> ultimoNo;
	
	private int tamanhoLista = 0;
	
	public ListasDuplamenteEncadeadas() {
		primeitroNo = null;
		ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	private No <T> getNo(int index){
		No<T> noAuxiliar = primeitroNo;
		
		for(int i= 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProxi();
		}
		return noAuxiliar;
	}
	
	public void add(T elemento) {
		No<T> novoNo = new No<> (elemento);
		novoNo.setNoProxi(null);
		novoNo.setNoPrev(ultimoNo);
		if (primeitroNo == null) {
			primeitroNo = novoNo;
		}
		if (ultimoNo != null ) {
			ultimoNo.setNoProxi(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista ++;
	}
	
	public void add(int index, T elemento) {
		No<T> noAuxiliar = getNo(index);
		No<T> novoNo = new No<>(elemento);
		novoNo.setNoProxi(noAuxiliar);
		
		if( novoNo.getNoProxi() != null) {
			novoNo.setNoPrev(noAuxiliar.getNoPrev());
			novoNo.getNoProxi().setNoPrev(novoNo);
		
		}else {
			novoNo.setNoPrev(ultimoNo);
			ultimoNo = novoNo;
		}
		if(index == 0) {
			primeitroNo = novoNo;
		}else {
			novoNo.getNoPrev().setNoProxi(novoNo);
		}
		tamanhoLista ++;
	}
	
	public void remove(int index) {
		
		if (index == 0){ 
			primeitroNo = primeitroNo.getNoProxi();
			if (primeitroNo != null) {
				primeitroNo.setNoPrev(null);
			}
		}else {
			No<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrev().setNoProxi(noAuxiliar.getNoProxi());
			
			if (noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProxi().setNoPrev(noAuxiliar.getNoPrev());
			}else {
				ultimoNo = noAuxiliar;
			}
		}
		
		this.tamanhoLista --;
		
	}
	
	public int size() {
		return this.tamanhoLista;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = primeitroNo;
		
		for (int i = 0; i< size(); i++) {
			strRetorno += "[No{conteudo" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProxi();
		}
		strRetorno += null;
		return strRetorno;
	}
	
	
}
