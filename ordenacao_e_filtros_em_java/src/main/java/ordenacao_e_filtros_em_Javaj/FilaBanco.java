package ordenacao_e_filtros_em_Javaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilaBanco {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int numerosDeCaso = toInt(read());

        for (int i = 0; i < numerosDeCaso; i++) {

            List<Integer> filaOrdemChegada = new ArrayList<>();
            int quantidadeDeClientesQueNaoMudou = 0;
            int quantidadeDeClientes = toInt(read());
            String[] codigoSmsAtendimento = read().split(" ");

            if (codigoSmsAtendimento.length < quantidadeDeClientes) {
                System.out.println("Quantidade de senhas geradas é inferior a quantidade de cliente ");
                System.out.println("Operacao abortada");
                break;
            }

            for (String codigo: codigoSmsAtendimento ) {
                filaOrdemChegada.add(toInt(codigo));

            }

            List<Integer> filaOrdemAtendimento = filaOrdemChegada.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
            for (int j = 0; j < filaOrdemChegada.size(); j++) {
                if (filaOrdemChegada.get(j).compareTo(filaOrdemAtendimento.get(j)) == 0) {
                    quantidadeDeClientesQueNaoMudou++;
                }

            }
            System.out.println(quantidadeDeClientesQueNaoMudou);

        }


    }
    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
