using System;

namespace Exe003
{
    class Program
    {
        static void Main(string[] args)
        {
            int x;
            string dia = "  ";

            x = int.Parse(Console.ReadLine());

            switch (x)
            {
                case 1:
                    dia = "segunda-feira";
                    break;

                case 2:
                    dia = "terça-feira";
                    break;

                case 3:
                    dia = "quarta-feira";
                    break;

                case 4:
                    dia = "quinta-feira";
                    break;

                case 5:
                    dia = "sexta-feira";
                    break;

                case 6:
                    dia = "sábado";
                    break;

                case 7:
                    dia = "domingo";
                    break;

                default:
                    Console.WriteLine("Favor digitar um número de 1 a 7");
                    break;
            }

            Console.WriteLine("Dia da semana: " + dia);

        }
    }
}
