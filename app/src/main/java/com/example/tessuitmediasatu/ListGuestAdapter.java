package com.example.tessuitmediasatu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ListGuestAdapter extends RecyclerView.Adapter<ListGuestAdapter.listguest> {

    @NonNull
    @Override
    public listguest onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull listguest holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class listguest extends RecyclerView.ViewHolder {
        private TextView nimStudents, nameStudents, time, day_date, place;
        private CardView linearLayout;

        public listguest(@NonNull View itemView) {
            super(itemView);
        //    linearLayout = itemView.findViewById(R.id.home_mRide);
        }
    }
}
