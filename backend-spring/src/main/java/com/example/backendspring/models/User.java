package com.example.backendspring.models;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@ApiModel(description = "les details d'un utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 //   @ApiModelProperty(notes = "ID utilisateur", name = "id", required = true, value = "1234")
    private int id;

 //   @ApiModelProperty(notes = "Nom utilisateur", name = "nom", required = true, value = "Olivier")
    private String nom;

 //   @ApiModelProperty(notes = "Prenom utilisateur", name = "prenom", required = true, value = "Durand")
    private String prenom;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
