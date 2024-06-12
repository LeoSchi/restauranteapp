package br.edu.up.model;

public class Delivery {
    private String enderecoEntrega;
    private Pedido pedido;

    public Delivery(String enderecoEntrega, Pedido pedido) {
        this.enderecoEntrega = enderecoEntrega;
        this.pedido = pedido;
    }
    public Delivery(String enderecoEntrega){
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}