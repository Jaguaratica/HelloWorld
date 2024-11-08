public class BidimensionalArray {
    public static void main(String[] args) {
        // declaração e construção de array 2x2
        int x[][] = new int[2][2];
        // inicialização dos valores
        x[0][0] = 3;
        x[0][1] = 5;
        x[1][0] = 8;
        x[1][1] = 13;
        // calculando o determinante
        int d = ((x[0][0] * x[1][1]) - (x[0][1] * x[1][0]));
        // imprime o resultado
        System.out.println("Determinante = " + d);
    }
}
