/* Exemplo de Tipos Primitivos em Java e Condições Simples */
public class Primitivos{
    public static void main(String[] args) {
        // No total são 8 tipos primitivos (char, boolean, double, float), 4 deles do tipo inteiro (byte, short, int, long).
        // Double - Número de ponto flutuante com mais precisão | Float - Faixa de representação um pouco menor.
        // String é uma classe, não um tipo primitivo.
        byte idade = 29;

        boolean eBrasileiro = true;

        float dinheiro = 66.50F;

        double salario = 400.20;

        String nome = "Katia";

        if (dinheiro > 200) {
            System.out.println("É maior que duzentos");
        } else if (dinheiro == 200) {
            System.out.println("É igual a duzentos");
        } else {
            System.out.println("É menor que duzentos");
        }
    }
}
