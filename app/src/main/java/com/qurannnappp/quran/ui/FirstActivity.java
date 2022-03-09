package com.qurannnappp.quran.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.qurannnappp.quran.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FirstActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager2 viewPager2;
private Myfragmentadapter myfragmentadapter;
private String[] titles = new String[]{"Sura","Juz"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        inti();

        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(titles[position]))).attach();

    }

    private void  inti(){
        tabLayout = findViewById(R.id.tablayout);
        viewPager2 = findViewById(R.id.viewpager);
        myfragmentadapter = new Myfragmentadapter(this , 2);
        viewPager2.setAdapter(myfragmentadapter);


    }
}