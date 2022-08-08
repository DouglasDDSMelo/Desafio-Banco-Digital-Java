package Classes;

public abstract class Conta implements Iconta {
	
	private static final int agencia_padrao = 1;
	private static int sequencial = 1;
	
	protected int agencia, numero;
	protected double saldo;
		
	public Conta() {
		this.agencia = agencia_padrao;
		this.numero = sequencial++;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor);
		contadestino.depositar(valor);
	}
	
	protected void imprimirInfo() {
		System.out.println("Agencia: " + agencia);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
	}
		
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
