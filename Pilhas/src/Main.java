import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Pilhas pilha= new Pilhas();
		
		System.out.println(pilha.vazia());
		pilha.insere("Ana");
		System.out.println(pilha);
		pilha.insere("Guilherme");
		System.out.println(pilha);
		
		pilha.remover();
		System.out.println(pilha);
		
		pilha.insere("Mari");
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		Stack<String> stack = new Stack<>();
		stack.push("cecilia");
		stack.push("Marcela");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		//peek-indica quem seria retirado, porem não retira!
		String nome = stack.peek();
		System.out.println(nome);
		System.out.println(stack);
	}
}
