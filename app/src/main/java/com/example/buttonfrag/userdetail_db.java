package com.example.buttonfrag;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {user_detail.class},version = 1)
public abstract class userdetail_db extends RoomDatabase {

    public abstract user_dao user_dao();
}
