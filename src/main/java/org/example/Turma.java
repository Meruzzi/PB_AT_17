package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Turma {
    private int Codigo;
    private Aluno[] Alunos;
    private Professor professor;
    private Disciplina disciplina;

    public Turma(int codigo) {
        Codigo = codigo;
        Alunos = new Aluno[10];
    }

    public void addAluno(Aluno aluno) {
        int qntAlunos = 0;

        for (int i = 0; i < Alunos.length; i++) {
            if (Alunos[i] != null) {
                qntAlunos++;
                if (qntAlunos >= 10) {
                    break;
                }
            } else {
                Alunos[i] = aluno;
                qntAlunos++;
                break;
            }
        }
    }

    public void addProfessor(Professor prof) {
        this.professor = prof;
    }
    public void addDisciplina(Disciplina disc) {
        this.disciplina = disc;
    }

    public boolean abrirTurma() {
        int qntAlunos = 0;
        for (Aluno al : Alunos) {
            if (al != null) {
                qntAlunos++;
            }
        }

        if (qntAlunos < 11  && qntAlunos > 1) {
            return true;
        } else return false;
    }

    public void gerarPauta() {
        System.out.println("Pauta da turma: " + getCodigo());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("");
        for (Aluno al : Alunos) {
            if (al != null) {
                System.out.println(al.getNome());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder turma = new StringBuilder();
        turma.append("Turma: ").append(this.Codigo).append("\n");
        turma.append("Disciplina: ").append(this.disciplina.getNome() + " ");
        turma.append("Professor: ").append(this.professor.getNome());
        return turma.toString();
    }
}
