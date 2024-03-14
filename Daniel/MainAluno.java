package Daniel;

public class MainAluno {

	public static void main(String[] args) {
		Aluno obj1 = new Aluno();
		Aluno obj2 = new Aluno(25043, "Filipe", 19, 9, 10);
		System.out.println(obj2.dadosAluno());
	}
	
}
