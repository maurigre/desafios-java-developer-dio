package introducao_a_busca_e_substituicao_em_java;

import java.io.IOException;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class ValidadorDeSenhasComRequisitos {

    final static int MIN = 6;
    final static int MAX = 32;

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String senha;
        ValidadorDeSenha validador = new ValidadorDeSenha(MIN, MAX);

        while (leitor.hasNextLine()) {

            senha = leitor.nextLine();

            if (validador.isValid(senha)) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }

}

class ValidadorDeSenha {
    private int min;
    private int max;

    public ValidadorDeSenha(int min, int max) {
        this.min = min;
        this.max = max;
    }


    public boolean isValid(String value) {
        return naoContemEspaco(value) &&
                isTamanhoAceitavel(value) &&
                naoContemCaracteresEspeciais(value) &&
                contemLetrasMinuscula(value) &&
                contemLetrasMaiuscula(value) &&
                contemNumero(value);
    }

    public boolean isTamanhoAceitavel(String value) {
        return (value.length() >= min && value.length() <= max);
    }

    private boolean contemLetrasMinuscula(String value) {
        return valida(value, i -> Character.isLetter(i) && Character.isLowerCase(i));
    }

    private boolean contemLetrasMaiuscula(String value) {
        return valida(value, i -> Character.isLetter(i) && Character.isUpperCase(i));
    }

    private boolean contemNumero(String value) {
        return valida(value, Character::isDigit);
    }

    public boolean naoContemEspaco(String value) {
        return !valida(value, i -> Character.isWhitespace(i));
    }

    public boolean naoContemCaracteresEspeciais(String value) {
        return value.chars().allMatch(i -> (i >= 48 && i <= 57)
                || (i >= 65 && i <= 90)
                || (i >= 97 && i <= 122)
        );
    }

    private boolean valida(String value, IntPredicate predicate) {
        return value.chars().anyMatch(predicate);
    }
}
