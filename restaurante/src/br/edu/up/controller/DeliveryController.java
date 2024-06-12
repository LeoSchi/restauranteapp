package br.edu.up.controller;

import br.edu.up.dao.DeliveryDAO;
import br.edu.up.model.Delivery;

public class DeliveryController {
    private DeliveryDAO deliveryDAO = new DeliveryDAO();

    public void adicionarDelivery(Delivery delivery) {
        deliveryDAO.adicionar(delivery);
    }

    // Implementa los métodos restantes según sea necesario
}