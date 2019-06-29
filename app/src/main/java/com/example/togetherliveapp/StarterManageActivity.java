package com.example.togetherliveapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class StarterManageActivity extends AppCompatActivity {

    Fragment fragment = new Fragment();
    int Max_Page = 5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter_manage);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(new adapater(getSupportFragmentManager()));

    }

    public class adapater extends FragmentPagerAdapter{
        public adapater(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if(i<0 || Max_Page<=i)
                return null;
            switch (i){
                case 0:
                    fragment = new StarterOneActivity();
                    break;
                case 1:
                    fragment = new StarterTwoActivity();
                    break;
                case 2:
                    fragment = new StarterThreeActivity();
                    break;
                case 3:
                    fragment = new StarterFourActivity();
                    break;
                case 4:
                    fragment = new StarterFiveActivity();
                    break;
            }
            return fragment;
        }
        @Override
        public int getCount() {
            return Max_Page;
        }
    }
}
