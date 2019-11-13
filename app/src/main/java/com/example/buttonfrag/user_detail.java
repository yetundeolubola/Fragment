package com.example.buttonfrag;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User details")
public class user_detail {

    @PrimaryKey
    @NonNull
    private String password;
    private String email;
    private String username;
    private int phonemummber;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhonemummber() {
        return phonemummber;
    }

    public void setPhonemummber(int phonemummber) {

        this.phonemummber = phonemummber;
    }
}
