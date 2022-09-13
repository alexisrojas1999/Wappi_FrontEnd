package com.speedup.qa.models;

public class DataLogin {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public  DataLogin (String user, String password){
       this.user =user;
       this.password=password;

    }
}
