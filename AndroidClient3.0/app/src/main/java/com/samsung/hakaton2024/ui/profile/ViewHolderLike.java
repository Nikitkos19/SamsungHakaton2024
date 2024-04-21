package com.samsung.hakaton2024.ui.profile;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

public class ViewHolderLike extends RecyclerView.ViewHolder {

    ImageView imgLike;
    public ViewHolderLike(@NonNull View itemView) {
        super(itemView);

        imgLike = itemView.findViewById(R.id.img_like);

    }
}