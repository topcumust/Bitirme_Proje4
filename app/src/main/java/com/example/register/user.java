package com.example.register;


public class user {
    private int user_id;
    private String user_Name;
    private String user_Password;

    public user()
    {

    }

    public user(int user_id, String user_Name, String user_Password) {
        super();
        this.user_id = user_id;
        this.user_Name = user_Name;
        this.user_Password = user_Password;
    }

    public user(String user_Name, String user_Password) {
        super();
        this.user_Name = user_Name;
        this.user_Password = user_Password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }
}
