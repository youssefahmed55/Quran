package com.qurannnappp.quran.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Myfragmentadapter extends FragmentStateAdapter {

    int pageCount;
    public Myfragmentadapter(@NonNull FragmentActivity fragmentActivity , int pageCount) {
        super(fragmentActivity);
         this.pageCount = pageCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new SuraFragment();
            case 1 : return new JuzFragment();

            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return pageCount;
    }
}
