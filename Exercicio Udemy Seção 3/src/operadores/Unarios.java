package operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;  // a = a + 1	
		System.out.println(a);
		
		a--;  // a = a - 1
		System.out.println(a);
		
		++b;  // b = b + 1;
		System.out.println(b);
		
		--b;  // b = b - 1;
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Desafio");
		System.out.println(++a  == b--); // primeiro imprime o b
		System.out.println(++a  == b - 1);
	
		System.out.println(a);
		System.out.println(b);
	
	
	}
	

}
