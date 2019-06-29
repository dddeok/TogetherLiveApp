package com.example.togetherliveapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Sub1Activity extends Activity {
    Context mCotext;
    RecyclerView recyclerView;
    SubMyAdapter myAdapter ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1_page);

        mCotext = getApplicationContext();

        ArrayList<Sub1PageListItem> items = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.sub1_recycle);
        recyclerView.setHasFixedSize(true);

        items.add(new Sub1PageListItem("요리재료 공동구매합니다","요리재료 공동구매합니다 요리재료 공동구매합니다 요리재료 공동구매합니다"));
        items.add(new Sub1PageListItem("요리도구 공동구매합니다","요리도구 공동구매합니다 요리도구 공동구매합니다 요리도구 공동구매합니다 "));
        items.add(new Sub1PageListItem("아무거나 공동구매합니다","아무거나 공동구매합니다  공동구매합니다 아무거나 공동구매합니다"));

        myAdapter = new SubMyAdapter(items);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
