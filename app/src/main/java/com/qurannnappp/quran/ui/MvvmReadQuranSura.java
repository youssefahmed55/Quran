package com.qurannnappp.quran.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.qurannnappp.quran.R;
import com.qurannnappp.quran.pojo.ModelMain;

import java.util.ArrayList;

public class MvvmReadQuranSura extends ViewModel {

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
      arrayList.add(new ModelMain(R.mipmap.quranicon ,"الفاتحة",0));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "البقرة",1));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "آل عمران",2));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النساء",3));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المائدة",4));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأنعام",5));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأعراف",6));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأنفال",7));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "التوبة",8));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "يونس",9));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "هود",10));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "يوسف",11));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الرعد",12));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "إبراهيم",13));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الحجر",14));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النحل",15));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الإسراء",16));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الكهف",17));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "مريم",18));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "طه",19));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأنبياء",20));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الحج",21));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المؤمنون",22));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النور",23));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الفرقان",24));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الشعراء",25));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النمل",26));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "القصص",27));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "العنكبوت",28));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الروم",29));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "لقمان",30));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "السجدة",31));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأحزاب",32));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "سبأ",33));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "فاطر",34));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "يس",35));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الصافات",36));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "ص",37));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الزمر",38));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "غافر",39));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "فصلت",40));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الشورى",41));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الزخرف",42));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الدخان",43));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الجاثية",44));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأحقاف",45));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "محمد",46));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الفتح",47));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الحجرات",48));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "ق",49));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الذاريات",50));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الطور",51));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النجم",52));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "القمر",53));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الرحمن",54));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الواقعة",55));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الحديد",56));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المجادلة",57));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الحشر",58));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الممتحنة",59));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الصف",60));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الجمعة",61));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المنافقون",62));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "التغابن",63));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الطلاق",64));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "التحريم",65));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الملك",66));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "القلم",67));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الحاقة",68));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المعارج",69));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "نوح",70));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الجن",71));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المزمل",72));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المدثر",73));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "القيامة",74));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الإنسان",75));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المرسلات",76));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النبأ",77));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النازعات",78));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "عبس",79));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "التكوير",80));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الانفطار",81));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المطففين",82));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الانشقاق",83));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "البروج",84));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الطارق",85));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الأعلى",86));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الغاشية",87));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الفجر",88));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "البلد",89));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الشمس",90));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الليل",91));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الضحى",92));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الشرح",93));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "التين",94));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "العلق",95));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "القدر",96));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "البينة",97));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الزلزلة",98));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "العاديات",99));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "القارعة",100));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "التكاثر",101));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "العصر",102));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الهمزة",103));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الفيل",104));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "قريش",105));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الماعون",106));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الكوثر",107));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الكافرون",108));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "النصر",109));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "المسد",110));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الإخلاص",111));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الفلق",112));
      arrayList.add(new ModelMain(R.mipmap.quranicon , "الناس",113));

      mutableLiveData.setValue(arrayList);
    }


}
