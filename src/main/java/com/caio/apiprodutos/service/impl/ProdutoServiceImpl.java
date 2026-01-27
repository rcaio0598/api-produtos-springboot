package com.caio.apiprodutos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.caio.apiprodutos.dto.ProdutoRequestDTO;
import com.caio.apiprodutos.dto.ProdutoResponseDTO;
import com.caio.apiprodutos.exception.ProdutoNotFoundException;
import com.caio.apiprodutos.mapper.ProdutoMapper;
import com.caio.apiprodutos.model.Produto;
import com.caio.apiprodutos.repository.ProdutoRepository;
import com.caio.apiprodutos.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;

    public ProdutoServiceImpl(ProdutoRepository repository, ProdutoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProdutoResponseDTO salvar(ProdutoRequestDTO dto) {
        Produto produto = mapper.toEntity(dto);
        Produto salvo = repository.save(produto);
        return mapper.toResponseDTO(salvo);
    }

    @Override
    public List<ProdutoResponseDTO> listar() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProdutoResponseDTO buscarPorId(Long id) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException("Produto não encontrado"));
        return mapper.toResponseDTO(produto);
    }

    @Override
    public ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException("Produto não encontrado"));

        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());

        Produto atualizado = repository.save(produto);
        return mapper.toResponseDTO(atualizado);
    }

    @Override
    public void remover(Long id) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException("Produto não encontrado"));
        repository.delete(produto);
    }
}
