import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int primeiroNumero, segundoNumero;


        //Entrada de dados
        System.out.println("Digite o primeiro número: ");
        primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = sc.nextInt();

        //Processamento e saída
        if ((primeiroNumero % segundoNumero) == 0 || (segundoNumero % primeiroNumero) == 0){
            System.out.println("São múltiplos");
        }else {
            System.out.println("Não são múltiplos");
        }


    }
}
