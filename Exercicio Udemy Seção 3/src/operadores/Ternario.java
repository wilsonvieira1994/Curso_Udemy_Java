package operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "Recupera�ao" : "reprovado";
		// ? = caso   : =  se nao
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		/*==== Faz a mesma coisa ====*/
		//String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Recupera�ao" : "reprovado";
		
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		

	}

}
