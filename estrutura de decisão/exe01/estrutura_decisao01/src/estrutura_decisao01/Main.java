package estrutura_decisao01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variáveis
		int entrada;
		
		//Entrada de dados
		System.out.println("Digite um número:");
		entrada = sc.nextInt();
		sc.close();
		
		//Processamento
		if (entrada > 0) {
			System.out.println("O número digitado é positivo!");
		}
		else if (entrada == 0) {
			System.out.println("O número digitado é neutro.");
		}
		else {
			System.out.println("O número digitado é negativo!");
		}
	}

}
