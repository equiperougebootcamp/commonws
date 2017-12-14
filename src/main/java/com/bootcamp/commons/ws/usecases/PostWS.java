package com.bootcamp.commons.ws.usecases;

import com.bootcamp.commons.enums.TypePost;
import com.bootcamp.entities.Region;

public class PostWS {
    private int id;
    private String postMessage;
    private Long PostDate;
    private TypePost postType;
    private String postedName;
    private String postedContact;
    private String postedEmail;
    private String PostedPrenom;
    private Region userAddress;
    private Region postRegion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public Long getPostDate() {
        return PostDate;
    }

    public void setPostDate(Long postDate) {
        PostDate = postDate;
    }

    public TypePost getPostType() {
        return postType;
    }

    public void setPostType(TypePost postType) {
        this.postType = postType;
    }

    public String getPostedName() {
        return postedName;
    }

    public void setPostedName(String postedName) {
        this.postedName = postedName;
    }

    public String getPostedContact() {
        return postedContact;
    }

    public void setPostedContact(String postedContact) {
        this.postedContact = postedContact;
    }

    public String getPostedEmail() {
        return postedEmail;
    }

    public void setPostedEmail(String postedEmail) {
        this.postedEmail = postedEmail;
    }

    public String getPostedPrenom() {
        return PostedPrenom;
    }

    public void setPostedPrenom(String postedPrenom) {
        PostedPrenom = postedPrenom;
    }

    public Region getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Region userAddress) {
        this.userAddress = userAddress;
    }

    public Region getPostRegion() {
        return postRegion;
    }

    public void setPostRegion(Region postRegion) {
        this.postRegion = postRegion;
    }
}
