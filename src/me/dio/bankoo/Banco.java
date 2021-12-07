package me.dio.bankoo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final int codigoBanco;
    private final String nome;
    private String CNPJ;
    private List<Agencia> agencias = new ArrayList<>();

    public Banco(int codigoBanco, String nomeBanco){
        this.codigoBanco = codigoBanco;
        this.nome = nomeBanco;
    }

    public int getCodigoBanco() { return codigoBanco; }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() { return CNPJ; }

    public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void adicionaAgencia(Agencia agencia) { this.agencias.add(agencia); }

    @Override
    public String toString(){
        return String.format(
            "Banco: %d-%s"
            ,getCodigoBanco(),getNome()
        );
    }
}
