package operadores;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		double num1;
		double num2;
		String op;
		double resultado;
		
		Scanner scanner = new Scanner(System.in);		
				
		System.out.println("Digite um numero: ");
		num1 = scanner.nextDouble();
		
		System.out.println("Digite outro numero: ");
		num2 = scanner.nextDouble();
		
		System.out.println("Digite a operacao: ");
		op = scanner.next();
		
//		System.out.println((num1  + num2));
//		resultado = scanner.nextDouble();
		
		
		resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);
		//System.out.println(resultado);
		
		scanner.close();
	}

}
