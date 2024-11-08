import java.util.*;

public class CodigoDoCorpo {
    public static void main(String[] args) {
        int[] numero = { 190, 90, 87, 1, 50, 23, 11, 5, 55, 2 }; // Antes da ordenação

        displayElement(numero); // invoca displayElement

        // Depois da ordenação
        Arrays.sort(numero);
        displayElement(numero); // invoca displayElement
    }

    /*
    * Método displayElement, ele é invocado toda vez que se
    * pretende imprimir os dados de um array.
    */

    public static void displayElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // pula uma linha
    }
}