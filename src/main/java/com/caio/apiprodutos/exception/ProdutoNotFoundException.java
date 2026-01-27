package com.caio.apiprodutos.exception;

public class ProdutoNotFoundException extends RuntimeException {

    public ProdutoNotFoundException(String mensagem) {
        super(mensagem);
    }
}
