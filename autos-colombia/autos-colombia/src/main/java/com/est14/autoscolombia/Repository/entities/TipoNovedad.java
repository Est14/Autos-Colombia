package com.est14.autoscolombia.Repository.entities;

import javax.persistence.*;

@Table(name = "tipo_novedad")
@Entity
public class TipoNovedad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
