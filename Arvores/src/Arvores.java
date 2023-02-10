
public class Arvores {

	//Armazenam os dados em relação a dependecia
	//SISTEMAS DE ARQUIVOS
	//BANCO DE DADOS
	
	//Arvore de Busca Binaria
	//Posicao dos Nos
	//Maiores a direita
	//Menores a esquerda
	
	//OPERAÇÃO INSERÇÃO
	//COMPARAÇÃO DE VALORES
	
	//EXCLUSÃO
	//EXCLUINDO A RAIZ- MSUBSTIRTUIR PELO MAIOR NO A ESQUERDA
	
	//EXIBIÇÃO
	
	//IN-ORDEM
	public void showTree(NoBi noAtual) {
		if( noAtual !=null) {
			showTree(noAtual.noEsq);
			System.out.println(noAtual.conteudo);
			showTree(noAtual.noDireita);
		}
	}
	
	//ATRAVESAMENTO
	//PRE-ORDEM
	public void showTree(NoBi noAtual) {
		if( noAtual !=null) {
			System.out.println(noAtual.conteudo);
			showTree(noAtual.noEsq);
			showTree(noAtual.noDireita);
		}
	}
	
	//POS ORDEM
	public void showTree(NoBi noAtual) {
		if( noAtual !=null) {
			showTree(noAtual.noEsq);
			showTree(noAtual.noDireita);
			System.out.println(noAtual.conteudo);
		}
	}
}
