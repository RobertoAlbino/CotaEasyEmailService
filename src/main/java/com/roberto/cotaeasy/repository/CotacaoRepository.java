package com.roberto.cotaeasy.repository;

import com.roberto.cotaeasy.domain.entities.Cotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;

@Repository
public interface CotacaoRepository extends JpaRepository<Cotacao, Long> {
    void deleteByProdutoId(long produtoId);
    LinkedList<Cotacao> getAllByUsuarioId(long idUsuario);
}
