package br.edu.up.view;

import br.edu.up.controller.PedidoController;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoView {
    private Scanner scanner = new Scanner(System.in);
    private PedidoController pedidoController = new PedidoController();
    private ProdutoView produtoView = new ProdutoView(); // Utilizado para seleccionar productos

    public void adicionarPedido() {
        List<Produto> produtos = new ArrayList<>();
        // Lógica para permitir al usuario seleccionar productos y añadirlos a la lista de productos

        double total = calcularTotal(produtos); // Implementa esta función según tu lógica de negocio
        Pedido pedido = new Pedido(produtos, total);

        pedidoController.adicionarPedido(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    public void removerPedido() {
        System.out.println("Digite o ID do pedido a ser removido:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        pedidoController.removerPedido(id);
        System.out.println("Pedido removido com sucesso!");
    }

    public void atualizarPedido() {
        System.out.println("Digite o ID do pedido a ser atualizado:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Aquí podrías solicitar los nuevos datos para el pedido
        List<Produto> produtos = new ArrayList<>();
        double total = calcularTotal(produtos);
        Pedido pedido = new Pedido(produtos, total);
        pedido.setId(Id);

        pedidoController.atualizarPedido(pedido);
        System.out.println("Pedido atualizado com sucesso!");
    }

    public void listarPedidos() {
        List<Pedido> pedidos = pedidoController.listarPedidos();
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    private double calcularTotal(List<Produto> produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}