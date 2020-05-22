#include <iostream>
#include <locale.h>


using std::cout;
using std::endl;
using std::cin;

void separador()
{
	int x;

	for(int x=1; x<=30; x++)
	cout << "*";
}
int main()
{
	//Definindo a localização
	setlocale(LC_ALL, "");
	
	//Variáveis
	float num1, num2, soma, subt, mult, divis;
	char operador;

	//Entrada de dados
	cout << "\n\n";
	cout << "\n\n********** CALCULADORA **********\n\n";
	
	separador();
	cout << "\nDigite com o primeiro número: ";
	cin >> num1;

	cout << "Digite o segundo número: ";
	cin >> num2;

	//Definindo operações matemáticas
	soma = num1 + num2;
	subt = num1 - num2;
	mult = num1 * num2;
	divis = num1 / num2;

	cout << "\n";
	separador();

	cout << "\nSelecione a operação desejada: \n";
	cout << "(+) SOMA \n";
	cout << "(-) SUBTRAÇÃO \n";
	cout << "(*) MULTIPLICAÇÃO \n";
	cout << "(/) DIVISÃO \n";
	cin >> operador;

	switch (operador)
	{
		case '+': cout << soma << endl;
		break;

		case '-': cout << subt << endl;
		break;

		case '*': cout << mult << endl;
		break;

		case '/': cout << divis << endl;
		break;

		default: cout << "A operação escolhida não pode ser realizada. Execute o programa novamente.";
	}
	separador();
	cout << "\n\n";
	
	return 0;
}