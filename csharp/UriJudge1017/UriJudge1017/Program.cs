using System;

namespace UriJudge1017
{
    class Program
    {
        static void Main(string[] args)
        {
            int distancia, tempo;
            double consumo;

            distancia = int.Parse(Console.ReadLine());
            tempo = int.Parse(Console.ReadLine());

            consumo = (tempo * distancia) / 12.0;

            Console.WriteLine(consumo.ToString("F3"));
        }
    }
}
