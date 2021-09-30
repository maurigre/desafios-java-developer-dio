package introducao_a_busca_e_substituicao_em_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenacaoDePalavrasPorTamanho {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        //declaracao de variaveis a serem usadas
        int quantidadeLinhasDeTestes = Integer.parseInt(in.readLine());

        for (int i = 1; i <= quantidadeLinhasDeTestes ; i++) {
            List<String> listaDePalavras = new ArrayList<>();
            String linha = in.readLine();
            Iterator<String> iterator = Arrays.stream(linha.split(" ")).iterator();
            for (Iterator<String> it = iterator; it.hasNext(); ) {
                String palavra = it.next();
                listaDePalavras.add(palavra);
            }

            String palavrasOrdenadas = listaDePalavras.stream()
                    .sorted(OrdenacaoDePalavrasPorTamanho::compare)
                    .collect(Collectors.joining(" "));

            System.out.println(palavrasOrdenadas);
        }
        out.close();
    }

    private static int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return -1;
        if (o1.length() == o2.length()) return  o1.compareTo(o2);
        return 1;
    }
}
