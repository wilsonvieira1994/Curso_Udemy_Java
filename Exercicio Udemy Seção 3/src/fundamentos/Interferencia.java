package fundamentos;

public class Interferencia {

	public static void main(String[] args) {

		double a = 4.5, b = 5;
		System.out.println(a);
		System.out.println(b);
		
		var c = 4.5;
		System.out.println(c);
		
		var d = "Texto";
		System.out.println(d);
		
		double e;
		e = 123.65;
		System.out.println(e);
		
		float f;
		f = 123.65f;
		System.out.println(f);		
	}
}
