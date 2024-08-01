import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimeClientes(List<Cliente> clientes) {
		System.out.println("=== Extrato Conta Corrente ===");

		clientes.stream().forEach((Cliente cliente) -> {

			Conta cc = new ContaCorrente(cliente);
			Conta poupanca = new ContaPoupanca(cliente);

			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
		});

	}

}
