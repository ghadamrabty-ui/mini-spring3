package com.ghada.maquillage;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghada.maquillage.entities.maquillage;
import com.ghada.maquillage.entities.type;
import com.ghada.maquillage.repos.maquillageRepository;

@SpringBootTest
class MaquillageApplicationTests {

    @Autowired
    private maquillageRepository maquillageRepository;

    @Test
    public void testCreatemaquillage() {
        maquillage maq = new maquillage("Maybelline mascara", 80.0, new Date());
        maquillageRepository.save(maq);
    }

    @Test
    public void testFindmaquillage() {
        maquillage m = maquillageRepository.findById(1L).get();
        System.out.println(m);
    }

    @Test
    public void testUpdateProduit() {
        maquillage m = maquillageRepository.findById(1L).get();
        m.setPrixmaquillage(1000.0);
        maquillageRepository.save(m);
        System.out.println(m);
    }

    @Test
    public void testDeleteProduit() {
        maquillageRepository.deleteById(1L);
    }

    @Test
    public void testfindallmaquillage() {
        List<maquillage> maq = maquillageRepository.findAll();
        for (maquillage m : maq) {
            System.out.println(m);
        }
    }

    @Test
    public void testfindByNommaquillage() {
        List<maquillage> maq = maquillageRepository.findByNommaquillage("Maybelline mascara");
        for (maquillage m : maq) {
            System.out.println(m);
        }
    }

    @Test
    public void testfindByNommaquillageContaining() {
        List<maquillage> maq = maquillageRepository.findByNommaquillageContaining("Maybelline");
        for (maquillage m : maq) {
            System.out.println(m);
        }
    }

@Test
public void testfindByNomPrix()
	 {
	List<maquillage>  maq = maquillageRepository.findByNomPrix("Maybelline Fit Me Matte", 200.500);
		for (maquillage m : maq)
			{
				System.out.println(m);
			}
		
	 }

@Test
public void testfindBytype()
 {
	type typ = new type();
	typ.setIdtyp(1L);			
	List<maquillage>  maq = maquillageRepository.findBytype(typ);
		for (maquillage m : maq)
		{
			System.out.println(m);
		}
 }

@Test
public void findBytypeIdtyp()
	 {			
		List<maquillage>  maq = maquillageRepository.findBytypeIdtyp(1L);
			for (maquillage m : maq)
			{
				System.out.println(m);
			}
       }

@Test
public void findByOrderByNommaquillageAsc ()
 {
	List<maquillage>  maq =    maquillageRepository.findByOrderByNommaquillageAsc();	 
		for (maquillage m : maq)
		{
			System.out.println(m);
		}
 }

@Test
public void testTriermaquillagesNomsPrix()
 {
	List<maquillage>  maq = maquillageRepository.triermaquillageNomsPrix();	 
		for (maquillage m : maq)
		{
			System.out.println(m);
		}
 }}












