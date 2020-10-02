import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int a, b, c, d, diferenca;

        //Entrada de valores
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        //Processamento
        diferenca = (a * b - c * d);
        sc.close();

        //Saída
        System.out.println("DIFERENCA = " + diferenca);

    }
}
