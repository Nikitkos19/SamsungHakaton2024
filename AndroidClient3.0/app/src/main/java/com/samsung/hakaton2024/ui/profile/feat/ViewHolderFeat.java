package com.samsung.hakaton2024.ui.profile.feat;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

public class ViewHolderFeat extends RecyclerView.ViewHolder {

    ImageView imgFeat;
    public ViewHolderFeat(@NonNull View itemView) {
        super(itemView);

        imgFeat = itemView.findViewById(R.id.img_feat);

    }
}