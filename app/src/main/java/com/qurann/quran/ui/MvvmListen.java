package com.qurann.quran.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.qurann.quran.R;
import com.qurann.quran.pojo.ModelListen;

import java.util.ArrayList;

public class MvvmListen extends ViewModel {

    MutableLiveData<ArrayList<ModelListen>> mutableLiveData ;
    ArrayList<ModelListen> arrayList = new ArrayList<>();
    public LiveData<ArrayList<ModelListen>> getdataListen() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            loaddataListen();
        }
        return mutableLiveData;
    }

    private void loaddataListen() {
      arrayList.add(new ModelListen(R.drawable.play ,"الفاتحة","http://server11.mp3quran.net/shatri/001.mp3",false,0));
      arrayList.add(new ModelListen(R.drawable.play , "البقرة","http://server11.mp3quran.net/shatri/002.mp3",false,1));
      arrayList.add(new ModelListen(R.drawable.play , "آل عمران","http://server11.mp3quran.net/shatri/003.mp3",false,2));
      arrayList.add(new ModelListen(R.drawable.play , "النساء","http://server11.mp3quran.net/shatri/004.mp3",false,3));
      arrayList.add(new ModelListen(R.drawable.play , "المائدة","http://server11.mp3quran.net/shatri/005.mp3",false,4));
      arrayList.add(new ModelListen(R.drawable.play , "الأنعام","http://server11.mp3quran.net/shatri/006.mp3",false,5));
      arrayList.add(new ModelListen(R.drawable.play , "الأعراف","http://server11.mp3quran.net/shatri/007.mp3",false,6));
      arrayList.add(new ModelListen(R.drawable.play , "الأنفال","http://server11.mp3quran.net/shatri/008.mp3",false,7));
      arrayList.add(new ModelListen(R.drawable.play , "التوبة","http://server11.mp3quran.net/shatri/009.mp3",false,8));
      arrayList.add(new ModelListen(R.drawable.play , "يونس","http://server11.mp3quran.net/shatri/010.mp3",false,9));
      arrayList.add(new ModelListen(R.drawable.play , "هود","http://server11.mp3quran.net/shatri/011.mp3",false,10));
      arrayList.add(new ModelListen(R.drawable.play , "يوسف","http://server11.mp3quran.net/shatri/012.mp3",false,11));
      arrayList.add(new ModelListen(R.drawable.play , "الرعد","http://server11.mp3quran.net/shatri/013.mp3",false,12));
      arrayList.add(new ModelListen(R.drawable.play , "إبراهيم","http://server11.mp3quran.net/shatri/014.mp3",false,13));
      arrayList.add(new ModelListen(R.drawable.play , "الحجر","http://server11.mp3quran.net/shatri/015.mp3",false,14));
      arrayList.add(new ModelListen(R.drawable.play , "النحل","http://server11.mp3quran.net/shatri/016.mp3",false,15));
      arrayList.add(new ModelListen(R.drawable.play , "الإسراء","http://server11.mp3quran.net/shatri/017.mp3",false,16));
      arrayList.add(new ModelListen(R.drawable.play , "الكهف","http://server11.mp3quran.net/shatri/018.mp3",false,17));
      arrayList.add(new ModelListen(R.drawable.play , "مريم","http://server11.mp3quran.net/shatri/019.mp3",false,18));
      arrayList.add(new ModelListen(R.drawable.play , "طه","http://server11.mp3quran.net/shatri/020.mp3",false,19));
      arrayList.add(new ModelListen(R.drawable.play , "الأنبياء","http://server11.mp3quran.net/shatri/021.mp3",false,20));
      arrayList.add(new ModelListen(R.drawable.play , "الحج","http://server11.mp3quran.net/shatri/022.mp3",false,21));
      arrayList.add(new ModelListen(R.drawable.play , "المؤمنون","http://server11.mp3quran.net/shatri/023.mp3",false,22));
      arrayList.add(new ModelListen(R.drawable.play , "النور","http://server11.mp3quran.net/shatri/024.mp3",false,23));
      arrayList.add(new ModelListen(R.drawable.play , "الفرقان","http://server11.mp3quran.net/shatri/025.mp3",false,24));
      arrayList.add(new ModelListen(R.drawable.play , "الشعراء","http://server11.mp3quran.net/shatri/026.mp3",false,25));
      arrayList.add(new ModelListen(R.drawable.play , "النمل","http://server11.mp3quran.net/shatri/027.mp3",false,26));
      arrayList.add(new ModelListen(R.drawable.play , "القصص","http://server11.mp3quran.net/shatri/028.mp3",false,27));
      arrayList.add(new ModelListen(R.drawable.play , "العنكبوت","http://server11.mp3quran.net/shatri/029.mp3",false,28));
      arrayList.add(new ModelListen(R.drawable.play , "الروم","http://server11.mp3quran.net/shatri/030.mp3",false,29));
      arrayList.add(new ModelListen(R.drawable.play , "لقمان","http://server11.mp3quran.net/shatri/031.mp3",false,30));
      arrayList.add(new ModelListen(R.drawable.play , "السجدة","http://server11.mp3quran.net/shatri/032.mp3",false,31));
      arrayList.add(new ModelListen(R.drawable.play , "الأحزاب","http://server11.mp3quran.net/shatri/033.mp3",false,32));
      arrayList.add(new ModelListen(R.drawable.play , "سبأ","http://server11.mp3quran.net/shatri/034.mp3",false,33));
      arrayList.add(new ModelListen(R.drawable.play , "فاطر","http://server11.mp3quran.net/shatri/035.mp3",false,34));
      arrayList.add(new ModelListen(R.drawable.play , "يس","http://server11.mp3quran.net/shatri/036.mp3",false,35));
      arrayList.add(new ModelListen(R.drawable.play , "الصافات","http://server11.mp3quran.net/shatri/037.mp3",false,36));
      arrayList.add(new ModelListen(R.drawable.play , "ص","http://server11.mp3quran.net/shatri/038.mp3",false,37));
      arrayList.add(new ModelListen(R.drawable.play , "الزمر","http://server11.mp3quran.net/shatri/039.mp3",false,38));
      arrayList.add(new ModelListen(R.drawable.play , "غافر","http://server11.mp3quran.net/shatri/040.mp3",false,39));
      arrayList.add(new ModelListen(R.drawable.play , "فصلت","http://server11.mp3quran.net/shatri/041.mp3",false,40));
      arrayList.add(new ModelListen(R.drawable.play , "الشورى","http://server11.mp3quran.net/shatri/042.mp3",false,41));
      arrayList.add(new ModelListen(R.drawable.play , "الزخرف","http://server11.mp3quran.net/shatri/043.mp3",false,42));
      arrayList.add(new ModelListen(R.drawable.play , "الدخان","http://server11.mp3quran.net/shatri/044.mp3",false,43));
      arrayList.add(new ModelListen(R.drawable.play , "الجاثية","http://server11.mp3quran.net/shatri/045.mp3",false,44));
      arrayList.add(new ModelListen(R.drawable.play , "الأحقاف","http://server11.mp3quran.net/shatri/046.mp3",false,45));
      arrayList.add(new ModelListen(R.drawable.play , "محمد","http://server11.mp3quran.net/shatri/047.mp3",false,46));
      arrayList.add(new ModelListen(R.drawable.play , "الفتح","http://server11.mp3quran.net/shatri/048.mp3",false,47));
      arrayList.add(new ModelListen(R.drawable.play , "الحجرات","http://server11.mp3quran.net/shatri/049.mp3",false,48));
      arrayList.add(new ModelListen(R.drawable.play , "ق","http://server11.mp3quran.net/shatri/050.mp3",false,49));
      arrayList.add(new ModelListen(R.drawable.play , "الذاريات","http://server11.mp3quran.net/shatri/051.mp3",false,50));
      arrayList.add(new ModelListen(R.drawable.play , "الطور","http://server11.mp3quran.net/shatri/052.mp3",false,51));
      arrayList.add(new ModelListen(R.drawable.play , "النجم","http://server11.mp3quran.net/shatri/053.mp3",false,52));
      arrayList.add(new ModelListen(R.drawable.play , "القمر","http://server11.mp3quran.net/shatri/054.mp3",false,53));
      arrayList.add(new ModelListen(R.drawable.play , "الرحمن","http://server11.mp3quran.net/shatri/055.mp3",false,54));
      arrayList.add(new ModelListen(R.drawable.play , "الواقعة","http://server11.mp3quran.net/shatri/056.mp3",false,55));
      arrayList.add(new ModelListen(R.drawable.play , "الحديد","http://server11.mp3quran.net/shatri/057.mp3",false,56));
      arrayList.add(new ModelListen(R.drawable.play , "المجادلة","http://server11.mp3quran.net/shatri/058.mp3",false,57));
      arrayList.add(new ModelListen(R.drawable.play , "الحشر","http://server11.mp3quran.net/shatri/059.mp3",false,58));
      arrayList.add(new ModelListen(R.drawable.play , "الممتحنة","http://server11.mp3quran.net/shatri/060.mp3",false,59));
      arrayList.add(new ModelListen(R.drawable.play , "الصف","http://server11.mp3quran.net/shatri/061.mp3",false,60));
      arrayList.add(new ModelListen(R.drawable.play , "الجمعة","http://server11.mp3quran.net/shatri/062.mp3",false,61));
      arrayList.add(new ModelListen(R.drawable.play , "المنافقون","http://server11.mp3quran.net/shatri/063.mp3",false,62));
      arrayList.add(new ModelListen(R.drawable.play , "التغابن","http://server11.mp3quran.net/shatri/064.mp3",false,63));
      arrayList.add(new ModelListen(R.drawable.play , "الطلاق","http://server11.mp3quran.net/shatri/065.mp3",false,64));
      arrayList.add(new ModelListen(R.drawable.play , "التحريم","http://server11.mp3quran.net/shatri/066.mp3",false,65));
      arrayList.add(new ModelListen(R.drawable.play , "الملك","http://server11.mp3quran.net/shatri/067.mp3",false,66));
      arrayList.add(new ModelListen(R.drawable.play , "القلم","http://server11.mp3quran.net/shatri/068.mp3",false,67));
      arrayList.add(new ModelListen(R.drawable.play , "الحاقة","http://server11.mp3quran.net/shatri/069.mp3",false,68));
      arrayList.add(new ModelListen(R.drawable.play , "المعارج","http://server11.mp3quran.net/shatri/070.mp3",false,69));
      arrayList.add(new ModelListen(R.drawable.play , "نوح","http://server11.mp3quran.net/shatri/071.mp3",false,70));
      arrayList.add(new ModelListen(R.drawable.play , "الجن","http://server11.mp3quran.net/shatri/072.mp3",false,71));
      arrayList.add(new ModelListen(R.drawable.play , "المزمل","http://server11.mp3quran.net/shatri/073.mp3",false,72));
      arrayList.add(new ModelListen(R.drawable.play , "المدثر","http://server11.mp3quran.net/shatri/074.mp3",false,73));
      arrayList.add(new ModelListen(R.drawable.play , "القيامة","http://server11.mp3quran.net/shatri/075.mp3",false,74));
      arrayList.add(new ModelListen(R.drawable.play , "الإنسان","http://server11.mp3quran.net/shatri/076.mp3",false,75));
      arrayList.add(new ModelListen(R.drawable.play , "المرسلات","http://server11.mp3quran.net/shatri/077.mp3",false,76));
      arrayList.add(new ModelListen(R.drawable.play , "النبأ","http://server11.mp3quran.net/shatri/078.mp3",false,77));
      arrayList.add(new ModelListen(R.drawable.play , "النازعات","http://server11.mp3quran.net/shatri/079.mp3",false,78));
      arrayList.add(new ModelListen(R.drawable.play , "عبس","http://server11.mp3quran.net/shatri/080.mp3",false,79));
      arrayList.add(new ModelListen(R.drawable.play , "التكوير","http://server11.mp3quran.net/shatri/081.mp3",false,80));
      arrayList.add(new ModelListen(R.drawable.play , "الانفطار","http://server11.mp3quran.net/shatri/082.mp3",false,81));
      arrayList.add(new ModelListen(R.drawable.play , "المطففين","http://server11.mp3quran.net/shatri/083.mp3",false,82));
      arrayList.add(new ModelListen(R.drawable.play , "الانشقاق","http://server11.mp3quran.net/shatri/084.mp3",false,83));
      arrayList.add(new ModelListen(R.drawable.play , "البروج","http://server11.mp3quran.net/shatri/085.mp3",false,84));
      arrayList.add(new ModelListen(R.drawable.play , "الطارق","http://server11.mp3quran.net/shatri/086.mp3",false,85));
      arrayList.add(new ModelListen(R.drawable.play , "الأعلى","http://server11.mp3quran.net/shatri/087.mp3",false,86));
      arrayList.add(new ModelListen(R.drawable.play , "الغاشية","http://server11.mp3quran.net/shatri/088.mp3",false,87));
      arrayList.add(new ModelListen(R.drawable.play , "الفجر","http://server11.mp3quran.net/shatri/089.mp3",false,88));
      arrayList.add(new ModelListen(R.drawable.play , "البلد","http://server11.mp3quran.net/shatri/090.mp3",false,89));
      arrayList.add(new ModelListen(R.drawable.play , "الشمس","http://server11.mp3quran.net/shatri/091.mp3",false,90));
      arrayList.add(new ModelListen(R.drawable.play , "الليل","http://server11.mp3quran.net/shatri/092.mp3",false,91));
      arrayList.add(new ModelListen(R.drawable.play , "الضحى","http://server11.mp3quran.net/shatri/093.mp3",false,92));
      arrayList.add(new ModelListen(R.drawable.play , "الشرح","http://server11.mp3quran.net/shatri/094.mp3",false,93));
      arrayList.add(new ModelListen(R.drawable.play , "التين","http://server11.mp3quran.net/shatri/095.mp3",false,94));
      arrayList.add(new ModelListen(R.drawable.play , "العلق","http://server11.mp3quran.net/shatri/096.mp3",false,95));
      arrayList.add(new ModelListen(R.drawable.play , "القدر","http://server11.mp3quran.net/shatri/097.mp3",false,96));
      arrayList.add(new ModelListen(R.drawable.play , "البينة","http://server11.mp3quran.net/shatri/098.mp3",false,97));
      arrayList.add(new ModelListen(R.drawable.play , "الزلزلة","http://server11.mp3quran.net/shatri/099.mp3",false,98));
      arrayList.add(new ModelListen(R.drawable.play , "العاديات","http://server11.mp3quran.net/shatri/100.mp3",false,99));
      arrayList.add(new ModelListen(R.drawable.play , "القارعة","http://server11.mp3quran.net/shatri/101.mp3",false,100));
      arrayList.add(new ModelListen(R.drawable.play , "التكاثر","http://server11.mp3quran.net/shatri/102.mp3",false,101));
      arrayList.add(new ModelListen(R.drawable.play , "العصر","http://server11.mp3quran.net/shatri/103.mp3",false,102));
      arrayList.add(new ModelListen(R.drawable.play , "الهمزة","http://server11.mp3quran.net/shatri/104.mp3",false,103));
      arrayList.add(new ModelListen(R.drawable.play , "الفيل","http://server11.mp3quran.net/shatri/105.mp3",false,104));
      arrayList.add(new ModelListen(R.drawable.play , "قريش","http://server11.mp3quran.net/shatri/106.mp3",false,105));
      arrayList.add(new ModelListen(R.drawable.play , "الماعون","http://server11.mp3quran.net/shatri/107.mp3",false,106));
      arrayList.add(new ModelListen(R.drawable.play , "الكوثر","http://server11.mp3quran.net/shatri/108.mp3",false,107));
      arrayList.add(new ModelListen(R.drawable.play , "الكافرون","http://server11.mp3quran.net/shatri/109.mp3",false,108));
      arrayList.add(new ModelListen(R.drawable.play , "النصر","http://server11.mp3quran.net/shatri/110.mp3",false,109));
      arrayList.add(new ModelListen(R.drawable.play , "المسد","http://server11.mp3quran.net/shatri/111.mp3",false,110));
      arrayList.add(new ModelListen(R.drawable.play , "الإخلاص","http://server11.mp3quran.net/shatri/112.mp3",false,111));
      arrayList.add(new ModelListen(R.drawable.play , "الفلق","http://server11.mp3quran.net/shatri/113.mp3",false,112));
      arrayList.add(new ModelListen(R.drawable.play , "الناس","http://server11.mp3quran.net/shatri/114.mp3",false,113));

      mutableLiveData.setValue(arrayList);
    }


}
