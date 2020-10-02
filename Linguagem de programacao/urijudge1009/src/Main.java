import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variáveis
        String nomeVendedor;
        double salarioFixo, totalVendas, comissao, salarioTotal;

        //Entrada de dados
        nomeVendedor = sc.nextLine();
        salarioFixo = sc.nextDouble();
        totalVendas = sc.nextDouble();
        comissao = 0.15;

        //Processamento
        salarioTotal = salarioFixo + (totalVendas * comissao);

        //Saída
        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);

    }
}
