package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Aluno {
    private int Matricula;
    private String Nome;
    private List<Turma> Turmas;

    public Aluno(int matricula, String nome) {
        Matricula = matricula;
        Nome = nome;
    }

    public void addTurma(Turma turma) {
        if(Turmas == null) {
            Turmas = new ArrayList<>();
            Turmas.add(turma);
        } else {
            Turmas.add(turma);
        }
    }

    public void exibirTurmas() {
        System.out.println("Alocaçao do Aluno: Aluno " + getMatricula());
        for (Turma turma : Turmas) {
            System.out.println(turma.getDisciplina().getNome());
        }
    }



}
