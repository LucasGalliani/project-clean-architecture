package br.com.alura.codechella.domain;

public class Endereco {

    private String cpf;
    private Integer numero;
    private String complemento;

    public Endereco(String cpf, Integer numero, String complemento) {
        this.cpf = cpf;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
