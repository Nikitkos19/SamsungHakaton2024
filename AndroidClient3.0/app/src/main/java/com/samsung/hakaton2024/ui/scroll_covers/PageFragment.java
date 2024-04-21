package com.samsung.hakaton2024.ui.scroll_covers;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.samsung.hakaton2024.R;


import java.util.Random;



//import com.samsung.hakaton2024.R;

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
        TextView pageHeader = result.findViewById(R.id.displayText);
        Random rand = new Random();

        int random_num = rand.nextInt(6);



        pageHeader.setText(random_num + "");


//        ImageView image_book = result.findViewById(R.id.);
//        image_book.setImageResource(R.drawable.ic_launcher_background);

        return result;
    }
}
