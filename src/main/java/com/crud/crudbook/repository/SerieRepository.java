package com.crud.crudbook.repository;

import com.crud.crudbook.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Long> {
}
