package com.caio.apiprodutos.controller;

import com.caio.apiprodutos.model.Produto;
import com.caio.apiprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // GET /produtos
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    // GET /produtos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);

        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST /produtos
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // PUT /produtos/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id,
                                                   @RequestBody Produto produtoAtualizado) {

        Optional<Produto> produtoExistente = produtoRepository.findById(id);

        if (produtoExistente.isPresent()) {
            Produto p = produtoExistente.get();
            p.setNome(produtoAtualizado.getNome());
            p.setPreco(produtoAtualizado.getPreco());
            p.setQuantidade(produtoAtualizado.getQuantidade());

            produtoRepository.save(p);
            return ResponseEntity.ok(p);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE /produtos/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);

        if (produto.isPresent()) {
            produtoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
