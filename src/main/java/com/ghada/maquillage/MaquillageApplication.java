package com.ghada.maquillage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ghada.maquillage.entities.maquillage;

import aj.org.objectweb.asm.Type;

@SpringBootApplication
public class MaquillageApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MaquillageApplication.class, args);
		
	}
	
	@Override
	public void run (String... args)throws Exception{
		repositoryRestConfiguration.exposeIdsFor(maquillage.class,Type.class);

}}
