package com.nortedev.sgg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class LoteViewHolder extends RecyclerView.ViewHolder {
    private final TextView loteItemView;

    private LoteViewHolder(View itemView){
        super(itemView);
        loteItemView = itemView.findViewById(R.id.textViewIngresarLongitud);
    }

    public void bind(String texto){
        loteItemView.setText(texto);
    }

    static LoteViewHolder create(ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lote_item, parent, false);
        return new LoteViewHolder(view);
    }
}
