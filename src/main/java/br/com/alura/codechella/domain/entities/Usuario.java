package br.com.alura.codechella.domain.entities;

import br.com.alura.codechella.domain.Endereco;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String email;
    private Endereco endereco;


    public Usuario( String cpf,String nome,LocalDate nascimento, String email) {

        System.out.println("CPF: " + cpf);

        if (cpf == null || !cpf.trim().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }


        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nascimento=" + nascimento +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
