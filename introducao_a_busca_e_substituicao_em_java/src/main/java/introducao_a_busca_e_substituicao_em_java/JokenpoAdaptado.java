package introducao_a_busca_e_substituicao_em_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class JokenpoAdaptado {

    static final int EMPATE = 2;
    static final int GANHOU = 1;
    static final int PERDEU = 0;

    static final int PEDRA = 0;
    static final int PAPEL = 1;
    static final int TESOURA = 2;
    static final int LAGARTO = 3;
    static final int SPOCK = 4;

    static Map<String, Map<String, Integer>> opcoes;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        opcoes = getOpcoesConfiguradas();
        int numerosDeCaso = toInt(read());

        Map<Integer, String> participantes = new HashMap<>();
        participantes.put(1, "Fernanda");
        participantes.put(2, "Marcia");


        for (int i = 0; i < numerosDeCaso; i++) {
            String[] escolhas = read().toLowerCase(Locale.ROOT).split(" ");
            if (opcoes.get(escolhas[0]).get(escolhas[1]) == 2) {
                System.out.println("empate");
            } else if (opcoes.get(escolhas[0]).get(escolhas[1]) == 1) {
                System.out.println(participantes.get(1));
            } else if (opcoes.get(escolhas[0]).get(escolhas[1]) == 0) {
                 System.out.println(participantes.get(2));
            }
        }
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
    private static Map<String, Map<String, Integer>> getOpcoesConfiguradas() {
        Map<String, Map<String, Integer>> opcoes = new HashMap<>();
        opcoes.put("pedra", getConfigPedra());
        opcoes.put("papel", getConfigPapel());
        opcoes.put("tesoura", getConfigTesoura());
        opcoes.put("lagarto", getConfigLagarto());
        opcoes.put("spock", getConfigSpock());
        return opcoes;
    }

    private static Map<String, Integer> getConfigSpock() {
        Map<String, Integer> spock = new HashMap<>();
        spock.put("spock", EMPATE);
        spock.put("tesoura", GANHOU);
        spock.put("pedra", GANHOU);
        spock.put("lagarto", PERDEU);
        spock.put("papel", PERDEU);
        return spock;
    }

    private static Map<String, Integer> getConfigLagarto() {
        Map<String, Integer> lagarto = new HashMap<>();
        lagarto.put("lagarto", EMPATE);
        lagarto.put("tesoura", PERDEU);
        lagarto.put("pedra", PERDEU);
        lagarto.put("spock", GANHOU);
        lagarto.put("papel", GANHOU);
        return lagarto;
    }

    private static Map<String, Integer> getConfigPapel() {
        Map<String, Integer> papel = new HashMap<>();
        papel.put("papel", EMPATE);
        papel.put("tesoura", PERDEU);
        papel.put("lagarto", PERDEU);
        papel.put("spock", GANHOU);
        papel.put("pedra", GANHOU);
        return papel;
    }

    private static Map<String, Integer> getConfigPedra() {
        Map<String, Integer> pedra = new HashMap<>();
        pedra.put("pedra", EMPATE);
        pedra.put("tesoura", GANHOU);
        pedra.put("lagarto", GANHOU);
        pedra.put("spock", PERDEU);
        pedra.put("papel", PERDEU);
        return pedra;
    }

    private static Map<String, Integer> getConfigTesoura() {
        Map<String, Integer> tesoura = new HashMap<>();
        tesoura.put("tesoura", EMPATE);
        tesoura.put("papel", GANHOU);
        tesoura.put("lagarto", GANHOU);
        tesoura.put("spock", PERDEU);
        tesoura.put("pedra", PERDEU);
        return tesoura;
    }
}


