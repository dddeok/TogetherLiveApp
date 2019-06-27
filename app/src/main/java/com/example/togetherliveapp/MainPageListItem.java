package com.example.togetherliveapp;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainPageListItem {
    String main_title;
    String sub_title;

    int owner;
    String title;
    String tags;
    ArrayList<String> join_person;
    String Contents;
    int peron_limit;

    public MainPageListItem(String main, String sub){

        this.main_title = main;
        this.sub_title = sub;
    }

}
