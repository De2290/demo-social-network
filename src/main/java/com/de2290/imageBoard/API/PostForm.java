package com.de2290.imageBoard.API;

public class PostForm {

    private String username;
    private String url;
    private String caption;

    public PostForm(String username, String url, String caption) {
        this.username = username;
        this.url = url;
        this.caption = caption;
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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
}