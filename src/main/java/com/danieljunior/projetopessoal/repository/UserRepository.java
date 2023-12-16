package com.danieljunior.projetopessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieljunior.projetopessoal.domain.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
