package Daniel;

public class Cliente {
	
	public int nroConta, nroAgencia;
	
	public String nome;
	
	public float saldo;
	
	public void depositar(float x) {
		this.saldo += x;
	}
	
	public Cliente(int nroConta, int nroAgencia, String nome, float saldo) {
		this.nroConta = nroConta;
		this.nroAgencia = nroAgencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void sacar(float x) {
		if(this.saldo - x >= 0) {
			this.saldo -= x;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public String toString() {
		return "Cliente{" +
                "nroConta=" + this.nroConta +
                ", nroAgencia=" + this.nroAgencia +
                ", nome='" + this.nome + '\'' +
                ", saldo=" + this.saldo + 
                '}';

	}
}
