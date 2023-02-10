
public class Main {
	
	public static void main(String[] args) {
		
		//atribuicao de tipo primitivo
		int inta = 1;
		int intb = inta;
		
		System.out.println("inta " + inta + " intb "+ intb);
		inta = 2;
		System.out.println("inta " + inta + " intb " + intb);
		
		
		//atribuicao de objeto- referencia de memoria
		MeuObj obja = new MeuObj (1);
		MeuObj objb = obja;
		
		System.out.println("obja " + obja + " objb " + objb);
		obja.setNum(2);
		System.out.println("obja " + obja + " objb " + objb);
		
	}


}
