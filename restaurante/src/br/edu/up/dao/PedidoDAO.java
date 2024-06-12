package br.edu.up.dao;

import br.edu.up.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO implements DAO<Pedido> {
    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void adicionar(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public Pedido buscar(String id) {
        for (Pedido p : pedidos) {
            if (p.getId().equals(id)) { 
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Pedido> listar() {
        return new ArrayList<>(pedidos);
    }

    @Override
    public void atualizar(Pedido pedido) {
        Pedido existente = buscar(pedido.getId());
        if (existente != null) {
            existente.setProdutos(pedido.getProdutos());
            existente.setTotal(pedido.getTotal());
        }
    }

    @Override
    public void remover(String id) {
        Pedido pedido = buscar(id);
        if (pedido != null) {
            pedidos.remove(pedido);
        }
    }
}