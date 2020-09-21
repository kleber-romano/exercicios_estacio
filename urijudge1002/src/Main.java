import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variável
        double raio, pi, area;

        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        sc.close();

        //Saída
        System.out.printf("A=%.4f %n", area);
    }
}
