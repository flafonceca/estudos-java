package Poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno ("Carlos José", "carlos.jose@gmail.com", "00000", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João Pedro", "joao@gmail.com", "034343", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria Antonia", "maria@gmail.com", "43424342");
        p1.seApresentar();

        Pessoa p2=new Aluno("Carlos José", "carlos.jose@gmail.com", "454780", 7.5);

        Pessoa p3=new Professor ("João Pedro", "joao@gmail.com", "978512", "TI");
        System.out.println("================");
        p2.seApresentar();
        p3.seApresentar();

        System.out.println(" === PESSOAS ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa: pessoas) {
            pessoa.seApresentar();
        }

    }
}
