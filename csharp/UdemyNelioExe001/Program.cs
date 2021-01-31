using System;

namespace UdemyNelioExe001
{
    class Program
    {
        static void Main(string[] args)
        {
            //Declaração de variáveis
            double A, B, C, delta, x1, x2;

            string[] vet = Console.ReadLine().Split(' ');
            A = double.Parse(vet[0]);
            B = double.Parse(vet[1]);
            C = double.Parse(vet[2]);

           
            double v = Math.Pow(B, 2) - 4 * A * C;
            delta = v;

            if (delta < 0 || A ==0)
            {
                Console.WriteLine("Impossivel calcular");
            } else
            {
                x1 = (-B + Math.Sqrt(delta))/(2 * A);
                x2 = (-B - Math.Sqrt(delta))/(2 * A);

                Console.WriteLine("R1 = " + x1.ToString("F5"));
                Console.WriteLine("R2 = " + x2.ToString("F5"));
            }
           


        }
    }
}
