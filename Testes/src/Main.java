import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int n,s,i,t,m ;
		
		System.out.println("Digite o valor de N");
		n=scanner.nextInt();
		
		if (n>0) {
			s = 0;
			i = 1;
			while (i <=n) {
				System.out.println("digite a temperatura");
				t = scanner.nextInt();
				s = s +t;
				i = i +1;
				break;
			}
			m = s /n;
			System.out.println(m);
			
			
		}
		else {	
			System.out.println("N deve ser maior que zero");
		}
	}
}
