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
    do{
        System.out.println("=== Menu Principal ===");
        System.out.print("Escolha uma opção: ");
        System.out.println("1.Escolher pedido");
        System.out.println("2. Deletar pedido");
        System.out.println("3. Calcular o total");
        System.out.println("4. Sair");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            
        }
    }

    public void adicionarPedido() {
        List<Produto> produtos = new ArrayList<>();
        // Lógica para permitir al usuario seleccionar productos y añadirlos a la lista de productos

        double total = calcularTotal(produtos); // Implementa esta función según tu lógica de negocio
        Pedido pedido = new Pedido(produtos, total);

        pedidoController.adicionarPedido(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    // Implementa métodos adicionales según sea necesario, como calcularTotal()
}