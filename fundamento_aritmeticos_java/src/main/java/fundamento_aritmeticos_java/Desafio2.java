package fundamento_aritmeticos_java;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    //Exibindo Números Pares

     /* DADOS DO DESAFIO
        Desafios:
            Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

        Entrada:
            Você receberá 1 valor inteiro N, onde N > 0.

        Saída:
            Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

        Exemplo de Entrada 	Exemplo de Saída
                6                   2
                                    4
                                    6
    */
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();

        for (int i = 1 ; i <= N ; i++) {
            if ((i % 2) == 0 ) System.out.println(i);
        }
    }
}
