package ordenacao_e_filtros_em_Javaj;

import java.util.*;
import java.util.stream.Collectors;

public class ComprasNoSupermercado {

    //Compras no Supermercado
    /*
        Desafio:
        Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas.
        Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada item na
        mesma hora que percebe a falta dele em casa.
        O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais de uma vez e a
        lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os
        itens duplicados da lista de compras e que os ordene alfabeticamente.

        Entrada:
        A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste que vem a seguir,
        ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha
        que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos
        e separadas por um espaço.
        Ex:
            3
            suco carne frango carne chocolate
            sacola amaciante
            leite chocolate suco laranja

        Saída:
        A saída contém N linhas, cada uma representando uma lista de compra, sem os itens repetidos e em ordem
        alfabética.
        Ex:
            carne chocolate frango suco
            amaciante sacola
            chocolate laranja leite suco
    */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Declaracao de variaveis
        int numeroCasosDeTestes = 0;
        Set<String> semRepeticao = new LinkedHashSet<>();

        //Entrada de dados
        numeroCasosDeTestes = ler.nextInt();
        for (int i = 0; i <= numeroCasosDeTestes; i++ ) {
            String[] relacaoItens = ler.nextLine().split(" ");
            String itens = Arrays.stream(relacaoItens)
                    .sorted()
                    .distinct()
                    .collect(Collectors.joining(" "));
            semRepeticao.add(itens);
        }

        //Saida de dados
        semRepeticao.forEach(System.out::println);
    }
}
