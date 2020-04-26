package com.example.tessuitmediasatu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentScreenEmpat extends Fragment {
    private ImageView iv_back;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_screenempat, container, false);
        iv_back         = view.findViewById(R.id.back_id);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentScreenDua fragmentScreenDua = new FragmentScreenDua();
                FragmentTransaction NewFragment = getFragmentManager().beginTransaction();
                NewFragment.replace(R.id.main_frame, fragmentScreenDua);
                NewFragment.commit();
            }
        });
        return view;

    }
}
