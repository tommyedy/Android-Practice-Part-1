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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentScreenTiga extends Fragment {
    private ImageView iv_back;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView recyclerView;
    private ArrayList<Event> arraylistevent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_screentiga, container, false);
        //Get ID from Activity
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

        arraylistevent = new ArrayList<>();
        arraylistevent.add(new Event("Lorem Ipsum","Lorem Ipsum","April 03, 2020","Lorem Ipsum Lorem Ipsum Lorem Ipsum ...",R.drawable.family));
        arraylistevent.add(new Event("Lorem Ipsum","Lorem Ipsum","April 03, 2020","Lorem Ipsum Lorem Ipsum Lorem Ipsum ...",R.drawable.asian));
        arraylistevent.add(new Event("Lorem Ipsum","Lorem Ipsum","April 03, 2020","Lorem Ipsum Lorem Ipsum Lorem Ipsum ...",R.drawable.family));
        arraylistevent.add(new Event("Lorem Ipsum","Lorem Ipsum","April 03, 2020","Lorem Ipsum Lorem Ipsum Lorem Ipsum ...",R.drawable.asian));
        arraylistevent.add(new Event("Lorem Ipsum","Lorem Ipsum","April 03, 2020","Lorem Ipsum Lorem Ipsum Lorem Ipsum ...",R.drawable.family));

        recyclerView = view.findViewById(R.id.listEvent_id);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new ListEventsAdapter(arraylistevent);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}
