package br.edu.up.controller;

import br.edu.up.dao.PedidoDAO;
import br.edu.up.model.Pedido;

public class PedidoController {
    private PedidoDAO pedidoDAO = new PedidoDAO();

    public void adicionarPedido(Pedido pedido) {
        pedidoDAO.adicionar(pedido);
    }

    // Implementa los métodos restantes según sea necesario
}