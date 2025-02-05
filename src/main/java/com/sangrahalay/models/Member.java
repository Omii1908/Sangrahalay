package com.sangrahalay.models;

public class Member {
    private String name, email;
    
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
