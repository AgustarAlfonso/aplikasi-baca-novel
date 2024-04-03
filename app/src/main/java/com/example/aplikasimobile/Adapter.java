package com.example.aplikasimobile;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {

    private ArrayList <Novel> arrayModel;
    private Context context;

    public Adapter(ArrayList<Novel> arrayModel, Context context) {
        this.arrayModel = arrayModel;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_novel, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }


    Novel novel;
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Novel clickedItem = arrayModel.get(position);

        holder.tvjudul.setText(clickedItem.getJudul());
        holder.tvpenulis.setText(clickedItem.getPenulis());
        holder.tvchapter.setText(clickedItem.getChapter());
        holder.tvdeskripsi.setText(clickedItem.getDeskripsi());
        holder.gambarView.setImageResource(clickedItem.getCoveriimage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("judul", clickedItem.getJudul());
                intent.putExtra("penulis", clickedItem.getPenulis());
                intent.putExtra("chapter", clickedItem.getChapter());
                intent.putExtra("deskripsi", clickedItem.getDeskripsi());
                intent.putExtra("gambar", clickedItem.getCoveriimage());
                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return arrayModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvjudul, tvpenulis, tvchapter, tvdeskripsi;
        ImageView gambarView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvjudul = itemView.findViewById(R.id.tvjudul);
            tvpenulis = itemView.findViewById(R.id.tvpenulis);
            tvchapter = itemView.findViewById(R.id.tvchapter);
            tvdeskripsi = itemView.findViewById(R.id.tvdeskripsi);
            gambarView = itemView.findViewById(R.id.imgcover);
        }
    }
}
