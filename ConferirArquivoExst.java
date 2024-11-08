import java.io.File;

public class ConferirArquivoExst {

    public static void main(String args[]) {

        File arquivo = new File("C:\\Users\\Ju_hl\\eclipse-workspace\\Teste\\bin\\Populacao.class");
        
        if (arquivo.exists()) {
            System.out.println("Arquivo ou diretório existe");
        } else {
            System.out.println("Caminho abstrato não existe fisicamente");
        }
    }
}