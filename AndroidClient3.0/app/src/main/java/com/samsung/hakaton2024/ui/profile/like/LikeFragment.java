package com.samsung.hakaton2024.ui.profile.like;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.samsung.hakaton2024.R;
import com.samsung.hakaton2024.databinding.FragmentLikeBinding;
import com.samsung.hakaton2024.ui.profile.MyAdapterLike;

import java.util.ArrayList;
import java.util.List;


public class LikeFragment extends Fragment {

    private FragmentLikeBinding binding;
    private List<ItemLike> itemListLike;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLikeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemListLike = new ArrayList<>();
        // Добавьте элементы в список itemList
        itemListLike.add(new ItemLike(R.drawable.like));
        itemListLike.add(new ItemLike(R.drawable.like));
        itemListLike.add(new ItemLike(R.drawable.like));
        itemListLike.add(new ItemLike(R.drawable.like));
        itemListLike.add(new ItemLike(R.drawable.like));


        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        binding.rvLike.setLayoutManager(staggeredGridLayoutManager);

        MyAdapterLike myAdapter = new MyAdapterLike(getContext(), itemListLike);
        binding.rvLike.setAdapter(myAdapter);
    }
}