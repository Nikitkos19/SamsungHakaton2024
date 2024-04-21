package com.samsung.hakaton2024.ui.profile.line;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

public class ViewHolderLine extends RecyclerView.ViewHolder {

    ImageView imgLine;
    public ViewHolderLine(@NonNull View itemView) {
        super(itemView);

        imgLine = itemView.findViewById(R.id.img_line);

    }
}