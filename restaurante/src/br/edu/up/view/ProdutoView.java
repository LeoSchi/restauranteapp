package br.edu.up.view;

import br.edu.up.controller.ProdutoController;
import br.edu.up.model.Produto;

import java.util.Scanner;

public class ProdutoView {
    private Scanner scanner = new Scanner(System.in);
    private ProdutoController produtoController = new ProdutoController();

    public void adicionarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        Produto produto = new Produto(nome, preco);
        produtoController.adicionarProduto(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // Implementa métodos adicionales según sea necesario
}