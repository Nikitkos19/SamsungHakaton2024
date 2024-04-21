package com.samsung.hakaton2024.ui.profile.line;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

import java.util.List;

public class MyAdapterLine extends RecyclerView.Adapter<ViewHolderLine> {

    Context context;
    List<ItemLine> items;

    public MyAdapterLine(Context context, List<ItemLine> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolderLine onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderLine(LayoutInflater.from(context).inflate(R.layout.item_line, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLine holder, int position) {

        holder.imgLine.setImageResource(items.get(position).getImgLine());
    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}
