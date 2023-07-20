package com.nortedev.sgg.models;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.nortedev.sgg.entities.Lote;
import com.nortedev.sgg.repositories.LoteRepository;

import java.util.List;


public class LoteViewModel extends AndroidViewModel {

    private LoteRepository loteRepository;
    private final LiveData<List<Lote>> lotes;

    public LoteViewModel(Application application){
        super(application);
        loteRepository = new LoteRepository(application);
        lotes = loteRepository.getLotes();
    }

    public LiveData<List<Lote>> getLotes(){
        return lotes;
    }

    public void insert(Lote lote){
        loteRepository.insert(lote);
    }
}