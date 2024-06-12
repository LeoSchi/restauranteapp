package br.edu.up.controller;

import br.edu.up.dao.ProdutoDAO;
import br.edu.up.model.Produto;

public class ProdutoController {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public void adicionarProduto(Produto produto) {
        produtoDAO.adicionar(produto);
    }

    // Implementa los métodos restantes según sea necesario
}