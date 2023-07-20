package com.nortedev.sgg.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.nortedev.sgg.daos.LoteDAO;
import com.nortedev.sgg.databases.AppDatabase;
import com.nortedev.sgg.entities.Lote;

import java.util.List;

public class LoteRepository {
    private LoteDAO loteDao;

    private LiveData<List<Lote>> lotes;

    public LoteRepository(Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        loteDao = db.loteDao();
        lotes = loteDao.getAll();
    }

    public LiveData<List<Lote>> getLotes(){
        return lotes;
    }

    public void insert(Lote lote){
        AppDatabase.databaseWriteExecutor.execute(() -> {
            loteDao.insert(lote);
        });
    }
}