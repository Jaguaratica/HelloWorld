/* Cálculo de Salário com Reajuste e Gratificação por Cargo */
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite o número correspondente ao cargo do funcionário:");
        System.out.println("1 - Cargo com salário até R$ 2.000,00");
        System.out.println("2 - Cargo com salário de R$ 2.000,01 a R$ 3.000,00");
        System.out.println("3 - Cargo com salário de R$ 3.000,01 a R$ 5.000,00");
        System.out.println("4 - Cargo com salário acima de R$ 5.000,00");
        int cargoOpcao = scanner.nextInt();

        double salarioBruto = 0;

        // Definindo o salário bruto com base no cargo
        switch (cargoOpcao) {
            case 1:
                salarioBruto = 2000.00;
                break;
            case 2:
                salarioBruto = 2500.00; // Exemplo de salário para cargo 2
                break;
            case 3:
                salarioBruto = 4000.00; // Exemplo de salário para cargo 3
                break;
            case 4:
                salarioBruto = 6000.00; // Exemplo de salário para cargo 4
                break;
            default:
                System.out.println("Opção de cargo inválida!");
                scanner.close();
                return; // Encerra o programa se a opção for inválida
        }

        // Variáveis para armazenar o reajuste e a gratificação
        double percentualReajuste = 0;
        double percentualGratificacao = 0;

        // Cálculo do reajuste e gratificação com base no salário bruto
        if (salarioBruto <= 2000.00) {
            percentualReajuste = 0.18;
            percentualGratificacao = 0.05;
        } else if (salarioBruto <= 3000.00) {
            percentualReajuste = 0.15;
            percentualGratificacao = 0.04;
        } else if (salarioBruto <= 5000.00) {
            percentualReajuste = 0.12;
            percentualGratificacao = 0.03;
        } else {
            percentualReajuste = 0.10;
            percentualGratificacao = 0.00;
        }

        // Cálculo do salário total e salário líquido
        double aumento = salarioBruto * percentualReajuste; // Reajuste aplicado ao salário bruto
        double gratificacaoValor = salarioBruto * percentualGratificacao; // Gratificação
        double salarioBrutoAtualizado = salarioBruto + aumento + gratificacaoValor; // Salário bruto atualizado
        double salarioLiquido = salarioBrutoAtualizado - (salarioBrutoAtualizado * 0.15); // Salário líquido com desconto

        // Saída dos resultados
        System.out.println("\n--- Informações do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargoOpcao);
        System.out.println("Salário Bruto Anterior: R$" + String.format("%.2f", salarioBruto));
        System.out.println("Salário Bruto Atualizado: R$" + String.format("%.2f", salarioBrutoAtualizado));
        System.out.println("Salário Líquido: R$" + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}
