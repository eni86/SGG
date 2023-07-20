package com.nortedev.sgg;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.nortedev.sgg.entities.Lote;

public class LoteListAdapter extends ListAdapter<Lote, LoteViewHolder> {
    public LoteListAdapter(@NonNull DiffUtil.ItemCallback<Lote> diffCallbak){
        super(diffCallbak);
    }

    @NonNull
    @Override
    public LoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return LoteViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull LoteViewHolder holder, int position) {
        Lote loteActual = getItem(position);
        holder.bind(loteActual.getDicose());
    }

    static class LoteDiff extends DiffUtil.ItemCallback<Lote>{
        @Override
        public boolean areItemsTheSame(@NonNull Lote oldItem, @NonNull Lote newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull Lote oldItem, @NonNull Lote newItem) {
            return oldItem.getDicose().equals(newItem.getDicose());
        }
    }
}
