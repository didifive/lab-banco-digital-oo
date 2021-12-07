package me.dio.bankoo;


public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;

	protected Agencia agencia;
	protected final int numero;
	protected double saldo;
	protected Cliente cliente;


	public Conta(Agencia agencia, Cliente cliente) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		agencia.adicionaConta(this);
	}

	public void trocarAgencia(Agencia novaAgencia) {
		Agencia agenciaAntiga = this.agencia;
		this.agencia = novaAgencia;
		novaAgencia.adicionaConta(this);
		agenciaAntiga.removeConta(this);
		System.out.printf("""
						=============== ATENÇÃO ================
						A conta %d teve sua agência alterada:
						De %s, foi para %s.
						========================================
						""",
					getNumero(), agenciaAntiga.getNome(), this.agencia.getNome()
				);
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
	public void transferirValor(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void trocarTitularidade(Cliente novoCliente) {
		Cliente clienteAntigo = this.cliente;
		this.cliente = novoCliente;
		System.out.printf("""
						============ ATENÇÃO =============
						A titularidade da conta %d mudou:
						De %s, foi para %s.
						==================================
						"""
			,getNumero(),clienteAntigo.getNome(), cliente.getNome()
		);
	}

	public String getNomeAgencia() {
		return this.agencia.getNome();
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.printf("""
						%s
						Titular: %s
						Número: %d -- %s
						Saldo: %.2f
						"""
						,agencia.getBanco(), this.cliente.getNome(), this.numero, agencia, this.saldo);
	}

	@Override
	public String toString() {
		return String.format("Número: %d- Saldo atual: %.2f"
				,getNumero(), getSaldo()
		);
	}
}
