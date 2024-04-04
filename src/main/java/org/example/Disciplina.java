package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Disciplina {
    private int Codigo;
    private String Nome;
    private List<Turma> Turmas;

    public Disciplina(int codigo, String nome) {
        Codigo = codigo;
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
        System.out.println("Alocacao da Disciplina: " + this.Nome);
        for (Turma turma : Turmas) {
            System.out.println(turma.getProfessor().getNome());
        }
    }

      
}
