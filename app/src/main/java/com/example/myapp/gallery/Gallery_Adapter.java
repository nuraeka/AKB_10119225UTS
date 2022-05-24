/*
        Nama : Nuraeni Eka Susanti
        NIM : 10119225
        Kelas : IF-6
Tanggal pengerjaan : 08 Mei 2022
*/
package com.example.myapp.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Gallery_Adapter extends RecyclerView.Adapter<Gallery_Adapter.GalleryViewHolder> {

    private List<Gallery_Item> gallery_items;

    public Gallery_Adapter(List<Gallery_Item> gallery_items) {this.gallery_items = gallery_items; }

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GalleryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {
        holder.setPostImage(gallery_items.get(position));
    }

    @Override
    public int getItemCount() { return gallery_items.size(); }

    public class GalleryViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imageView;

        public GalleryViewHolder(@NonNull View ItemView) {
            super(ItemView);
            imageView = ItemView.findViewById(R.id.gallery_item_layout);
        }

        public void setPostImage(Gallery_Item gallery_item) {
            imageView.setImageResource(gallery_item.getImage());
        }
    }
}
