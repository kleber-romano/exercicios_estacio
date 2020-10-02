import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        //Entrada de dados
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        //Processamento
        salario = horasTrabalhadas * valorHora;

        //Saída
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
    }


}
