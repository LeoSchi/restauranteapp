package br.edu.up.view;

import br.edu.up.controller.DeliveryController;
import br.edu.up.model.Delivery;

import java.util.Scanner;

public class DeliveryView {
    private Scanner scanner = new Scanner(System.in);
    private DeliveryController deliveryController = new DeliveryController();

    public void adicionarDelivery() {
        System.out.println("Digite o endereço de entrega:");
        
        Delivery delivery = new Delivery(scanner.nextLine());

        // Lógica para criar um Pedido (ou selecionar um existente) e criar o Delivery
        // Exemplo: Pedido pedido = ...; Delivery delivery = new Delivery(enderecoEntrega, pedido);

        deliveryController.adicionarDelivery(delivery);
        System.out.println("Delivery adicionado com sucesso!");
    }

    // Implementa los métodos restantes según sea necesario
}