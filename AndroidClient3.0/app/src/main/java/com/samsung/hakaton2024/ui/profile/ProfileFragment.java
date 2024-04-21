package com.samsung.hakaton2024.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.hakaton2024.R;
import com.samsung.hakaton2024.databinding.FragmentProfileBinding;
import com.samsung.hakaton2024.ui.profile.feat.FeatFragment;
import com.samsung.hakaton2024.ui.profile.like.LikeFragment;
import com.samsung.hakaton2024.ui.profile.line.LineFragment;

public class ProfileFragment extends Fragment {

    private ProfileViewModel mViewModel;
    private FragmentProfileBinding binding;

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.likeProfile.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                LikeFragment likefrag = new LikeFragment();

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frame_profile, likefrag).addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        });

        binding.featProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FeatFragment featfrag = new FeatFragment();

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frame_profile, featfrag).addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        });

        binding.lineProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LineFragment linefrag = new LineFragment();

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frame_profile, linefrag).addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        });

    }
}