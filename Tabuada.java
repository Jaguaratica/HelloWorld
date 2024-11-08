public class Tabuada {
	public static void main(String[] args) {

		// definição da variável
		int tab4 = 4;
		int resultado = 0;
		
		// O comando for imprimirá dez vezes as instruções que estão entre chaves – sinais { }.

		System.out.println("Tabuada do "+tab4);

		// laço for
		for(int i = 1; i<=10; i++){
			resultado = (tab4 * i);
			System.out.println(tab4 +" X " + i + " = "+ resultado);
		}
	}
}

