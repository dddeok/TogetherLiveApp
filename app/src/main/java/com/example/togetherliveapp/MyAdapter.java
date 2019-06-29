package com.example.togetherliveapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView main_title;
        TextView sub_title;
        View view;
        MyViewHolder(View view){
            super(view);
            main_title = view.findViewById(R.id.main_title);
            sub_title = view.findViewById(R.id.sub_title);
            this.view = view;
        }
    }

    private ArrayList<MainPageListItem> mainItemList;
    MyAdapter(ArrayList<MainPageListItem> mainItemList){
        this.mainItemList = mainItemList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_page_list_item,viewGroup,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        System.out.println(i);
        myViewHolder.main_title.setText(mainItemList.get(i).main_title);
        myViewHolder.sub_title.setText(mainItemList.get(i).sub_title);
        if(i==0){
            ((MyViewHolder) viewHolder).view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, Sub2Activity.class);
                    context.startActivity(intent);
                }
            });
        }
        else if(i==1) {
            ((MyViewHolder) viewHolder).view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, Sub1Activity.class);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mainItemList.size();
    }


}
