import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variaveis utilizadas
        int a, b, soma;

        //Entrada de dados pelo usuário
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        //Processamento
        soma = a + b;

        //Saída
        System.out.println("X = " + soma);

    }
}
