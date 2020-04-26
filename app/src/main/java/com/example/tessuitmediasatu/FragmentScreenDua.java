package com.example.tessuitmediasatu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentScreenDua extends Fragment {
    //Variable
    private TextView tv_Name;
    private Button btn_ChooseEvent, btn_ChooseGuest;
    private static String name;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_screendua, container, false);

        //Get Extras From Previous Fragment
        name = getActivity().getIntent().getExtras().getString("name");

        //Get ID from Activity
        btn_ChooseEvent = view.findViewById(R.id.tv_ChooseEvent_id);
        btn_ChooseGuest = view.findViewById(R.id.tv_ChooseGuest_id);
        tv_Name         = view.findViewById(R.id.name_id);

//        btn_ChooseEvent.setText();
//        btn_ChooseGuest.setText();

        //Set Name from Extas
        tv_Name.setText(name);

        ///Action Choose Event
        btn_ChooseEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               FragmentScreenTiga fragmentScreenTiga = new FragmentScreenTiga();
               FragmentTransaction NewFragment = getFragmentManager().beginTransaction();
               NewFragment.replace(R.id.main_frame, fragmentScreenTiga);
               NewFragment.commit();
            }
        });

        ///Action Choose Guest
        btn_ChooseGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentScreenEmpat fragmentScreenEmpat = new FragmentScreenEmpat();
                FragmentTransaction NewFragment = getFragmentManager().beginTransaction();
                NewFragment.replace(R.id.main_frame, fragmentScreenEmpat);
                NewFragment.commit();
            }
        });


        return view;
    }


}
