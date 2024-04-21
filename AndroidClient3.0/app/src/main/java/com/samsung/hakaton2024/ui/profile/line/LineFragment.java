package com.samsung.hakaton2024.ui.profile.line;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.samsung.hakaton2024.R;
import com.samsung.hakaton2024.databinding.FragmentLineBinding;

import java.util.ArrayList;
import java.util.List;

public class LineFragment extends Fragment {

    private FragmentLineBinding binding;
    private List<ItemLine> itemListLine;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLineBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemListLine = new ArrayList<>();
        // Добавьте элементы в список itemList
        itemListLine.add(new ItemLine(R.drawable.like));
        itemListLine.add(new ItemLine(R.drawable.like));



        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        binding.rvLine.setLayoutManager(staggeredGridLayoutManager);

        MyAdapterLine myAdapter = new MyAdapterLine(getContext(), itemListLine);
        binding.rvLine.setAdapter(myAdapter);
    }
}