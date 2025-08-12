package br.edu.fatecpg.revisao.model;
import br.edu.fatecpg.revisao.model.Aluno;
import java.util.*;

public class Treinamento {
    int id;
    String nomeInstrutor;
    String linguagemEnsinada;
    List<Aluno> alunos;
    boolean instrutorDisponivel = true;

    public void verificarDisponibilidade() {
        if(instrutorDisponivel) {
            System.out.println("O instrutor " + nomeInstrutor + " está disponível.");
        } else {
            System.out.println("O instrutor " + nomeInstrutor + " não está disponível.");
        }
    }
}
