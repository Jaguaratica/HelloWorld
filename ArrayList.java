//* Estrutura de Dados para representar uma lista dinâmica (ArrayList) - INCOMPLETO *//
import java.util.ArrayList;

public class Primitivos{
    public static void main(String[] args) {
        // Arrays não dinâmicos:

        int[] idades = new int[10];
        String[] nomes = new String[10];
        boolean[] saoBrasileiros = new boolean[10];

        // Dinâminos:

        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22);
        idades.add(20);
        idades.add(68);

        // Para remover (exp)        ---->   idades.remove(index:0);
        // Para pegar um valor (exp) ---->   idades.get(index:1);

