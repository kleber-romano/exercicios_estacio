package estrutura_decisao01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Vari�veis
		int entrada;
		
		//Entrada de dados
		System.out.println("Digite um n�mero:");
		entrada = sc.nextInt();
		sc.close();
		
		//Processamento
		if (entrada > 0) {
			System.out.println("O n�mero digitado � positivo!");
		}
		else if (entrada == 0) {
			System.out.println("O n�mero digitado � neutro.");
		}
		else {
			System.out.println("O n�mero digitado � negativo!");
		}
	}

}
