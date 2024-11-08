public class CalculoBonus {

    public static void main(String[] args) {

        // declaração das variáveis
        double salario, bonus;
        int meses;

        salario = Double.parseDouble(args[0]);
        meses = Integer.parseInt(args[1]);

        if (meses <= 12) {
            bonus = salario * 1.05;
        } else if (meses > 12 && meses <= 48) {
            bonus = salario * 1.10;
        } else {
            bonus = salario * 1.15;
        }

        System.out.println("Valor do Bônus = " + bonus);
    }
}