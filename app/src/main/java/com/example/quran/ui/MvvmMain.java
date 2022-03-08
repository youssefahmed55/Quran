package com.example.quran.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.quran.R;
import com.example.quran.pojo.ModelMain;

import java.util.ArrayList;

public class MvvmMain extends ViewModel {

    MutableLiveData<ArrayList<ModelMain>> mutableLiveData ;
    ArrayList<ModelMain> arrayList = new ArrayList<>();
    public LiveData<ArrayList<ModelMain>> getdatamain() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            loaddatamain();
        }
        return mutableLiveData;
    }

    private void loaddatamain() {
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Read Quran",0));
      arrayList.add(new ModelMain(R.drawable.qiblaicon , "Qibla",1));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "Listen Quran",2));
      mutableLiveData.setValue(arrayList);
    }

}
