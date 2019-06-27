package com.example.togetherliveapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubMyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<ArrayList<SubPageListItem>> subItemList;
    private SubMyViewHolder subMyViewHolder;
    public SubMyAdapter(ArrayList<ArrayList<SubPageListItem>> subItemList){
        this.subItemList = subItemList;
    }

    public static class SubMyViewHolder extends RecyclerView.ViewHolder{
        TextView sub_scription;
        TextView sub_image;

        SubMyViewHolder(View view){
            super(view);
            sub_scription = view.findViewById(R.id.sub_subscription);
            sub_image = view.findViewById(R.id.sub_image);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sub_page_list_item,viewGroup,false);

        return new SubMyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
       subMyViewHolder = (SubMyViewHolder) viewHolder;
       if(i==0){
           subMyViewHolder.sub_scription.setText(subItemList.get(0).get(0).sub_Scription);
           subMyViewHolder.sub_image.setText(subItemList.get(0).get(0).sub_iamge);
           System.out.println("Test i " + i);
       } else if (i==1){
           subMyViewHolder.sub_scription.setText(subItemList.get(0).get(1).sub_Scription);
           subMyViewHolder.sub_image.setText(subItemList.get(0).get(1).sub_iamge);
           System.out.println("Test i " + i);
       } else if (i==2){
           subMyViewHolder.sub_scription.setText(subItemList.get(0).get(2).sub_Scription);
           subMyViewHolder.sub_image.setText(subItemList.get(0).get(2).sub_iamge);
           System.out.println("Test i " + i);
       } else if (i==3){
           subMyViewHolder.sub_scription.setText(subItemList.get(0).get(3).sub_Scription);
           subMyViewHolder.sub_image.setText(subItemList.get(0).get(3).sub_iamge);
           System.out.println("Test i " + i);
       }
    }

    public void customBind(){
        for(int i=0; i<subItemList.size(); i++){
            for(int j=0; j<subItemList.get(i).size(); j++){
            }
        }
    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }


}
