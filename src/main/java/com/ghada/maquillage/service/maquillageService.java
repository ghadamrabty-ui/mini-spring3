package com.ghada.maquillage.service;
import java.util.List;
import com.ghada.maquillage.entities.maquillage;
import com.ghada.maquillage.entities.type;

public interface maquillageService {
	maquillage savemaquillage(maquillage p);
	maquillage updatemaquillage(maquillage p);
	void deletemaquillage(maquillage p);
	void deletemaquillageById(Long id);
	maquillage getmaquillage(Long id);
	List<maquillage> getAllmaquillage();
	
	List<maquillage> findByNommaquillage(String nommaquillage);

	List<maquillage> findByNommaquillageContaining(String nommaquillage);

	List<maquillage> findByNomPrix(String nommaquillage, Double prixmaquillage);

	List<maquillage> findBytype(type type);

	List<maquillage> findBytypeIdtyp(Long id);

	List<maquillage> findByOrderByNommaquillageAsc();

	List<maquillage> triermaquillageNomsPrix();
}