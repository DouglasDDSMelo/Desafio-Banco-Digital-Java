package Classes;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca(); // polimorfismo.

		cc.depositar(100);
		cc.depositar(50);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
