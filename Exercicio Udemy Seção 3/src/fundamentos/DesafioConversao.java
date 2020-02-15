package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro salario: ");
		String valor1 = entrada.next().replace("," , ".");
		
		System.out.print("Digite o valor do segundo salario: ");
		String valor2 = entrada.next().replace("," , ".");
		
		System.out.print("Digite o valor do terceiro salario: ");
		String valor3 = entrada.next().replace("," , ".");
		
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = (numero1 + numero2 + numero3) / 3;
		System.out.println("A média é: " + soma);
		
		entrada.close();
		
		
		
		
	}

}
