package com.qurann.quran.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.qurann.quran.R;
import com.qurann.quran.pojo.ModelMain;

import java.util.ArrayList;

public class MvvmReadQuranJuz extends ViewModel {

    MutableLiveData<ArrayList<ModelMain>> mutableLiveData ;
    ArrayList<ModelMain> arrayList = new ArrayList<>();
    public LiveData<ArrayList<ModelMain>> getdata() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            loaddata();
        }
        return mutableLiveData;
    }

    private void loaddata() {
      arrayList.add(new ModelMain(R.mipmap.quranicon ,"Juz 1",0));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 2",1));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 3",2));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 4",3));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 5",4));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 6",5));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 7",6));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 8",7));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 9",8));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 10",9));
      arrayList.add(new ModelMain(R.mipmap.quranicon ,"Juz 11",10));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 12",11));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 13",12));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 14",13));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 15",14));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 16",15));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 17",16));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 18",17));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 19",18));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 20",19));
      arrayList.add(new ModelMain(R.mipmap.quranicon ,"Juz 21",20));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 22",21));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 23",22));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 24",23));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 25",24));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 26",25));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 27",26));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 28",27));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 29",28));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Juz 30",29));

      mutableLiveData.setValue(arrayList);
    }


}
