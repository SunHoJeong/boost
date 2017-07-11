package com.example.suno.firebaseexample;

/**
 * Created by suno on 2017. 7. 11..
 */

public class User {
    private String name;
    private String email;

    public User(){

    }
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
