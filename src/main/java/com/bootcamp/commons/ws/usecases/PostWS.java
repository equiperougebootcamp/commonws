/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases;

import com.bootcamp.commons.enums.StatutPost;
import com.bootcamp.commons.enums.TypePost;
import com.bootcamp.entities.Region;
import com.bootcamp.entities.User;

import java.util.List;

/**
 *
 * @author leger
 */
public class PostWS {
    private int id;
    private TypePost typePost;
    private StatutPost statutPost;
    private long dateCreation;
    private long dateMiseAJour;
    private int produitId;
    private List<Integer> postulantId;
    private Region region;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypePost getTypePost() {
        return typePost;
    }

    public void setTypePost(TypePost typePost) {
        this.typePost = typePost;
    }

    public StatutPost getStatutPost() {
        return statutPost;
    }

    public void setStatutPost(StatutPost statutPost) {
        this.statutPost = statutPost;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public List<Integer> getPostulantId() {
        return postulantId;
    }

    public void setPostulantId(List<Integer> postulantId) {
        this.postulantId = postulantId;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    
    
}
