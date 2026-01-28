package com.caio.apiprodutos.validation;

import com.caio.apiprodutos.model.Produto;

/**
 * Orquestrador de validações (OCP): o Service depende desta abstração,
 * e novas regras podem ser adicionadas via novos beans de ProdutoValidation.
 */
public interface ProdutoValidator {
    void validar(Produto produto);
}

