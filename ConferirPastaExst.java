//* Verificando se um Caminho se Refere a um Diretório em Java *//
import java.io.File;

public class ConferirPastaExst {

    public static void main(String args[]) {

        File arquivo = new File("C:\\Users\\Ju_hl\\eclipse-workspace\\Teste\\bin\\Populacao.class");
        
        if (arquivo.isDirectory()) {
            System.out.println("O objeto arquivo faz referência a um diretório.");
        } else {
            System.out.println("O objeto arquivo não faz referência a um diretório.");
        }
    }
}

