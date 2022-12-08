/*
7) Crie um programa EM JAVA que leia um número real,
calcule e exiba na tela os valores correspondentes a 5%, 50% e 150% do valor informado com 1, 2 e 3 casas decimais.
*/

import java.util.Scanner;
public class questao7{
	public static void main(String[] args) {
		
		double numReal;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Numero Real:");
		numReal = s.nextDouble();
		
		double cincoPorcento = numReal * 0.05;
		System.out.printf("valor: %.1f \n", cincoPorcento);
		
		double cinquentaPorcento = numReal * 0.50;
		System.out.printf("valor: %.2f \n", cinquentaPorcento);
		
		double cento_cinquentaPorcento = numReal * 1.50;
		System.out.printf("valor: %.3f \n", cento_cinquentaPorcento);
		
	}
	
}
