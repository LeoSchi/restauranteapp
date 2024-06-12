package br.edu.up.view;

import br.edu.up.controller.ClienteController;
import br.edu.up.controller.DeliveryController;
import br.edu.up.controller.PedidoController;
import br.edu.up.controller.ProdutoController;
import br.edu.up.controller.ReservaController;

import java.util.Scanner;

public class MainView {
    public Scanner scanner = new Scanner(System.in);
    public ClienteController clienteController = new ClienteController();
    public DeliveryController deliveryController = new DeliveryController();
    public PedidoController pedidoController = new PedidoController();
    public ProdutoController produtoController = new ProdutoController();
    public ReservaController reservaController = new ReservaController();

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Cadastro de Cliente");
            System.out.println("2. Pedido");
            System.out.println("3. Delivery");
            System.out.println("4. Reserva");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    exibirMenuCliente();
                    break;
                case 2:
                    exibirMenuPedido();
                    break;
                case 3:
                    exibirMenuDelivery();
                    break;
                case 4:
                    exibirMenuReserva();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void exibirMenuCliente() {
        // Implementar a lógica para o menu de cliente
    }

    private void exibirMenuPedido() {
        // Implementar a lógica para o menu de pedido
    }

    private void exibirMenuDelivery() {
        // Implementar a lógica para o menu de delivery
    }

    private void exibirMenuReserva() {
        // Implementar a lógica para o menu de reserva
    }
}