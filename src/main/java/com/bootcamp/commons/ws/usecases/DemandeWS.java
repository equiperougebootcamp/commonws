package com.bootcamp.commons.ws.usecases;

import com.bootcamp.entities.User;

import java.util.List;

public class DemandeWS {
   private PostWS postWS;
    private List<User> useList;

    public PostWS getPostWS() {
        return postWS;
    }

    public void setPostWS(PostWS postWS) {
        this.postWS = postWS;
    }

    public List<User> getUseList() {
        return useList;
    }

    public void setUseList(List<User> useList) {
        this.useList = useList;
    }
}
