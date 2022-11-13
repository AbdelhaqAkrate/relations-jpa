package com.example.jpa.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "departement", schema = "jpa")
public class DepartementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idDep;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
