import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String cupom;
		double vlrCompra;
		String nmdesc;
		
		System.out.println("Informe o valor da compra: ");
		vlrCompra = leitor.nextDouble();
		nmdesc =  "DIADEFESTA";
	
		System.out.println("Se o cliente tiver um cupom, informe o código: ");
		cupom = leitor.next();
		
		if (cupom == nmdesc) {
			vlrCompra = (vlrCompra * (float)0.97); 
		}		
			
		System.out.println("O valor da compra será " + vlrCompra + ".");
		leitor.close();

	}

}
