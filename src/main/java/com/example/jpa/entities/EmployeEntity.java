package com.example.jpa.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "employee", schema = "jpa")

public class EmployeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private int name;
    @Basic
    @Column(name = "adresse")
    private int adresse;
    @Basic
    @Column(name = "phone")
    private int phone;
    @ManyToOne
    @JoinColumn(name = "idDep")
    private DepartementEntity idDep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    public DepartementEntity getIdDep() {
        return idDep;
    }

    public void setIdDep(DepartementEntity idDep) {
        this.idDep = idDep;
    }
}
