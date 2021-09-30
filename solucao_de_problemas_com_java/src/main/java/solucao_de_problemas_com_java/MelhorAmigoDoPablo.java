package solucao_de_problemas_com_java;

import java.util.*;

public class MelhorAmigoDoPablo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var entrada = "";
        var amigoVencedor = "";

        List<String> amigos = new ArrayList<>();
        List<String> naoAmigos = new ArrayList<>();

        while (scanner.hasNextLine()) {

            entrada = scanner.nextLine();
            if (entrada.equals("FIM")) break;

            String[] dados = entrada.split(" ");

            if (dados[1].equals("SIM")) {
                if (!amigos.contains(dados[0]))
                    amigos.add(dados[0]);
            } else {
                naoAmigos.add(dados[0]);
            }
        }

        for (String amigo : amigos) {
            if (amigo.length() > amigoVencedor.length()) {
                amigoVencedor = amigo;
            }
        }

        amigos.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);

        naoAmigos.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println("\nAmigo do Pablo:\n" + amigoVencedor);
    }
}
