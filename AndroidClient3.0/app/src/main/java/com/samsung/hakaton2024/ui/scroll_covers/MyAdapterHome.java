package com.samsung.hakaton2024.ui.scroll_covers;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.samsung.hakaton2024.ui.home.HomeFragment;

public class MyAdapterHome extends FragmentStateAdapter {
    public MyAdapterHome(HomeFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return(PageFragment.newInstance(position));
    }

    @Override
    public int getItemCount() {
        return 10; // Сюда надо кол. всех историй (Но думаю, что можно просто 100 оставить, или чуть больше сделать, а то лагать будет)
    }
}
