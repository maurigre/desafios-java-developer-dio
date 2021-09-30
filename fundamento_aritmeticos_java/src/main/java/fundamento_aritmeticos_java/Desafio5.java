package fundamento_aritmeticos_java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio5 {

    //Consumo Médio do Automóvel
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        //declare as variaveis corretamente
        int  distancia = leitor.nextInt();
        double  combustivel = leitor.nextDouble();

        double media = distancia /  combustivel;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l",  media    ));
    }

    /*DADOS DO DESAFIO
        Desafio:
        Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o
        total de combustível consumido (em litros).

        Entrada:
        Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que
        representa o total de combustível consumido, com um dígito após o ponto decimal.

        Saída:
        Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a
        mensagem "km/l".

        Exemplo de Entrada 	Exemplo de Saída
                500             14.286 km/l
                35.0

                2254            18.119 km/l
                124.4

                4554            9.802 km/l
                464.6

*/
}
