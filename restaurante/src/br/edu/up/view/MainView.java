package br.edu.up.view;

import br.edu.up.controller.ReservaController;
import br.edu.up.dao.ReservaDAO;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        DeliveryView deliveryView = new DeliveryView();
        PedidoView pedidoView = new PedidoView();
        ProdutoView produtoView = new ProdutoView();
        ReservaView reservaView = new ReservaView();

        // Adicionando instância ReservaController
        ReservaDAO reservaDAO = new ReservaDAO();
        ReservaController reservaController = new ReservaController(reservaDAO, reservaView);

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Cadastro de Produtos");
            System.out.println("2. Realizar Reserva");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Solicitar Delivery");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    produtoView.adicionarProduto();
                    break;
                case 2:
                    reservaController.iniciar(); // Chamando o método iniciar do controller para abrir o menu de reservas
                    break;
                case 3:
                    pedidoView.adicionarPedido();
                    break;
                case 4:
                    deliveryView.adicionarDelivery();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}