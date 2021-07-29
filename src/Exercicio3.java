import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int n1, n2;
		System.out.println("Informe o primeiro número: ");
		n1 = leitor.nextInt();
		System.out.println("Informe o segundo número: ");
		n2 = leitor.nextInt();
	
		System.out.println("N1 = " + n1 + " N2 = " + n2);
		
		n2 = (n1 + n2);
		n1 = (n2 - n1);
		n2 = (n2 - n1);
		
		System.out.println("N1 = " + n1 + " N2 = " + n2);
				
		leitor.close();
	}

}
