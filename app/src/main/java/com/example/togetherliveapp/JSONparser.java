package com.example.togetherliveapp;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONparser {
    public String returnText;
    public  String httpConnection(){
        Thread thread = new Thread(new Runnable() {
            URL url = null;
            HttpURLConnection con = null;
            String jsonData = "";
            BufferedReader br = null;
            StringBuffer sb = null;

            @Override
            public void run() {
                try{
                    url = new URL("http://210.115.229.97:8000/item/");

                    con = (HttpURLConnection) url.openConnection();
                    con.setRequestProperty("Accept", "application/json");
                    con.setRequestMethod("GET");
                    con.connect();

                    br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));

                    sb = new StringBuffer();

                    while ((jsonData = br.readLine())!= null){
                        sb.append(jsonData);
                    }

                    returnText = sb.toString();
                    System.out.println(returnText);
                } catch (MalformedURLException e ){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        while (thread.isAlive()){

        }
        return returnText;
    }
}
