package com.unitri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitri.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
