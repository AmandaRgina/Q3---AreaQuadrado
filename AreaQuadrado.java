package areaQuadrado;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		System.out.println("Informe o valor de um dos lados do quadrado: ");
		
		Scanner input = new Scanner(System.in);
		
		double lado = input.nextDouble();
		
		double areaDobro = 2*lado*lado;
		
		System.out.println("O dobro da área é: " + areaDobro);
		
		
		input.close();

	}

}
