package me.dio.bankoo;

public class Main {

	public static void main(String[] args) {
		final String SEPARATOR = "=====================================================";

		Cliente didi = new ClientePessoaFisica("Didi");
		Cliente luis = new ClientePessoaJuridica("Luis");

		Banco bancoBB = new Banco(1,"Banco do Brasil");

		Agencia agenciaSP = new Agencia(bancoBB);
		agenciaSP.setNome("São Paulo");
		Agencia agenciaRJ = new Agencia(bancoBB,"Rio de Janeiro");

		Conta cc = new ContaCorrente(agenciaSP, didi);
		Conta poupanca = new ContaPoupanca(agenciaSP, didi);

		cc.trocarTitularidade(luis);
		System.out.println(" ");

		cc.trocarAgencia(agenciaRJ);
		System.out.println(" ");

		cc.depositar(100);
		cc.transferirValor(100, poupanca);
		
		cc.imprimirExtrato();
		System.out.println(" ");

		poupanca.imprimirExtrato();

		System.out.println(" ");
		System.out.println(SEPARATOR);
		System.out.printf("Lista de Agências do Banco: %s\n",bancoBB.getNome());
		for (Agencia agencia : bancoBB.getAgencias()){
			System.out.println(agencia);
		}
		System.out.println(SEPARATOR);
		System.out.println(" ");
		System.out.println(SEPARATOR);
		System.out.printf("Lista de Contas da Agência: %s\n",agenciaSP.getNome());
		for (Conta conta : agenciaSP.getContas()){
			System.out.println(conta);
		}
		System.out.println(SEPARATOR);
		System.out.println(" ");
		System.out.println(SEPARATOR);
		System.out.printf("Lista de Contas da Agência: %s\n",agenciaRJ.getNome());
		for (Conta conta : agenciaRJ.getContas()){
			System.out.println(conta);
		}
		System.out.println(SEPARATOR);
	}

}
