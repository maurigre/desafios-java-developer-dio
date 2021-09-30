package introducao_a_busca_e_substituicao_em_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtalhosWebloggerBrasil {

   final static String NEGRITO_REGEX  = "\\#(.*?)\\#";
   final static String  ITALICO_REGEX = "\\_(.*?)\\_";

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String linha;
        while (leitor.hasNextLine()) {
            linha = alteraCaracterEspecial(leitor.nextLine());

            String saida = parse_par(linha, ITALICO_REGEX, "<i>", "</i>");
            saida = parse_par(saida, NEGRITO_REGEX, "<b>", "</b>");
            System.out.println(saida);
        }

    }

    private static String alteraCaracterEspecial(String linha) {
        if (linha.contains("*")) {
            linha = linha.replace("*", "#");
        }
        return linha;
    }

    private static String parse_par(String linha, String regex, String tag_l, String tag_r) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(linha);

        while (matcher.find()) {
            linha = parser(linha, tag_l, tag_r, matcher);
        }
        return linha;
    }

    private static String parser(String linha, String tag_l, String tag_r, Matcher matcher) {
        final String texto = matcher.group(0);
        final String delimitador = texto.substring(0, 1);
        final String texto_sem_delimitador = texto.replace(delimitador, "");

        linha = linha.replaceFirst(texto, tag_l + texto_sem_delimitador + tag_r);
        return linha;
    }
}
