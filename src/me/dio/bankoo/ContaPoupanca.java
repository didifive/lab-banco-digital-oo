package me.dio.bankoo;

public class ContaPoupanca extends Conta {

	private double rendimentoAnual;

	public ContaPoupanca(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
		rendimentoAnual = 0d;
	}

	public double getRendimentoAnual() { return rendimentoAnual; }

	public void setRendimentoAnual(double rendimentoAnual) { this.rendimentoAnual = rendimentoAnual; }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Poupança ===");
		super.imprimirInfosComuns();
		System.out.printf("Rendimento: %.3f\n",getRendimentoAnual());
		System.out.println("======== Fim do Extrato =========");
	}
}
