package com.example.depressiopronto;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Register.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract RegisterDao registerDao();
}

