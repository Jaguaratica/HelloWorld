/* Gestão de Inventário de Loja com Adição de Itens */
import java.util.Scanner;

public class ItensLoja {
    public static void main(String[] args) {
    	
        // Definindo o array com tamanho fixo de 10
        String[] inventario = new String[10];
        int contador = 0; // Contador para controlar a quantidade de itens no inventário

        Scanner scanner = new Scanner(System.in);

        while (contador < inventario.length) { // Verifica se o inventário ainda tem espaço
            System.out.println("Adicione um item ao inventário (ou digite 'sair' para terminar): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("sair")) {
                break; // Encerra o loop se o usuário digitar "sair"
            }

            // Adiciona o item no inventário
            inventario[contador] = item;
            contador++; // Incrementa o contador após adicionar o item

            System.out.println("Item '" + item + "' adicionado. Itens no inventário: " + contador + "/10");
        }

        System.out.println("\nInventário completo ou operação finalizada. Aqui estão os itens no seu inventário:");

        // Exibe todos os itens no inventário
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + inventario[i]);
        }

        scanner.close(); // Fecha o scanner
    }
}

