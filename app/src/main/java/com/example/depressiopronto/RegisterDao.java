package com.example.depressiopronto;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RegisterDao {
    @Query("SELECT * FROM register")
    List<Register> getAll();

    @Insert
    void insertAll(Register... registers);

    @Delete
    void delete(Register register);
}
