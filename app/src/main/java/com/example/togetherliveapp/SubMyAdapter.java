package com.example.togetherliveapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SubMyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static class SubMyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView description;

        SubMyViewHolder(View view){
            super(view);
            title = view.findViewById(R.id.title);
            description = view.findViewById(R.id.description);
        }
    }

    private ArrayList<Sub1PageListItem> subItemList;
    SubMyAdapter(ArrayList<Sub1PageListItem> subItemList){
        this.subItemList = subItemList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(i==0) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sub2_page_item, viewGroup, false);
            return new SubMyViewHolder(v);
        } else if(i==1) {
            viewGroup.notifyAll();
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sub1_page_item, viewGroup, false);
            return new SubMyViewHolder(v);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        SubMyViewHolder myViewHolder = (SubMyViewHolder) viewHolder;
        System.out.println(i);
        myViewHolder.title.setText(subItemList.get(i).title);
        myViewHolder.description.setText(subItemList.get(i).description);
    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }


}
