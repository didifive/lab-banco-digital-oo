package me.dio.bankoo;

public abstract class Cliente {

	private static int SEQUENCIAL = 1;

	private final int codigoCliente;
	private String nome;

	public Cliente(String nome){
		this.codigoCliente = SEQUENCIAL++;
		this.nome = nome;
	};

	public int getCodigoCliente() {	return codigoCliente; }
	public String getNome() {	return nome; }
	public void setNome(String nome) { this.nome = nome; }

}
