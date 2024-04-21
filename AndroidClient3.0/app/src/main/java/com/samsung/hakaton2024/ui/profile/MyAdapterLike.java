package com.samsung.hakaton2024.ui.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;
import com.samsung.hakaton2024.ui.profile.like.ItemLike;

import java.util.List;

public class MyAdapterLike extends RecyclerView.Adapter<ViewHolderLike> {

    Context context;
    List<ItemLike> items;

    public MyAdapterLike(Context context, List<ItemLike> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolderLike onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderLike(LayoutInflater.from(context).inflate(R.layout.item_like, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLike holder, int position) {

        holder.imgLike.setImageResource(items.get(position).getImgLike());
    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}