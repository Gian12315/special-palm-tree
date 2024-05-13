package com.example.depressiopronto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class RegisterContract {
    private RegisterContract() {}

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Register.TABLE_NAME + " (" +
                    Register._ID + " INTEGER PRIMARY KEY," +
                    Register.COLUMN_NAME_INPUT + " TEXT," +
                    Register.COLUMN_NAME_OUTPUT + " TEXT," +
                    Register.COLUMN_NAME_DATE + " DATETIME)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Register.TABLE_NAME;


    /* Inner class that defines the table contents */
    public static class Register implements BaseColumns {
        public static final String TABLE_NAME = "register";
        public static final String COLUMN_NAME_INPUT = "input";
        public static final String COLUMN_NAME_OUTPUT = "output";
        public static final String COLUMN_NAME_DATE = "date";
    }

    public static class RegisterContractDbHelper extends SQLiteOpenHelper {
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = "Register.db";

        public RegisterContractDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES);
            onCreate(sqLiteDatabase);
        }
    }
}
