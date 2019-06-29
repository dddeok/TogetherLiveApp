package com.example.togetherliveapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Sub2Activity extends Activity {
    Context mCotext;
    RecyclerView recyclerView;
    SubMyAdapter myAdapter ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2_page);

        mCotext = getApplicationContext();

        ArrayList<Sub1PageListItem> items = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.sub2_recycle);
        recyclerView.setHasFixedSize(true);

        items.add(new Sub1PageListItem("코카콜라 광고","나는 코카콜라 광고 입니다 나는 코카콜라 광고 입니다 나는 코카콜라 광고 입니다"));
        items.add(new Sub1PageListItem("맥도날드 광고","나는 맥도날드 광고 입니다 나는 맥도날드 광고 입니다 나는 맥도날드 광고 입니다"));
        items.add(new Sub1PageListItem("해커톤 광고","나는 해커톤 광고 입니다. 나는 해커톤 광고 입니다. 나는 해커톤 광고 입니다."));

        myAdapter = new SubMyAdapter(items);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
