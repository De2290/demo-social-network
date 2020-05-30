package com.de2290.imageBoard.API;

import java.util.UUID;

public class Login {

    private String username;
    private String password;
    private UUID uuid;

    public String getUsername() {
        return this.username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public UUID getUUID() {
        return this.uuid;
    }

    public void setUUID(UUID uuid) {
        this.uuid = uuid;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        this.uuid = UUID.randomUUID();
    }
}