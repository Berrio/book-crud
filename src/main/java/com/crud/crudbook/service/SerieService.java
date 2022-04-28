package com.crud.crudbook.service;

import com.crud.crudbook.entity.Serie;
import com.crud.crudbook.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SerieService implements SerieServiceInterface{

    @Autowired
    private SerieRepository SerieRepository;

    @Override
    public List<Serie> getAllSerie() {
        return SerieRepository.findAll();
    }

    @Override
    public Serie saveSerie(Serie serie) {
        return SerieRepository.save(serie);
    }

    @Override
    public Serie updateSerie(Serie serie) {
        return SerieRepository.save(serie);
    }

    @Override
    public void deleteSerie(Long id) {
        SerieRepository.deleteById(id);
    }
}
