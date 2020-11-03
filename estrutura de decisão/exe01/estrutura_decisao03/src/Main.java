import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//VariÃ¡veis
	int valor01, valor02;
	
	//Entrada de dados
	System.out.println("Digite o primeiro nÃºmero: ");
	valor01 = sc.nextInt();

	System.out.println("Digite o segundo nÃºmero: ");
	valor02 = sc.nextInt();
	sc.close();
	
	//Processamento
	if ((valor01 % valor02) == 0 || (valor02 % valor01) == 0) {
		System.out.println("São múltiplos");
	} else {
		System.out.println("Não são múltiplos");
	}
	}
}
