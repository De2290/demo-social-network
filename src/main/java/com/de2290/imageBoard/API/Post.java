package com.de2290.imageBoard.API;

public class Post {

    private String user;
    private String url;
    private String caption;

    public Post() {
    }

    public Post(String user, String url, String caption) {
        this.user = user;
        this.url = url;
        this.caption = caption;
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

    
}