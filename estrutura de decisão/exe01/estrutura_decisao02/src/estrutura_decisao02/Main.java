package estrutura_decisao02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Vari�veis
		int numero;
		
		//Entrada de dados
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();
		sc.close();
		
		//Processamento
		if ((numero % 2) == 0) {
			System.out.println("O n�mero digitado � par!");
		}
		else {
			System.out.println("O n�mero digitado � �mpar!");
		}

	}

}
