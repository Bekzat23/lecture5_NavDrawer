package com.example.navdrawer.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navdrawer.R;

public class ProfileFragment extends Fragment {

    View root;
    TextView tv_profile;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_profile, container, false);
        tv_profile = root.findViewById(R.id.tv_profile);
        tv_profile.setText("Text Changed")
        return root;
    }
}