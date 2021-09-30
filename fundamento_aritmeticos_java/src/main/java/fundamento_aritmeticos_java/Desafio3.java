package fundamento_aritmeticos_java;

import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    //Análise de Números
    /* DADOS DO DESAFIO
        Desafio:
        Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
        quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados
        são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

        Entrada:
        Você receberá 5 valores inteiros.

        Saída:
        Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de
        linha após cada uma.

        Exemplo de Entrada 	Exemplo de Saída
                -5                  3 par(es)
                0                   2 impar(es)
                -3                  1 positivo(s)
                -4                  3 negativo(s)
                12
    */

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int countNumberPar = 0;
        int countNumberImpar = 0;
        int countNumberPositivos = 0;
        int countNumberNegativos = 0;
        int number  = 0 ;

        //continue a solução
        for (int i = 0; i<= 4; i++) {
            number = leitor.nextInt();
            if ((number % 2) == 0) {
                countNumberPar++;
            } else {
                countNumberImpar++;
            }
            if (number != 0 ) {
                if(number < 0) {
                    countNumberNegativos++;
                } else {
                    countNumberPositivos++;
                }
            }
        }
        //insira suas variaveis corretamente
        System.out.println( countNumberPar + " par(es)");
        System.out.println( countNumberImpar + " impar(es)");
        System.out.println( countNumberPositivos + " positivo(s)");
        System.out.println( countNumberNegativos + " negativo(s)");
    }
}
