package com.nortedev.sgg.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Lote {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String dicose;
    private int area;
    private float latitud;
    private float longitud;
    private String uso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDicose() {
        return dicose;
    }

    public void setDicose(String dicose) {
        this.dicose = dicose;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
}
