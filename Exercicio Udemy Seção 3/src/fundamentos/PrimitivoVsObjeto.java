package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = "texto";
		s.toUpperCase();
		System.out.println(s);

		// Wrappers s�o a vers�o objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
		
	}

}
