/*
        Nama : Nuraeni Eka Susanti
        NIM : 10119225
        Kelas : IF-6
Tanggal pengerjaan : 08 Mei 2022
*/
package com.example.myapp.dailyactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;

import java.util.ArrayList;

public class Daily_Adapter extends RecyclerView.Adapter<Daily_Adapter.ListViewHolder> {
    private ArrayList<Daily> dailyList;

    public Daily_Adapter(ArrayList<Daily> list) {this.dailyList = list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Daily daily = dailyList.get(position);
        holder.kegiatan.setText(daily.getKegiatan());

    }

    @Override
    public int getItemCount() { return dailyList.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView kegiatan;

        ListViewHolder(View itemview) {
            super(itemview);
            kegiatan = itemview.findViewById(R.id.kegiatan);
        }
    }
}
