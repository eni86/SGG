package com.nortedev.sgg;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.nortedev.sgg.entities.Lote;
import com.nortedev.sgg.models.LoteViewModel;

public class LoteFactory extends ViewModelProvider.NewInstanceFactory {
    @NonNull
    private final Application application;

    public LoteFactory (@NonNull Application application){
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass == LoteViewModel.class){
            return (T) new LoteViewModel(application);
        }
        return null;
    }
}
