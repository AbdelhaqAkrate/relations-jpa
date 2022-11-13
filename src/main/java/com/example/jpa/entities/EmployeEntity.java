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
    private String name;
    @Basic
    @Column(name = "adresse")
    private String adresse;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public DepartementEntity getIdDep() {
        return idDep;
    }

    public void setIdDep(DepartementEntity idDep) {
        this.idDep = idDep;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
