package com.nortedev.sgg.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.nortedev.sgg.entities.Lote;

import java.util.List;

@Dao
public interface LoteDAO {
    @Query("SELECT * FROM lote")
    LiveData<List<Lote>> getAll();

    @Insert
    void insert(Lote lote);

    @Update
    void update(Lote lote);

    @Delete
    void delete(Lote lote);

    @Query("SELECT * from lote where id = :id")
    Lote findById(int id);
}
