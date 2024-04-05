package com.example.loginactivity;

import android.content.ClipData;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterdata extends RecyclerView.Adapter<myviewholder> {

    Context context;
    List<itemdata> items;

    public adapterdata(Context context, List<itemdata> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(context).inflate(R.layout.item_data,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.asalView.setText(items.get(position).getAsal());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

