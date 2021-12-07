package me.dio.bankoo;

import java.util.ArrayList;
import java.util.List;

public class Agencia{

    private static short SEQUENCIAL = 1;

    private final short codigoAgencia;
    private String nome;
    private final Banco banco;
    private List<Conta> contas = new ArrayList<>();
    private boolean ativada;

    public Agencia(Banco banco) {
        this.codigoAgencia = SEQUENCIAL++;
        this.banco = banco;
        this.ativada = true;
        banco.adicionaAgencia(this);
    }

    public Agencia(Banco banco, String nome) {
        this.codigoAgencia = SEQUENCIAL++;
        this.banco = banco;
        this.nome = nome;
        this.ativada = true;
        banco.adicionaAgencia(this);
    }

    public short getCodigoAgencia() {
        return codigoAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getBanco() {
        return banco.toString();
    }

    public boolean isAtivada() { return ativada; }

    public void setAtivada(boolean ativada) { this.ativada = ativada; }

    public void adicionaConta(Conta contas) { this.contas.add(contas); }

    public void removeConta(Conta contas) {
        this.contas.remove(contas);
    }

    @Override
    public String toString() {
        return String.format(
                "Agência: %d-%s"
                ,getCodigoAgencia(), getNome()
        );
    }
}