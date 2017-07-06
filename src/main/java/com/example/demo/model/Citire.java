package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by qqqqwww on 05/07/2017.
 */
@Entity
@Table(name = "CITIRE")
public class Citire implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
