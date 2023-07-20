package com.nortedev.sgg.databases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.nortedev.sgg.daos.LoteDAO;
import com.nortedev.sgg.entities.Lote;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Lote.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LoteDAO loteDao();

    private static volatile AppDatabase instance;

    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(4);

    public static AppDatabase getInstance(final Context context) {
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "Lotes")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

}
