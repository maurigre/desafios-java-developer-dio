package solucao_de_problemas_com_java;

import java.util.Scanner;

public class VogaisExtraterrestres {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var alfabeto = "";
        var texto = "";
        var quantidade = 0;

        while (scanner.hasNextLine()) {
            alfabeto = scanner.nextLine();
            texto = scanner.nextLine();

            for (int i = 0; i < alfabeto.length(); i++) {
                quantidade = getQuantidade(texto, quantidade, alfabeto.charAt(i));
            }
            System.out.println(quantidade);
            quantidade = 0;
        }
        scanner.close();
    }

    private static int getQuantidade(String texto, int quantidade, char caracter) {
        if (texto.contains(String.valueOf(caracter))){
            for (int j = 0; j < texto.length(); j++) {
                if (texto.charAt(j) == caracter)
                    quantidade++;
            }
        }
        return quantidade;
    }
}
