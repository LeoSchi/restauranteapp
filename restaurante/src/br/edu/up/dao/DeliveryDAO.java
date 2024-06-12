package br.edu.up.dao;

import br.edu.up.model.Delivery;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO implements DAO<Delivery> {
    private List<Delivery> deliveries = new ArrayList<>();

    @Override
    public void adicionar(Delivery delivery) {
        deliveries.add(delivery);
    }

    @Override
    public Delivery buscar(String id) {
        for (Delivery d : deliveries) {
            if (d.getPedido().getId().equals(id)) { 
                return d;
            }
        }
        return null;
    }

    @Override
    public List<Delivery> listar() {
        return new ArrayList<>(deliveries);
    }

    @Override
    public void atualizar(Delivery delivery) {
        Delivery existente = buscar(delivery.getPedido().getId());
        if (existente != null) {
            existente.setEnderecoEntrega(delivery.getEnderecoEntrega());
            existente.setPedido(delivery.getPedido());
        }
    }

    @Override
    public void remover(String id) {
        Delivery delivery = buscar(id);
        if (delivery != null) {
            deliveries.remove(delivery);
        }
    }
}