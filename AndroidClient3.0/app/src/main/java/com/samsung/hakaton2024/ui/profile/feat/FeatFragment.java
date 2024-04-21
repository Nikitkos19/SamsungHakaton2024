package com.samsung.hakaton2024.ui.profile.feat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.samsung.hakaton2024.R;
import com.samsung.hakaton2024.databinding.FragmentFeatBinding;

import java.util.ArrayList;
import java.util.List;

public class FeatFragment extends Fragment {

    private FragmentFeatBinding binding;
    private List<ItemFeat> itemListFeat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFeatBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemListFeat = new ArrayList<>();
        // Добавьте элементы в список itemList
        itemListFeat.add(new ItemFeat(R.drawable.like));
        itemListFeat.add(new ItemFeat(R.drawable.like));
        itemListFeat.add(new ItemFeat(R.drawable.like));
        itemListFeat.add(new ItemFeat(R.drawable.like));


        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        binding.rvFeat.setLayoutManager(staggeredGridLayoutManager);

        MyAdapterFeat myAdapter = new MyAdapterFeat(getContext(), itemListFeat);
        binding.rvFeat.setAdapter(myAdapter);
    }
}