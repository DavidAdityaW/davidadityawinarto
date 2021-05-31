package com.example.davidadityawinarto.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.davidadityawinarto.Model.DailyModel;
import com.example.davidadityawinarto.Model.MusicModel;
import com.example.davidadityawinarto.R;

import java.util.ArrayList;

/*
    Dikerjakan pada tanggal : 30 Mei 2021
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.myviewholder> {

    ArrayList<MusicModel> musicModel;

    public MusicAdapter(ArrayList<MusicModel> musicModel) {
        this.musicModel = musicModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_music, parent, false);
        return new MusicAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivMusic.setImageResource(musicModel.get(position).getImage());
        holder.tvTitle.setText(musicModel.get(position).getTitle());
        holder.tvPenyanyi.setText(musicModel.get(position).getPenyanyi());
    }

    @Override
    public int getItemCount() {
        return musicModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivMusic;
        TextView tvTitle, tvPenyanyi;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivMusic = itemView.findViewById(R.id.iv_music);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvPenyanyi = itemView.findViewById(R.id.tv_penyanyi);
        }
    }
}
