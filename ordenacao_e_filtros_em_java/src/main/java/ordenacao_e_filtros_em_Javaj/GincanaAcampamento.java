package ordenacao_e_filtros_em_Javaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class GincanaAcampamento {

    /*
    Exemplos:
    https://github.com/Pleiterson/desafios-bootcamps-dio/blob/master/Java/Ordenação e Filtros em Java/GincanaAcampamento.java
    https://github.com/amandaveredas/Ordenacao-e-filtros-em-JAVA/blob/6c2619eac5395388a8ff449408328b63cbbe67f8/Ordenacao%20e%20filtros%20em%20JAVA/src/main/java/one/innovation/digital/GincanaAcampamento.java
        par = horario
        ímpar = anti-horario

        inicio do jogo comeca a contar com o valor da ficha do promeiro que entrou
        quando alguem sair o valor a ficha comeca a valer

    */
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //desenvolva sua solução aqui
        int quantidadeParticipantes = -1;

        //entrada de participantes
        while ((quantidadeParticipantes = toInt(read())) > 0) {

            ArrayList<FichaAluno> alunos = new ArrayList<>();

            if (validaEntradaParticipantes(quantidadeParticipantes)) {
                //preparando cenario do jogo -> incluindo participantes
                for (int i = 1; i <= quantidadeParticipantes; i++) {
                    String[] detalhesParticipante = read().split(" ");
                    String nomeAluno = detalhesParticipante[0];
                    int codigoFicha = Integer.parseInt(detalhesParticipante[1]);

                    if (validaEntradaNumeroFicha(codigoFicha)) {
                        FichaAluno fichaAluno = new FichaAluno(nomeAluno, codigoFicha);
                        alunos.add(fichaAluno);
                    }
                }


                int indiceAtual = 0;
                int indiceAlunoEliminado = 0;
                int valorAtualFicha = alunos.get(indiceAtual).getCodigoFicha();
                int quantidadeDeAlunos = alunos.size();

                while (quantidadeDeAlunos > 1) {

                    //Busca indice a ser eliminado
                    indiceAlunoEliminado = getIndiceAlunoEliminado(indiceAtual, valorAtualFicha, quantidadeDeAlunos);

                    //Guarda valor da ficha do aluno a ser eliminado
                    valorAtualFicha = alunos.get(indiceAlunoEliminado).getCodigoFicha();

                    //remove aluno da lista
                    alunos.remove(indiceAlunoEliminado);

                    //atualiza a quantidade de alunos no jogo
                    quantidadeDeAlunos = alunos.size();

                    //Calcula o incice atual
                    indiceAtual = getIndiceAtual(indiceAlunoEliminado, valorAtualFicha, quantidadeDeAlunos);

                }

            }
            System.out.println("Vencedor(a): " + alunos.get(0).getNome());

        }
    }

    private static int getIndiceAtual(int indiceEliminado, int valorAtualFicha, int quantidadeDeAlunos) {

        final int indiceUltimoElemento = quantidadeDeAlunos - 1;

        if (isNumeroPar(valorAtualFicha)) {
            if (indiceEliminado <= indiceUltimoElemento) {
                return indiceEliminado;
            }
            return 0;
        } else {
            if (indiceEliminado == 0) {
                return indiceUltimoElemento;
            }
            return indiceEliminado - 1;
        }
    }

    private static int getIndiceAlunoEliminado(int indiceAtual, int valorAtualFicha, int quantidadeDeAlunos) {

        //Calculo para agilizar a busca utilizando o resta da divisao entre o valor da ficha com a
        // quantidade de integrantes no jogo
        int buscaDinamica = valorAtualFicha % quantidadeDeAlunos;
        if (isNumeroPar(valorAtualFicha)) {
            return (quantidadeDeAlunos - buscaDinamica + indiceAtual) % quantidadeDeAlunos;

        }
        return (buscaDinamica + indiceAtual) % quantidadeDeAlunos;

    }

    private static boolean validaEntradaNumeroFicha(int numeroFicha) {
        return numeroFicha >= 1 || numeroFicha <= 500;
    }

    private static boolean validaEntradaParticipantes(int quantidade) {
        return quantidade > 1 || quantidade <= 100;
    }

    private static boolean isNumeroPar(int numero) {
        return (numero % 2) == 0;
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class FichaAluno {
    private final String nome;
    private final int codigoFicha;

    public FichaAluno(String nome, int codigoFicha) {
        this.nome = nome;
        this.codigoFicha = codigoFicha;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFicha() {
        return codigoFicha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FichaAluno that = (FichaAluno) o;
        return codigoFicha == that.codigoFicha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoFicha);
    }
}