package Daniel;

public class Aluno2 {
	    
	    private int numeroAluno;
	    private String nome;
	    private int idade;
	    private float p1;
	    private float p2;
	    
	    public Aluno2() {
	        this.numeroAluno = 0;
	        this.nome = "";
	        this.idade = 0;
	        this.p1 = 0.0f;
	        this.p2 = 0.0f;
	    }
	    
	    public Aluno2(int numeroAluno, String nome, int idade, float p1, float p2) {
	        this.setNumeroAluno(numeroAluno);
	        this.setNome(nome);
	        this.setIdade(idade);
	        this.setP1(p1);
	        this.setP2(p2);
	    }
	    
	    public int getNumeroAluno() {
	        return this.numeroAluno;
	    }

	    public void setNumeroAluno(int numeroAluno) {
	        if (String.valueOf(numeroAluno).length() == 6) {
	            this.numeroAluno = numeroAluno;
	        } else {
	            System.out.println("O número do aluno deve ter 6 caracteres!");
	        }
	    }

	    public String getNome() {
	        return this.nome;
	    }

	    public void setNome(String nome) {
	        if (nome.length() <= 30) {
	            this.nome = nome;
	        } else {
	            System.out.println("O nome não pode exceder 30 caracteres!");
	        }
	    }

	    public int getIdade() {
	        return this.idade;
	    }

	    public void setIdade(int idade) {
	        if (idade >= 0) {
	            this.idade = idade;
	        } else {
	            System.out.println("A idade não pode ser negativa!");
	        }
	    }

	    public float getP1() {
	        return this.p1;
	    }

	    public void setP1(float x) {
	        if (p1 >= 0) {
	            this.p1 = x;
	        } else {
	            System.out.println("A nota P1 não pode ser negativa!");
	        }
	    }

	    public float getP2() {
	        return this.p2;
	    }

	    public void setP2(float x) {
	        if (p2 >= 0) {
	            this.p2 = x;
	        } else {
	            System.out.println("A nota P2 não pode ser negativa!");
	        }
	    }
	    
	    public void notaFinal() {
	        float media = (this.p1 + this.p2) / 2;
	        System.out.println("A média final do aluno é: " + media);
	    }

	    public void dadosAluno() {
	        System.out.println("\nNúmero do aluno: " + this.numeroAluno);
	        System.out.println("\nNome do aluno: " + this.nome);
	        System.out.println("\nIdade do aluno: " + this.idade);
	    }
}