package com.de2290.imageBoard.API;

import java.util.UUID;

public class Post {

    private String user;
    private String url;
    private String caption;
    private UUID postUUID;
    public Post() {
    }

    public Post(String user, String url, String caption) {
        this.user = user;
        this.url = url;
        this.caption = caption;
        this.postUUID = UUID.randomUUID();
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public UUID getpostUUID() {
        return this.postUUID;
    }

    public void setpostUUID(UUID uuid) {
        this.postUUID = uuid;
    }
    
}