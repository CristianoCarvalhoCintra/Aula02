import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int anonasc, result;
		System.out.println("Informe seu ano de nascimento: ");
		anonasc = leitor.nextInt();
		result = 2021 - anonasc;
		System.out.println("Em 31 de dezembro de 2021 voc� ter� " + result + " anos.");
		
		//System.out.println("Em 31 de dezembro de 2021 voc� ter� " + (2021 - anonasc) + " anos.");
				
		leitor.close();
	}

}
