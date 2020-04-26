package com.example.tessuitmediasatu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListEventsAdapter extends RecyclerView.Adapter<ListEventsAdapter.listevent> {

  private ArrayList<Event> listEvent;

    public ListEventsAdapter(ArrayList<Event> listevent){
        listEvent = listevent;
    }

    @NonNull
    @Override
    public listevent onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =  inflater.inflate(R.layout.list_event, parent, false);
        return new listevent(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listevent holder, int position) {
        Event list_event = listEvent.get(position);
        holder.imageView.setImageResource(list_event.getImage());
        holder.headingSatu.setText(list_event.getHeadingSatu());
        holder.headingDua.setText(list_event.getHeadingDua());
        holder.caption.setText(list_event.getCaption());
        holder.dayDate_id.setText(list_event.getTanggal());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return listEvent.size();
    }

    class listevent extends RecyclerView.ViewHolder {
        private TextView headingSatu, headingDua, caption, dayDate_id;
        private ImageView imageView;
        private CardView cardView;

        public listevent(@NonNull View itemView) {
            super(itemView);
            imageView   = itemView.findViewById(R.id.imageView);
            headingSatu = itemView.findViewById(R.id.headingSatu_id);
            headingDua  = itemView.findViewById(R.id.headingDua_id);
            caption     = itemView.findViewById(R.id.caption_id);
            dayDate_id  = itemView.findViewById(R.id.dayDate_id);
            cardView    = itemView.findViewById(R.id.cardView);
        }
    }
}
