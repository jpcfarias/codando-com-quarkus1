package com.aprendendoquarkus.model;


public class Pessoa{

    public String first_name;

    public String email;

    public String username;

    public String password;
    
    public Pessoa() {
    }

    public Pessoa(String first_name, String username, String email, String password) {
        this.first_name = first_name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}