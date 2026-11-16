package com.ghada.maquillage.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ghada.maquillage.entities.maquillage;
import com.ghada.maquillage.entities.type;

@RepositoryRestResource(path = "rest")


public interface maquillageRepository extends JpaRepository<maquillage, Long> {

    List<maquillage> findByNommaquillage(String nommaquillage);
    List<maquillage> findByNommaquillageContaining(String nommaquillage);

    
   /* @Query("select p from maquillage p where p.nommaquillage like %?1 and p.prixmaquillaget > ?2")
    List<maquillage> findByNomPrix (String nommaquillage, Double prix);*/
    
    @Query("select p from maquillage p where p.nommaquillage like %:nom and p.prixmaquillage > :prixmaquillage")
    List<maquillage> findByNomPrix (@Param("nom") String nommaquillage,@Param("prixmaquillage") Double prixmaquillage);
    
    
    @Query("select p from maquillage p where p.type = ?1")
    List<maquillage> findBytype (type type);
    
    
    List<maquillage> findBytypeIdtyp(Long id);
    
    List<maquillage> findByOrderByNommaquillageAsc();
    
    @Query("select p from maquillage p order by p.nommaquillage ASC, p.prixmaquillage DESC")
    List<maquillage> triermaquillageNomsPrix ();

    
}