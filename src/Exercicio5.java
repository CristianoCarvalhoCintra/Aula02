import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int peso1, peso2, peso3, menor;
		
		System.out.println("Informe o peso da lata 1: ");
		peso1 = leitor.nextInt();
	
		System.out.println("Informe o peso da lata 2: ");
		peso2 = leitor.nextInt();
	
		System.out.println("Informe o peso da lata 3: ");
		peso3 = leitor.nextInt();
	
		if (peso1 < peso2) {
			menor = peso1;
		}else {
			menor = peso2;
		}
		
		if (peso3 < menor) {
			menor = peso3;
		}
		
		System.out.println("O Drone deve carregar a lata com o peso " + menor + ".");
		leitor.close();

	}

}
