package Daniel;

public class Aluno {
	
	public int nroAluno, idade;
	
	public String nome;
	
	public float p1, p2;
	//construtores
	
	public  Aluno() {}
	
	public  Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
		this.nroAluno = nroAluno; this.nome = nome;
		this.idade = idade; this.p1 = p1; this.p2 = p2;
	}
	//função retorna a media
	
	public float notaFinal() {
		return (this.p1 + this.p2) / 2;
	}
	// função mostra se o aluno passou
	
	public void passou() {
		if(this.notaFinal() >= 6) {
			System.out.println("Aprovado");
		}
		else{
			System.out.println("Reprovado");
		}
	}
	//metodo que retorna
	
	public String dadosAluno() {
		return "Número: " + this.nroAluno + " Nome: " + this.nome +
				" Idade: " + this.idade + " Média " + this.notaFinal();
		
	}
	
}
