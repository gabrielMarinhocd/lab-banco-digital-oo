import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();

		List<Cliente> clientes = new ArrayList<>();

		clientes.add(venilton);

		Banco banco = new Banco();
		banco.imprimeClientes(clientes);
	}

}
