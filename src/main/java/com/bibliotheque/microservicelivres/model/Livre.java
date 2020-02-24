package com.bibliotheque.microservicelivres.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Livre {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String titre;
    @NotNull
    private Date dateDeParution;
    @NotNull
    private String nomAuteur;
    @NotNull
    private String prenomAuteur;

    public Livre() {
    }

    public Livre(Long id, String titre, Date dateDeParution, String nomAuteur, String prenomAuteur) {
        this.id = id;
        this.titre = titre;
        this.dateDeParution = dateDeParution;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateDeParution() {
        return dateDeParution;
    }

    public void setDateDeParution(Date dateDeParution) {
        this.dateDeParution = dateDeParution;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", dateDeParution=" + dateDeParution +
                ", nomAuteur='" + nomAuteur + '\'' +
                ", prenomAuteur='" + prenomAuteur + '\'' +
                '}';
    }
}
