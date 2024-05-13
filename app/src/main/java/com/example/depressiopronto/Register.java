package com.example.depressiopronto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.Instant;

@Entity
public class Register {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "input")
    public String input;

    @ColumnInfo(name = "output")
    public String output;

    @ColumnInfo(name = "date")
    public String date;

    public Register(String input, String output) {
        this.input = input;
        this.output = output;
        this.date = Instant.now().toString();
    }
}
