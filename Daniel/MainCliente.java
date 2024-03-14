package Daniel;

public class MainCliente {

	public static void main(String[] args) {
		Cliente obj1 = new Cliente(1002, 3642, "Filipe", 1000000);
		Cliente obj2 = new Cliente(1234, 3636, "Fulano", 1);
		
		obj1.depositar(10000);
		obj1.sacar(4000);
		System.out.println(obj1.toString());

		obj2.depositar(1000);
		obj2.sacar(400);
		System.out.println(obj2.toString());

	}
	
}
