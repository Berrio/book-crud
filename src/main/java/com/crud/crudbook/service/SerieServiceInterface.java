package com.crud.crudbook.service;

import com.crud.crudbook.entity.Serie;

import java.util.List;

public interface SerieServiceInterface {
    List<Serie> getAllSerie();

    Serie saveSerie(Serie serie);

    Serie updateSerie(Serie serie);

    void deleteSerie(Long id);
}
