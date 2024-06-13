package br.edu.up.dao;

import br.edu.up.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private List<Pedido> pedidos = new ArrayList<>();
    private int nextId = 1;

    public void adicionar(Pedido pedido) {
        pedido.setId(nextId++);
        pedidos.add(pedido);
    }

    public void remover(int id) {
        pedidos.removeIf(p -> p.getId() == Id);
    }

    public void atualizar(Pedido pedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId() == pedido.getId()) {
                pedidos.set(i, pedido);
                return;
            }
        }
    }

    public Pedido obter(int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == Id) {
                return pedido;
            }
        }
        return null;
    }

    public List<Pedido> listar() {
        return new ArrayList<>(pedidos);
    }
}