
public class Vetores {

	public static void main(String[] args) {
		//uma variavel guarda apenas uma variavel ao mes o tempo
		//int x=3;
		//System.out.println("Valor do primeiro x " + x);
		//x=4;
		//System.out.println("Valor do segundo x " + x);
		//vetor=lista
		//vetores possuem posições, sendo possivel armazenar varios valores
		//declarando vetor
		int [] vetor= new int [10];
		vetor[0]=3;
		vetor[1]=4;
		vetor[2]=8;
		vetor[3]=13;
		vetor[4]=22;
		vetor[5]=51;
		vetor[6]=33;
		vetor[7]=12;
		vetor[8]=98;
		System.out.println("Imprimindo Vetores...");
		//System.out.println(vetor[0]);
		//System.out.println(vetor[1]);
		//System.out.println(vetor[3]);
		//System.out.println(vetor[7]);
		//length-puxa o tamanho do vetor<, pois não temos 10 posicoes
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		//[I@1c4af82c-impressao, tentando converter em string(referencia na memoria)
		

	}
}
