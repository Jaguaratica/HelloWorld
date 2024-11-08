import java.util.Scanner;

public class Arrayz { 
    public static void main(String[] args) {
    	
    	/* EXEMPLO 1 ------------------------
    	
        Scanner scanner = new Scanner(System.in);
        double[] nota = new double[3];
        
        // Solicitando ao usuário que insira as notas
        for (int i = 0; i < nota.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            nota[i] = scanner.nextDouble();
        }
        
        // Exibindo as notas
        System.out.println("Nota 1 = " + nota[0]);
        System.out.println("Nota 2 = " + nota[1]);
        System.out.println("Nota 3 = " + nota[2]);
        
        scanner.close();
        
        */

    	/* EXEMPLO 2 ------------------------
    	 
        double nota[] = new double[]{8.5, 4.0, 6.5};
        
        System.out.println("Nota 1 = " + nota[0]);
        System.out.println("Nota 2 = " + nota[1]);
        System.out.println("Nota 3 = " + nota[2]);
        
         */
    	
    	// EXEMPLO 3 ------------------------
    	
		int[] v = {2, 3, 4, 1, 11, 45, 6, 56, 79, 1, 2, 3};

    	// Loop para imprimir os valores do array
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
    }
}