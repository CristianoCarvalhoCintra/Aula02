import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("Digite a dist�ncia em cm: ");
		distancia = leitor.nextInt();
		
		if (distancia < 70) {
			System.out.println(" Rob� ATIVADO!!!");
		} else {
			System.out.println(" Rob� DESATIVADO!!!");
		}
		leitor.close();

	}

}
