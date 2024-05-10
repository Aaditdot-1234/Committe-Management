package com.example.login2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class SubscriptionsFragment extends Fragment {

    private RelativeLayout csiLayout;
    private RelativeLayout pcrLayout;
    private RelativeLayout sucLayout;
    private RelativeLayout ieee;

    public SubscriptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subscriptions, container, false);

        csiLayout = view.findViewById(R.id.CSI);
        pcrLayout = view.findViewById(R.id.PCR);
        sucLayout = view.findViewById(R.id.SUC);
        ieee = view.findViewById(R.id.ieee);

        csiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), CsiActivity.class);
                startActivity(intent);
            }
        });

        pcrLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("PhotoCircle RAIT (PCR) Clicked");
                Intent intent = new Intent(requireActivity(), pcr.class);
                startActivity(intent);
            }
        });

        sucLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Student Union Council (SUC) Clicked");
                Intent intent = new Intent(requireActivity(), suc.class);
                startActivity(intent);
            }
        });


        ieee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Student Union Council (SUC) Clicked");
                Intent intent = new Intent(requireActivity(), ieee.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void showToast(String message) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show();
    }
}
