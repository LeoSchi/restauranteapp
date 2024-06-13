package br.edu.up.controller;

import java.util.List;

import br.edu.up.dao.PedidoDAO;
import br.edu.up.model.Pedido;

public class PedidoController {
    private PedidoDAO pedidoDAO = new PedidoDAO();

    public void adicionarPedido(Pedido pedido) {
        pedidoDAO.adicionar(pedido);

    }

    public void removerPedido(int id) {
        pedidoDAO.remover(id);
    }

    public void atualizarPedido(Pedido pedido) {
        pedidoDAO.atualizar(pedido);
    }

    public Pedido obterPedido(int id) {
        return pedidoDAO.obter(id);
    }

    public List<Pedido> listarPedidos() {
        return pedidoDAO.listar();
    }
        
}