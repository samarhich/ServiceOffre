package com.example.service_offreEmploi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Offre {
    @Id
    @GeneratedValue
    long code;
    String intitulé;
    String spécialité;
    String société;
    int nbpostes;
    String pays;

    public Offre() {
    }

    public Offre(String intitulé, String spécialité, String société, int nbpostes, String pays) {
        this.spécialité = spécialité;
        this.intitulé = intitulé;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }



    // Getters et Setters
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitulé;
    }

    public void setIntitule(String intitule) {
        this.intitulé = intitule;
    }

    public String getSpecialite() {
        return spécialité;
    }

    public void setSpecialite(String specialité) {
        this.spécialité = specialité;
    }

    public String getSociete() {
        return société;
    }

    public void setSociete(String société) {
        this.société = société;
    }

    public int getNbPostes() {
        return nbpostes;
    }

    public void setNbPostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}