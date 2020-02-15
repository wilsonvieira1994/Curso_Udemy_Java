package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // equals = igual

		// Programa2

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // trim = tirar espa�os digitados em branco
		System.out.println("2".equals(s2));

		String s3 = entrada.nextLine(); // Line tira os espa�os digitados em branco
		System.out.println("2" == s3);
		System.out.println("2".equals(s3));

		entrada.close();

	}

}
