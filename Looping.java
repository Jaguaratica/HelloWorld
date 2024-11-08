public class Looping {
    public static void main(String[] args) {
        
        int x = 0;
        for (;;) { // Loop infinito
            x++; // Incrementa x
            if (x == 20) { // Verifica se x é igual a 20
                System.out.print("fim do loop - x = " + x); // Imprime mensagem
                break; // Interrompe o loop
            }
        }
    }
}