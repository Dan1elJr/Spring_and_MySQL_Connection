package com.danieljunior.projetopessoal.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.danieljunior.projetopessoal.domain.Usuario;
import com.danieljunior.projetopessoal.repository.UserRepository;




@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	private UserRepository repo;
	@Override
	public void run(String... args) throws Exception {
		Usuario usr = new Usuario(null,"Daniel",24);
		Usuario usr2 = new Usuario(null,"Shyrleimara",23);
		Usuario usr3 = new Usuario(null,"José",60);
		
		repo.saveAll(Arrays.asList(usr,usr2,usr3));
		
		
	}

}
