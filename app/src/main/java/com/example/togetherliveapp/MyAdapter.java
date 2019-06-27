package com.example.togetherliveapp;

import android.support.annotation.NonNull;
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
        RecyclerView sub_recycle;

        MyViewHolder(View view){
            super(view);
            main_title = view.findViewById(R.id.main_title);
            sub_title = view.findViewById(R.id.sub_title);
            sub_recycle = view.findViewById(R.id.sub_recycle);
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
        myViewHolder.main_title.setText(mainItemList.get(i).main_title);
        myViewHolder.sub_title.setText(mainItemList.get(i).sub_title);

        ArrayList<ArrayList<SubPageListItem>> subPageListItems = new ArrayList<ArrayList<SubPageListItem>>();
        ArrayList<SubPageListItem> temp1 = new ArrayList<>();
        temp1.add(new SubPageListItem("Test2.", "첫번째"));
        temp1.add(new SubPageListItem("Test2.", "첫번째"));
        temp1.add(new SubPageListItem("Test2.", "첫번째"));

        subPageListItems.add(temp1);

        ArrayList<SubPageListItem> temp2 = new ArrayList<>();
        temp2.add(new SubPageListItem("Test1.", "두번째"));
        temp2.add(new SubPageListItem("Test1.", "두번째"));
        temp2.add(new SubPageListItem("Test1.", "두번째"));

        subPageListItems.add(temp2);

        ArrayList<SubPageListItem> temp3 = new ArrayList<>();
        temp3.add(new SubPageListItem("Test3.", "셋번째"));
        temp3.add(new SubPageListItem("Test3.", "셋번째"));
        temp3.add(new SubPageListItem("Test3.", "셋번째"));

        subPageListItems.add(temp3);

        ArrayList<SubPageListItem> temp4 = new ArrayList<>();
        temp4.add(new SubPageListItem("Test4.", "넷번째"));
        temp4.add(new SubPageListItem("Test4.", "넷번째"));
        temp4.add(new SubPageListItem("Test4.", "넷번째"));

        subPageListItems.add(temp4);

        Log.d("Test","StartTest");
        for(int j=0; j<subPageListItems.size(); j++){
            for(int k=0; k<temp1.size(); k++){
                Log.d("Test2",subPageListItems.get(j).get(k).sub_Scription);
            }
        }

        SubMyAdapter subMyAdapter = new SubMyAdapter(subPageListItems);
        myViewHolder.sub_recycle.setHasFixedSize(true);
        myViewHolder.sub_recycle.setLayoutManager(new LinearLayoutManager(null,LinearLayoutManager.HORIZONTAL,false));
        myViewHolder.sub_recycle.setAdapter(subMyAdapter);

    }

    @Override
    public int getItemCount() {
        return mainItemList.size();
    }


}
