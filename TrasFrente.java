//* Exibindo Elementos de um Vetor do Início ao Fim e do Fim ao Início *//
public class TrasFrente { 
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " - " + v[v.length - 1 - i]);
        }
    }
}
