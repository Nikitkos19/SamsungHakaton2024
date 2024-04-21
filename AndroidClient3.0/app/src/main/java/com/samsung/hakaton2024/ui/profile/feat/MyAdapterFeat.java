package com.samsung.hakaton2024.ui.profile.feat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

import java.util.List;

public class MyAdapterFeat extends RecyclerView.Adapter<ViewHolderFeat> {

    Context context;
    List<ItemFeat> items;

    public MyAdapterFeat(Context context, List<ItemFeat> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolderFeat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderFeat(LayoutInflater.from(context).inflate(R.layout.item_feat, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFeat holder, int position) {

        holder.imgFeat.setImageResource(items.get(position).getImgFeat());
    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}
