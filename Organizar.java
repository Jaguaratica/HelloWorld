//* Exemplo de Ordenação de Arrays (Crescente e Decrescente) *//
import java.util.Arrays;

public class Organizar {
    public static void main(String[] args) {
        // Array de números inteiros
        int[] numerosCrescentes = {190, 90, 87, 1, 50, 23, 11, 5, 55, 2};
        Arrays.sort(numerosCrescentes);
        
        for (int numero : numerosCrescentes) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Nova linha

        // Array de números em ordem decrescente
        int[] numerosDecrescentes = {5, 2, 8, 1, 3};
        Arrays.sort(numerosDecrescentes);
        for (int i = numerosDecrescentes.length - 1; i >= 0; i--) {
            System.out.print(numerosDecrescentes[i] + " ");
        }
        System.out.println(); // Nova linha

        // Array de caracteres
        char[] letras = {'j', 'a', 'v', 'a', 'l', 'i'};
        Arrays.sort(letras);
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println(); // Nova linha

        // Array de palavras
        String[] palavras = {"banana", "maçã", "laranja", "abacaxi"};
        Arrays.sort(palavras);
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }
        System.out.println(); // Nova linha
    }
}
