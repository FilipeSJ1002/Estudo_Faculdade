package main;

import Daniel.Aluno2;

public class MainAluno2 {
	public static void main(String[] args) {
		
		Aluno2 aluno1 = new Aluno2();
        
        aluno1.setNumeroAluno(123456);
        aluno1.setNome("João da Silva");
        aluno1.setIdade(20);
        aluno1.setP1(8.5f);
        aluno1.setP2(7.5f);

        aluno1.notaFinal();
        aluno1.dadosAluno();
		
	}
}
