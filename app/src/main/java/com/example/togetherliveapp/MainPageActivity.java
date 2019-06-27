package com.example.togetherliveapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.ViewHolder;

public class MainPageActivity extends Activity {
    Context mCotext;
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        mCotext = getApplicationContext();

        ArrayList<MainPageListItem> items = new ArrayList<>();

        items.add(new MainPageListItem("뉴스 & 이벤트", "최근소식과 이벤트를 알려드립니다!"));
        items.add(new MainPageListItem("공동 구매", "같이 사서 나눠쓰자"));
        items.add(new MainPageListItem("중고나라", "중고를 새것처럼!"));
        items.add(new MainPageListItem("동네정보","주위의 알뜰한 정보를 공유해보자!"));

        recyclerView = (RecyclerView)findViewById(R.id.main_recycle);
        recyclerView.setHasFixedSize(true);

        MyAdapter myAdapter = new MyAdapter(items);
        recyclerView.setAdapter(myAdapter);
    }
}
