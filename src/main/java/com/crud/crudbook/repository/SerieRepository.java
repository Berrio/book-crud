package com.crud.crudbook.repository;

import com.crud.crudbook.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie,Long> {
}
