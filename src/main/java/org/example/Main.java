package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Professor> professores = new ArrayList<>();
    public static List<Disciplina> disciplinas = new ArrayList<>();
    public static List<Turma> turmas = new ArrayList<>();
    public static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        alunos.add(new Aluno(1, "Aluno 1"));
        alunos.add(new Aluno(2, "Aluno 2"));
        alunos.add(new Aluno(3, "Aluno 3"));
        alunos.add(new Aluno(4, "Aluno 4"));
        professores.add(new Professor(10, "João"));
        professores.add(new Professor(20, "José"));
        disciplinas.add(new Disciplina(10, "Java"));
        disciplinas.add(new Disciplina(20, ".NET"));
        disciplinas.add(new Disciplina(30, "PB"));

        turmas.add(new Turma(1));
        turmas.getFirst().addDisciplina(disciplinas.getFirst());
        turmas.getFirst().addProfessor(professores.getFirst());
        professores.getFirst().addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.getFirst());
        alunos.getFirst().addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(1));
        alunos.get(1).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(2));
        alunos.get(2).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(3));

        turmas.add(new Turma(2));
        turmas.get(1).addDisciplina(disciplinas.get(1));
        disciplinas.get(1).addTurma(turmas.get(1));
        turmas.get(1).addProfessor(professores.get(1));
        professores.get(1).addTurma(turmas.get(1));
        turmas.get(1).addAluno(alunos.getFirst());
        alunos.getFirst().addTurma(turmas.get(1));

        turmas.add(new Turma(3));
        turmas.get(2).addDisciplina(disciplinas.get(2));
        turmas.get(2).addProfessor(professores.get(1));
        professores.get(1).addTurma(turmas.get(2));
        turmas.get(2).addAluno(alunos.get(2));


        System.out.println("Alocação de Turmas: ");
        turmas.forEach(turma -> {
            System.out.println(turma.toString());
        });
        System.out.println("");

        turmas.getFirst().gerarPauta();

        System.out.println("");

        alunos.getFirst().exibirTurmas();

        System.out.println("");

        professores.get(1).exibirTurmas();

        System.out.println("");

        disciplinas.get(1).exibirTurmas();

    }
}