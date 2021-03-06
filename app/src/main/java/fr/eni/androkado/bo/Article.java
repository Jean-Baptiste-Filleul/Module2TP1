package fr.eni.androkado.bo;

import java.io.Serializable;

public class Article implements Serializable {
    private int id;
    private String nom;
    private String description;
    private String url;

    private float prix;
    private float note;

    private boolean isAchete;

    public Article(){

    }

    public Article (int id, String nom, String description, String url, float prix, float note,boolean isAchete) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.url = url;
        this.prix = prix;
        this.note = note;
        this.isAchete = isAchete;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public boolean isAchete() {
        return isAchete;
    }

    public void setAchete(boolean achete) {
        isAchete = achete;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", prix=" + prix +
                ", note=" + note +
                ", achat=" + isAchete +
                '}';
    }
}
