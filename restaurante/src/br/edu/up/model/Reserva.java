package br.edu.up.model;

import java.util.Date;

public class Reserva {
    private Date data;
    private String nomeCliente;
    private int numeroPessoas;

    public Reserva(Date data, String nomeCliente, int numeroPessoas) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.numeroPessoas = numeroPessoas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

}