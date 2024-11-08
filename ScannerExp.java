import java.util.Scanner;

public class ScannerExp {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
    }
}