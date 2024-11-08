//* Exemplo de Sobrecarga de Métodos para Soma *//
public class SomaSobrecarga {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 32;
        int v3 = 4;
        double v4 = 12.9;
        double v5 = 23.8;

        adicionar(v1, v2);
        adicionar(v1, v2, v3);
        adicionar(v4, v5);
    }

    public static void adicionar(int a, int b) {
        int soma = (a + b);
        System.out.println("Soma dois nrs inteiros " + soma);
    }

    public static void adicionar(int a, int b, int c) {
        int soma = (a + b + c);
        System.out.println("Soma tres nrs inteiros " + soma);
    }

    public static void adicionar(double a, double b) {
        double soma = (a + b);
        System.out.println("Soma dois nrs double " + soma);
    }
}
