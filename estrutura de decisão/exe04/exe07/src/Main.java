import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double eixoX, eixoY;
		eixoX = sc.nextDouble();
		eixoY = sc.nextDouble();
		
		if (eixoX > 0 && eixoY > 0) {
			System.out.println("Q1");
		}
		else if (eixoX < 0 && eixoY > 0) {
			System.out.println("Q2");
		}
		else if (eixoX < 0 && eixoY < 0) {
			System.out.println("Q3");
		}
		else if (eixoX > 0 && eixoY < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}

	}

}
