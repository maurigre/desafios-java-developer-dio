package fundamento_aritmeticos_java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class desafio1 {

    //Quantidade de Números Positivos

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        int numeros_positivos = 0;
        double N = 0;
        for (int i = 1; i <= 6; i++) {
            N = ler.nextDouble();
            if (N >= 0) numeros_positivos++;
        }

        System.out.println(numeros_positivos + " valores positivos");
    }

     /* DADOS DO DESAFIO
        Desafio:
            Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. Em seguida, apresente a
            quantidade de valores positivos digitados.

        Entrada:
            Você receberá seis valores, negativos e/ou positivos.

        Saída:
            Exiba uma mensagem dizendo quantos valores positivos foram lidos. assim como é exibido abaixo no exemplo de
            saída. Não se esqueça de incluir na mensagem de saída o sufixo " valores positivos", conforme o exemplo
            abaixo:

         Exemplo de Entrada 	Exemplo de Saída
                7                   4 valores positivos
                -5
                6
                -3.4
                4.6
                12

    */

}
