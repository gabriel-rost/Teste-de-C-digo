/*
8) Faça um programa, usando SWITCH, que receba dois números e execute as operações listadas a seguir, de acordo com a escolha.
Operações com SWITCH:
a) Operação 1: A soma de dois números
b) Operação 2: A subtração de dois números
c) Operação 3: A multiplicação de dois números
d) Operação 4: A divisão de dois números
Se a opção digitada for inválida, mostre uma mensagem de erro e termine a execução do programa.
*/

import java.util.Scanner;
public class questao8{
	public static void main(String[] args) {
		
		int escolha;
		float num1, num2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escolha uma operacao:");
		escolha = s.nextInt();
		
		switch (escolha) {

			case 1:
			System.out.println("soma de dois numeros:");
			System.out.println("numero 1:");
			num1 = s.nextFloat();
			
			System.out.println("numero 2:");
			num2 = s.nextFloat();
			
			float soma = num1+num2;
			System.out.printf("soma = " + soma);

			break;

			case 2:
			System.out.println("subtracao de dois numeros:");
			System.out.println("numero 1:");
			num1 = s.nextFloat();
			
			System.out.println("numero 2:");
			num2 = s.nextFloat();
			
			float subtracao = num1-num2;
			System.out.printf("subtracao = " + subtracao);

			break;

			case 3:

			System.out.println("multiplicacao de dois numeros:");
			System.out.println("numero 1:");
			num1 = s.nextFloat();
			
			System.out.println("numero 2:");
			num2 = s.nextFloat();
			
			float multiplicacao = num1*num2;
			System.out.printf("multiplicacao = " + multiplicacao);

			break;
			
			case 4:

			System.out.println("divisao de dois numeros:");
			System.out.println("numero 1:");
			num1 = s.nextFloat();
			
			System.out.println("numero 2:");
			num2 = s.nextFloat();
			
			float divisao = num1/num2;
			System.out.printf("divisao = " + divisao);

			break;

			default:
			System.out.printf("opcao invalida");

			}	
	}
	
}
