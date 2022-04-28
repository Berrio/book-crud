package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Serie;
import com.crud.crudbook.service.SerieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class SerieController {

    @Autowired
    private SerieServiceInterface service;

    @GetMapping("get/serie")
    public List<Serie> getAllSerie(){
        return service.getAllSerie();
    }

    @PostMapping("save/serie")
    public Serie saveSerie(@RequestBody Serie serie){
        return service.saveSerie(serie);
    }

    @PutMapping("update/serie")
    public Serie updateSerie(@RequestBody Serie serie){
        return service.updateSerie(serie);
    }

    @DeleteMapping("delete/serie/{id}")
    public void deleteSerie(@PathVariable Long id){
        service.deleteSerie(id);
    }

}