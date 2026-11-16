package com.ghada.maquillage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghada.maquillage.entities.maquillage;
import com.ghada.maquillage.entities.type;
import com.ghada.maquillage.repos.maquillageRepository;
@Service
public class maquillageServicelmpl implements maquillageService {

    @Autowired
    private maquillageRepository maquillageRepository;

    @Override
    public maquillage savemaquillage(maquillage p) {
        return maquillageRepository.save(p);
    }

    @Override
    public maquillage updatemaquillage(maquillage p) {
        return maquillageRepository.save(p);
    }

    @Override
    public void deletemaquillage(maquillage p) {
        maquillageRepository.delete(p);
    }

    @Override
    public void deletemaquillageById(Long id) {
        maquillageRepository.deleteById(id);
    }

    @Override
    public maquillage getmaquillage(Long id) {
        return maquillageRepository.findById(id).get();
    }

    @Override
    public List<maquillage> getAllmaquillage() {
        return maquillageRepository.findAll();
    }

    @Override
    public List<maquillage> findByNommaquillage(String nommaquillage) {
        return maquillageRepository.findByNommaquillage(nommaquillage);
    }

    @Override
    public List<maquillage> findByNommaquillageContaining(String nommaquillage) {
        return maquillageRepository.findByNommaquillageContaining(nommaquillage);
    }

    @Override
    public List<maquillage> findByNomPrix(String nommaquillage, Double prixmaquillage) {
        return maquillageRepository.findByNomPrix(nommaquillage, prixmaquillage);
    }

    @Override
    public List<maquillage> findBytype(type type) {
        return maquillageRepository.findBytype(type);
    }

    @Override
    public List<maquillage> findBytypeIdtyp(Long id) {
        return maquillageRepository.findBytypeIdtyp(id);
    }

    @Override
    public List<maquillage> findByOrderByNommaquillageAsc() {
        return maquillageRepository.findByOrderByNommaquillageAsc();
    }

    @Override
    public List<maquillage> triermaquillageNomsPrix() {
        return maquillageRepository.triermaquillageNomsPrix();
    }
}