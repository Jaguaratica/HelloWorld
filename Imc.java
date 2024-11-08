import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite seu peso em Kg: ");
			double peso = scanner.nextDouble();
			
			System.out.println("Digite sua altura em Metros: ");
			double altura = scanner.nextDouble();
			
			double imc = peso / (altura * altura);
			
			if (imc < 17) {
	            System.out.println("IMC: " + imc + " - Muito abaixo do peso");
			} else if (imc >= 17 && imc <= 18.49) {
	            System.out.println("IMC: " + imc + " - Abaixo do peso");
			} else if (imc >= 18.5 && imc <= 24.99) {
	            System.out.println("IMC: " + imc + " - Peso normal");
			} else if (imc >= 25 && imc <= 29.99) {
	            System.out.println("IMC: " + imc + " - Acima do peso");
			} else if (imc >= 30 && imc <= 34.99) {
	            System.out.println("IMC: " + imc + " - Obesidade I");
			} else if (imc >= 35 && imc <= 39.99) {
	            System.out.println("IMC: " + imc + " - Obesidade II");
			} else if (imc >= 40) {
				System.out.println("IMC: " + imc + " - Obesidade III");
			}
				
			scanner.close();
	}
}
