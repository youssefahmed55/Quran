package com.qurann.quran.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.qurann.quran.R;
import com.qurann.quran.pojo.ModelMain;
import com.qurann.quran.ui.pages.*;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SuraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SuraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SuraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SuraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SuraFragment newInstance(String param1, String param2) {
        SuraFragment fragment = new SuraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        setHasOptionsMenu(true);
    }
  private View view;
  private RecyclerView recyclerView;
  private MyRecycleAdapter myRecycleAdapter;
  private MvvmReadQuranSura mvvm ;
  private Bundle bundle;
  private Intent intent;
  private ArrayList<ModelMain> arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sura, container, false);
        inti();
        observedata();
        onclickitem();
        return view;
    }
    private void inti(){
        recyclerView = view.findViewById(R.id.recycle_sura);
        myRecycleAdapter = new MyRecycleAdapter();
        mvvm = new ViewModelProvider(requireActivity()).get(MvvmReadQuranSura.class);
        bundle = new Bundle();
         intent = new Intent(getActivity(),SecondActivity.class);
    }
    private  void  observedata(){
        mvvm.getdata().observe(getViewLifecycleOwner(), new Observer<ArrayList<ModelMain>>() {
            @Override
            public void onChanged(ArrayList<ModelMain> modelMains) {
                     arrayList = modelMains;
                     myRecycleAdapter.setArrayList(arrayList);
                     recyclerView.setAdapter(myRecycleAdapter);
            }
        });

    }
    private void  onclickitem(){
        myRecycleAdapter.setOnClickListenerr(new MyRecycleAdapter.OnClickListenerr() {
            @Override
            public void onClick(int postion) {
                switch (postion){
                    case 0 :
                        bundle.putInt("key" , 0);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 1 :
                        bundle.putInt("key" , 1);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 2 :
                        bundle.putInt("key" , 49);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 3 :
                        bundle.putInt("key" , 76);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 4 :
                        bundle.putInt("key" , 105);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 5 :
                        bundle.putInt("key" , 127);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 6 :
                        bundle.putInt("key" , 150);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 7 :
                        bundle.putInt("key" , 176);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 8 :
                        bundle.putInt("key" , 186);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 9 :
                        bundle.putInt("key" , 207);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 10 :
                        bundle.putInt("key" , 220);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 11 :
                        bundle.putInt("key" , 234);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 12 :
                        bundle.putInt("key" , 248);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 13 :
                        bundle.putInt("key" , 254);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 14 :
                        bundle.putInt("key" , 261);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 15 :
                        bundle.putInt("key" , 266);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 16 :
                        bundle.putInt("key" , 281);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 17 :
                        bundle.putInt("key" , 292);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 18 :
                        bundle.putInt("key" , 304);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 19 :
                        bundle.putInt("key" , 311);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 20 :
                        bundle.putInt("key" , 321);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 21 :
                        bundle.putInt("key" , 331);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 22 :
                        bundle.putInt("key" , 341);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 23 :
                        bundle.putInt("key" , 349);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 24 :
                        bundle.putInt("key" , 358);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 25 :
                        bundle.putInt("key" , 366);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 26 :
                        bundle.putInt("key" , 376);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 27 :
                        bundle.putInt("key" , 384);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 28 :
                        bundle.putInt("key" , 395);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 29 :
                        bundle.putInt("key" , 403);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 30 :
                        bundle.putInt("key" , 410);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 31 :
                        bundle.putInt("key" , 414);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 32 :
                        bundle.putInt("key" , 417);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 33 :
                        bundle.putInt("key" , 427);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 34 :
                        bundle.putInt("key" , 433);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 35 :
                        bundle.putInt("key" , 439);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 36 :
                        bundle.putInt("key" , 445);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 37 :
                        bundle.putInt("key" , 452);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 38 :
                        bundle.putInt("key" , 457);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 39 :
                        bundle.putInt("key" , 466);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 40 :
                        bundle.putInt("key" , 476);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 41 :
                        bundle.putInt("key" , 482);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 42 :
                        bundle.putInt("key" , 488);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 43 :
                        bundle.putInt("key" , 495);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 44 :
                        bundle.putInt("key" , 498);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 45 :
                        bundle.putInt("key" , 501);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 46 :
                        bundle.putInt("key" , 506);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 47 :
                        bundle.putInt("key" , 510);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 48 :
                        bundle.putInt("key" , 514);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 49 :
                        bundle.putInt("key" , 517);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 50 :
                        bundle.putInt("key" , 519);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 51 :
                        bundle.putInt("key" , 522);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 52 :
                        bundle.putInt("key" , 525);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 53 :
                        bundle.putInt("key" , 527);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 54 :
                        bundle.putInt("key" , 530);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 55 :
                        bundle.putInt("key" , 533);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 56 :
                        bundle.putInt("key" , 536);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 57 :
                        bundle.putInt("key" , 541);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 58 :
                        bundle.putInt("key" , 544);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 59 :
                        bundle.putInt("key" , 548);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 60 :
                        bundle.putInt("key" , 550);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 61 :
                        bundle.putInt("key" , 552);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 62 :
                        bundle.putInt("key" , 553);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 63 :
                        bundle.putInt("key" , 555);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 64 :
                        bundle.putInt("key" , 557);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 65 :
                        bundle.putInt("key" , 559);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 66 :
                        bundle.putInt("key" , 561);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 67 :
                        bundle.putInt("key" , 563);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 68 :
                        bundle.putInt("key" , 565);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 69 :
                        bundle.putInt("key" , 567);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 70 :
                        bundle.putInt("key" , 569);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 71 :
                        bundle.putInt("key" , 571);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 72 :
                        bundle.putInt("key" , 573);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 73 :
                        bundle.putInt("key" , 574);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 74 :
                        bundle.putInt("key" , 576);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 75 :
                        bundle.putInt("key" , 577);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 76 :
                        bundle.putInt("key" , 579);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 77 :
                        bundle.putInt("key" , 581);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 78 :
                        bundle.putInt("key" , 582);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 79 :
                        bundle.putInt("key" , 584);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 80 :
                        bundle.putInt("key" , 585);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 81 :
                        bundle.putInt("key" , 586);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 82 :
                        bundle.putInt("key" , 586);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 83 :
                        bundle.putInt("key" , 588);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 84 :
                        bundle.putInt("key" , 589);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 85 :
                        bundle.putInt("key" , 590);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 86 :
                        bundle.putInt("key" , 590);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 87 :
                        bundle.putInt("key" , 591);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 88 :
                        bundle.putInt("key" , 592);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 89 :
                        bundle.putInt("key" , 593);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 90 :
                        bundle.putInt("key" , 594);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 91 :
                        bundle.putInt("key" , 594);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 92 :
                        bundle.putInt("key" , 595);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 93 :
                        bundle.putInt("key" , 595);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 94 :
                        bundle.putInt("key" , 596);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 95 :
                        bundle.putInt("key" , 596);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 96 :
                        bundle.putInt("key" , 597);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 97 :
                        bundle.putInt("key" , 597);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 98 :
                        bundle.putInt("key" , 598);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 99 :
                        bundle.putInt("key" , 598);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 100 :
                        bundle.putInt("key" , 599);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 101 :
                        bundle.putInt("key" , 599);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 102 :
                        bundle.putInt("key" , 600);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 103 :
                        bundle.putInt("key" , 600);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 104 :
                        bundle.putInt("key" , 600);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 105 :
                        bundle.putInt("key" , 601);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 106 :
                        bundle.putInt("key" , 601);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 107 :
                        bundle.putInt("key" , 601);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 108 :
                        bundle.putInt("key" , 602);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 109 :
                        bundle.putInt("key" , 602);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 110 :
                        bundle.putInt("key" , 602);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 111 :
                        bundle.putInt("key" , 603);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 112 :
                        bundle.putInt("key" , 603);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 113 :
                        bundle.putInt("key" , 603);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;






                }
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_items, menu);

        MenuItem menuItem = menu.findItem(R.id.search_tool);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (!s.isEmpty()) {
                    myRecycleAdapter.setArrayList(getsearchitem(s, arrayList));
                }else{
                    myRecycleAdapter.setArrayList(arrayList);
                }
                myRecycleAdapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    private ArrayList<ModelMain> getsearchitem(String s, ArrayList<ModelMain> s2) {

        ArrayList<ModelMain> arrayList1 = new ArrayList<>();
        if (!s.equals(""))
            for (ModelMain e : s2) {
                if (e.getTitle().charAt(0) == s.charAt(0))
                    if (e.getTitle().contains(s)) {
                        arrayList1.add(e);
                    }
            }
        return arrayList1;
    }
}