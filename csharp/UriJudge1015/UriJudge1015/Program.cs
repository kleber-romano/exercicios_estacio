using System;

namespace UriJudge1015 //Distância entre dois pontos cartesianos
{
    class Program
    {
        static void Main(string[] args)
        {
            //Variáveis
            double x1, x2, y1, y2, dist;

            //Entrada de dados
            string[] vet1 = Console.ReadLine().Split(' ');

            x1 = double.Parse(vet1[0]);
            y1 = double.Parse(vet1[1]);

            string[] vet2 = Console.ReadLine().Split(' ');

            x2 = double.Parse(vet2[0]);
            y2 = double.Parse(vet2[1]);

            //Processamento
            dist = Math.Sqrt(Math.Pow((x2 - x1), 2) + Math.Pow((y2 - y1), 2));

            //Saída
            Console.WriteLine(dist.ToString("F4"));
        }
    }
}
