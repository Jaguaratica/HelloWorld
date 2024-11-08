//* Declaração e Inicialização de Arrays *//
public class Arrayzito {

	public static void main(String[] args) {

		int[] valor = new int[3]; // array de int declarado e construído
		
		String[] nome; // array de String declarado
		nome = new String[2]; // array construído
		
		System.out.println("Valor = " + valor[0]); // Imprime o valor padrão do primeiro elemento (0)
		System.out.println("Nome = " + nome[0]); // Imprime o valor padrão do primeiro elemento (null)
	}
}
