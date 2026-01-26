package com.caio.apiprodutos.controller;

import com.caio.apiprodutos.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    // Lista em memória (simula banco de dados)
    private List<Produto> produtos = new ArrayList<>();

    // GET /produtos -> lista todos
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtos;
    }

    // GET /produtos/{id} -> busca por id
    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    // POST /produtos -> adiciona produto
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }

    // DELETE /produtos/{id} -> remove produto
    @DeleteMapping("/{id}")
    public void removerProduto(@PathVariable Long id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }
}
