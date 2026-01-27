package com.caio.apiprodutos.service;

import java.util.List;

import com.caio.apiprodutos.dto.ProdutoRequestDTO;
import com.caio.apiprodutos.dto.ProdutoResponseDTO;

public interface ProdutoService {

    ProdutoResponseDTO salvar(ProdutoRequestDTO dto);

    List<ProdutoResponseDTO> listar();

    ProdutoResponseDTO buscarPorId(Long id);

    ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto);

    void remover(Long id);
}
