package ordenacao_e_filtros_em_Javaj;

import java.io.IOException;
import java.util.*;

public class OrdenandoNumerosParesEImpares {


    /* DADOS DO DESAFIO
        Desafio:
        Crie um programa onde você receberá valores inteiros não negativos como entrada.
        Ordene estes valores de acordo com o seguinte critério:
           - Primeiro os Pares
           - Depois os Ímpares
        Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

        Entrada:
        A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
        Este é o número de linhas de entrada que vem logo a seguir. As próximas N
        linhas terão, cada uma delas, um valor inteiro não negativo.

        Saída:
        Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
        Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
    */

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        //Declaracao de variaveis
        int quantidade = ler.nextInt();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        //Entrada de dados
        for (int i = 1; i <= quantidade; i++) {
            int numeroEntrada = ler.nextInt();
            if ((numeroEntrada % 2) == 0)
                pares.add(numeroEntrada);
            else
                impares.add(numeroEntrada);
        }
        //Ordenacao dos dados
        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        //Mostra na tela os dados de saida
        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
    }
}
