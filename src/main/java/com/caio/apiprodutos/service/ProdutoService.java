package com.caio.apiprodutos.service;

public interface ProdutoService extends ProdutoCommandService, ProdutoQueryService {
    // Interface legado (facade) para compatibilidade.
    // Para ISP, prefira depender de ProdutoCommandService e/ou ProdutoQueryService.
    // Mantém o contrato completo estendendo interfaces menores.
}
