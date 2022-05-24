/*
        Nama : Nuraeni Eka Susanti
        NIM : 10119225
        Kelas : IF-6
Tanggal pengerjaan : 08 Mei 2022
*/
package com.example.myapp.music;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;

import java.util.ArrayList;

public class Music_Adapter extends RecyclerView.Adapter<Music_Adapter.ListViewHolder> {
    private ArrayList<Music_Item> musicList;

    public Music_Adapter(ArrayList<Music_Item> list) {
        this.musicList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.musiclist_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Music_Item music_item = musicList.get(position);
        holder.musiclist.setText(music_item.getMusicList());

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView musiclist;

        ListViewHolder(View itemView) {
            super(itemView);
            musiclist = itemView.findViewById(R.id.musiclist);
        }
    }
}
