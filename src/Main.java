import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = leitura.nextLine();

        int posicaoPonto = arquivo.lastIndexOf(".");
        if(posicaoPonto != -1) {
            String nomeSemExtencao = arquivo.substring(0,posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtencao);
        } else {
            System.out.println("O arquivo não possui extensão. ");
        }
        leitura.close();




    }
}