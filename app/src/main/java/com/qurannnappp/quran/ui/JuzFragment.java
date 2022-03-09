package com.qurannnappp.quran.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qurannnappp.quran.R;
import com.qurannnappp.quran.pojo.ModelMain;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JuzFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JuzFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JuzFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JuzFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static JuzFragment newInstance(String param1, String param2) {
        JuzFragment fragment = new JuzFragment();
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
    }
    private View view;
    private RecyclerView recyclerView;
    private MyRecycleAdapter myRecycleAdapter;
    private MvvmReadQuranJuz mvvm ;
    private Bundle bundle;
    private Intent intent;
    private ArrayList<ModelMain> arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_juz, container, false);
        inti();
        observedata();
        onclickitem();
        return view;
    }
    private void inti(){
        recyclerView = view.findViewById(R.id.recycle_juz);
        myRecycleAdapter = new MyRecycleAdapter();
        mvvm = new ViewModelProvider(requireActivity()).get(MvvmReadQuranJuz.class);
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
                        bundle.putInt("key" , 21);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 2 :
                        bundle.putInt("key" , 41);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 3 :
                        bundle.putInt("key" , 61);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 4 :
                        bundle.putInt("key" , 81);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 5 :
                        bundle.putInt("key" , 101);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 6 :
                        bundle.putInt("key" , 121);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 7 :
                        bundle.putInt("key" , 141);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 8 :
                        bundle.putInt("key" , 161);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 9 :
                        bundle.putInt("key" , 181);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 10 :
                        bundle.putInt("key" , 201);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 11 :
                        bundle.putInt("key" , 221);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 12 :
                        bundle.putInt("key" , 241);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 13 :
                        bundle.putInt("key" , 261);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 14 :
                        bundle.putInt("key" , 281);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 15 :
                        bundle.putInt("key" , 301);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 16 :
                        bundle.putInt("key" , 321);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 17 :
                        bundle.putInt("key" , 341);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 18 :
                        bundle.putInt("key" , 361);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 19 :
                        bundle.putInt("key" , 381);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 20 :
                        bundle.putInt("key" , 401);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 21 :
                        bundle.putInt("key" , 421);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 22 :
                        bundle.putInt("key" , 441);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 23 :
                        bundle.putInt("key" , 461);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 24 :
                        bundle.putInt("key" , 481);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 25 :
                        bundle.putInt("key" , 501);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 26 :
                        bundle.putInt("key" , 521);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 27 :
                        bundle.putInt("key" , 541);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 28 :
                        bundle.putInt("key" , 561);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 29 :
                        bundle.putInt("key" , 581);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;


                }
            }
        });
    }
}