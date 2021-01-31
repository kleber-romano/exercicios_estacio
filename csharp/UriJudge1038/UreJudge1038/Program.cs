using System;

namespace UreJudge1038
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, quant;
            double prod1, prod2, prod3, prod4, prod5, preco;

            prod1 = 4.00;
            prod2 = 4.50;
            prod3 = 5.00;
            prod4 = 2.00;
            prod5 = 1.50;
            preco = 0.00;

            string[] vet = Console.ReadLine().Split(' ');

            x = int.Parse(vet[0]);
            quant = int.Parse(vet[1]);

            switch (x)
            {
                case 1:
                    preco = prod1 * quant;
                    break;

                case 2:
                    preco = prod2 * quant;
                    break;

                case 3:
                    preco = prod3 * quant;
                    break;

                case 4:
                    preco = prod4 * quant;
                    break;

                case 5:
                    preco = prod5 * quant;
                    break;

                default:
                    Console.WriteLine("Produto não encontrado.");
                    break;
            }

            Console.WriteLine("Total: R$ " + preco.ToString("F2"));
        }
    }
}
