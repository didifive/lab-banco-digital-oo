package me.dio.bankoo;

public class ContaCorrente extends Conta {

	public ContaCorrente(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println("======== Fim do Extrato =========");
	}
	
}
