package me.dio.bankoo;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferirValor(double valor, IConta contaDestino);

	void trocarTitularidade(Cliente novoCliente);
	
	void imprimirExtrato();
}
