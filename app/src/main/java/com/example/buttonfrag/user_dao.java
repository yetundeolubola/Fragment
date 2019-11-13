package com.example.buttonfrag;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface user_dao {

    @Insert
    public void adduser(user_detail user);
}

