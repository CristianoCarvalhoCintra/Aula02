import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int tempoFilme;
		double resultHoras;
		int resultSegundos;
		System.out.println("Informe o tempo de filme em minutos: ");
		tempoFilme = leitor.nextInt();
		resultHoras = tempoFilme /  60.0;
		resultSegundos = tempoFilme * 60;
		
		System.out.println("O filme dura " + resultHoras + " horas, ou " + resultSegundos + " segundos.");
						
		leitor.close();
	}

}
