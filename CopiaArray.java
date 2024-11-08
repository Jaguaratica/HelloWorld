public class CopiaArray {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de caracteres chamado 'array1' com as letras 'j', 'a', 'v', 'a', 'l', 'i'
        char[] array1 = { 'j', 'a', 'v', 'a', 'l', 'i' };
        
        // Declaração de um array de caracteres chamado 'array2' com tamanho 4
        char[] array2 = new char[4];

        // Cópia de 4 elementos de 'array1' para 'array2', começando do índice 0 em ambos os arrays
        System.arraycopy(array1, 0, array2, 0, 4);

        // Laço for para percorrer o array 'array2' e imprimir seus elementos
        for(int i = 0; i < array2.length; i++)
            System.out.print(array2[i]); // Imprime cada caractere de 'array2' sem quebra de linha
    }
}
