/*
6)Escreva um programa EM JAVA que lê três números reais,
calcule e apresente a soma e a média dos números informados com 2 casas depois da vírgula.
*/

import java.util.Scanner;
public class questao6{
	public static void main(String[] args) {
		
		float num1, num2, num3, soma;
		float media;
		Scanner s = new Scanner(System.in);
		
		System.out.println("num1:");
		num1 = s.nextInt();
		
		System.out.println("num2:");
		num2 = s.nextInt();

		System.out.println("num3:");
		num3 = s.nextInt();
		
		soma = num1 + num2 + num3;
		System.out.printf("soma dos valores = %.2f %n", (soma));
		
		media = soma/3;
		System.out.printf("media dos valores = %.2f %n", (media));
	
	}

}
