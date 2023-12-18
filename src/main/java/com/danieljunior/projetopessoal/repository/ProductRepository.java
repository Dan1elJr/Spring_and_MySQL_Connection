package com.danieljunior.projetopessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieljunior.projetopessoal.domain.Produto;

public interface ProductRepository extends JpaRepository<Produto, Long> {

}
