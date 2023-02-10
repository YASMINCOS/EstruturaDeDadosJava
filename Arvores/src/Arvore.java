
public class Arvore<T extends Comparable<T>> {

	
	private NoBi<T> raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public void inserir(T conteudo) {
		NoBi<T> novoNo = new NoBi<>(conteudo);
		raiz = inserir(raiz, novoNo);
	}
	
	private NoBi<T> inserir(NoBi<T> atual, NoBi<T> novoNo){
		if(atual == null) {
			return novoNo;
					
		}else if(novoNo.getConteudo().compareTo(atual.getConteudo())<0) {
			atual.setNoEsquerda(inserir(atual.getNoEsquerda(),novoNo));
		}else {
			atual.setNoDireita(inserir(atual.getNoDireita(),novoNo));
		}
		return null;
	}
	
	public void exibirInOrdem(){
		System.out.print("\n Exibindo em ordem");
		exibirInOrdem(this.raiz);
	}
	private void exibirInOrdem(NoBi<T> atual) {
		if( atual !=null) {
			exibirInOrdem(atual.getNoEsquerda());
			System.out.print(atual.getConteudo() + ",");
			exibirInOrdem(atual.getNoDireita());
		}
	}
	
	public void exibirPosOrdem(){
		System.out.print("\n Exibindo pos ordem");
		exibirPosOrdem(this.raiz);
	}
	private void exibirPosOrdem(NoBi<T> atual) {
		if( atual !=null) {
			exibirPosOrdem(atual.getNoEsquerda());
			exibirPosOrdem(atual.getNoDireita());
			System.out.print(atual.getConteudo() + ",");
		}
	}
	
	public void exibirPreOrdem(){
		System.out.print("\n Exibindo pre ordem");
		exibirPreOrdem(this.raiz);
	}
	private void exibirPreOrdem(NoBi<T> atual) {
		if( atual !=null) {
			System.out.print(atual.getConteudo() + ",");
			exibirPreOrdem(atual.getNoEsquerda());
			exibirPreOrdem(atual.getNoDireita());
			
		}
	}
	public void remover(T conteudo) {
		try {
			NoBi<T> atual = this.raiz;
			NoBi<T> pai = null;
			NoBi<T> filho = null;
			NoBi<T> temp = null;
			
			while(atual != null && !atual.getConteudo().equals(temp)) {
				pai = atual;
				if(conteudo.compareTo(atual.getConteudo()) <0) {
					atual = atual.getNoEsquerda();
				}else {
					atual = atual.getNoDireita();
				}
				
			}
			if (atual == null) {
				System.out.println("Conteudo não encontrado. Bloco try");
			}
			if (pai == null) {
				if(atual.getNoDireita() == null) {
					this.raiz = atual.getNoEsquerda();
				}else if(atual.getNoEsquerda() == null) {
					this.raiz = atual.getNoDireita();
				}else {
					for (temp = atual, filho = atual.getNoEsquerda(); filho.getNoDireita() != null; temp = filho, filho = filho.getNoEsquerda()) 
						
					if (filho != atual.getNoEsquerda()) {
						temp.setNoDireita(filho.getNoEsquerda());
						filho.setNoEsquerda(raiz.getNoEsquerda());
					}
					filho.setNoDireita(raiz.getNoDireita());
					raiz = filho;
				}
			
			
			}else if(atual.getNoDireita() == null) {
				if (pai.getNoEsquerda() == atual) {
					pai.setNoEsquerda(atual.getNoEsquerda());
				}else {
					pai.setNoDireita(atual.getNoEsquerda());
				}
			}else if(atual.getNoEsquerda() == null) {
				if (pai.getNoEsquerda() == atual) {
					pai.setNoEsquerda(atual.getNoDireita());
				}else {
					pai.setNoDireita(atual.getNoDireita());
				}
			}else {
				for(temp = atual, filho = atual.getNoEsquerda();
						filho.getNoDireita() != null;
						temp = filho, filho = filho.getNoDireita()) {
					if (filho!= atual.getNoEsquerda()) {
						temp.setNoDireita(filho.getNoEsquerda());
						filho.setNoEsquerda(atual.getNoEsquerda());
					}
					filho.setNoDireita(atual.getNoDireita());
					
					if (pai.getNoEsquerda() == atual) {
						pai.setNoEsquerda(filho);
					}else {
						pai.setNoDireita(filho);
					}
				}
			}
			
		} catch (NullPointerException erro) {
			System.out.println("Conteudo não encontrado.Bloco catch");
		}
	}
}
