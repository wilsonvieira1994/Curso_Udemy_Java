package operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		
//		System.out.println(b);
		
		double numA = Math.pow(6 * (3+2), 2);
		double denA = 3*2;
		
		double numB = (1-5) * (2-7);
		double denB = 2;
						
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double c1 = (superiorA - superiorB);
		double inferior = Math.pow(10, 3);
		
		double Total = Math.pow(c1, 3) / inferior;
		
		System.out.println(Total);
				
	}
	
}
