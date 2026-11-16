package com.ghada.maquillage.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ghada.maquillage.entities.type;


@RepositoryRestResource(path = "typ")
@CrossOrigin(origins ="http://localhost:4200/") //pour autoriser angula
public interface typeRepository extends JpaRepository<type,Long>{

}
