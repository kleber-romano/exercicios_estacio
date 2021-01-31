using System;

namespace UriJudge1044
{
    class Program
    {
        static void Main(string[] args)
        {
            int A, B, mod;

            mod = 0;
            string[] vet = Console.ReadLine().Split(' ');

            A = int.Parse(vet[0]);
            B = int.Parse(vet[1]);

            if (B > A)
            {
                mod = B % A;
                if (mod == 0)
                {
                    Console.WriteLine("Sao Multiplos");
                }
                else
                {
                    Console.WriteLine("Nao sao Multiplos");
                }

            }
            else
            {
                mod = A % B;
                if (mod == 0)
                {
                    Console.WriteLine("Sao Multiplos");
                }
                else
                {
                    Console.WriteLine("Nao sao Multiplos");
                }

            }

        }
    }
}
