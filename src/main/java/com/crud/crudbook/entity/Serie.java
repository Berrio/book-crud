package com.crud.crudbook.entity;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "Serie")
@Table(name = "serie")
@Data
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

    private Integer numberHours;
}