import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Variáveis
	int valor01, valor02;
	
	//Entrada de dados
	System.out.println("Digite o primeiro número: ");
	valor01 = sc.nextInt();

	System.out.println("Digite o segundo número: ");
	valor02 = sc.nextInt();
	sc.close();
	
	//Processamento
	if ((valor01 % valor02) == 0 || (valor02 % valor01) == 0) {
		System.out.println("S�o m�ltiplos");
	} else {
		System.out.println("N�o s�o m�ltiplos");
	}
	}
}
