//* Exibindo os Dias da Semana Usando um Array *//
public class DiasSemana {
	public static void main(String[] args) {
		String[] semana = new String[7];  // Corrigido o tipo do array
		semana[0] = "Domingo";  // Corrigido os sinais das aspas
		semana[1] = "Segunda";
		semana[2] = "Terça";
		semana[3] = "Quarta";
		semana[4] = "Quinta";
		semana[5] = "Sexta";
		semana[6] = "Sábado";
				        
			for (String dia : semana) {
			System.out.println(dia);
			}
	}
}
