package com.samsung.hakaton2024.scroll_covers;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.samsung.hakaton2024.R;

public class PageFragment extends Fragment {

    private int pageNumber;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args=new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.fragment_page, container, false);
//        TextView pageHeader = result.findViewById(R.id.displayText);
//        String header = "Фрагмент " + (pageNumber+1);
//        pageHeader.setText(header);
        ImageView image_book = result.findViewById(R.id.cover_of_book);
        image_book.setImageResource(R.drawable.ic_launcher_background);

        return result;
    }
}