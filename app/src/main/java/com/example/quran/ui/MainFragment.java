package com.example.quran.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.quran.R;
import com.example.quran.pojo.ModelMain;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
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
    private RecyclerView recyclerView;
    private View view;
    private MyRecycleAdapter myRecycleAdapter;
    private MvvmMain mvvm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        onpressback();
        inti();
        observedata();
        onclickitem();
        return view;
    }

    private void inti(){
        recyclerView = view.findViewById(R.id.recyclemain);
        myRecycleAdapter = new MyRecycleAdapter();
        mvvm = new ViewModelProvider(requireActivity()).get(MvvmMain.class);


    }

    private void onpressback (){

        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                getActivity().finish();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);
    }

    private void observedata(){
        mvvm.getdatamain().observe(getViewLifecycleOwner(), new Observer<ArrayList<ModelMain>>() {
                    @Override
                    public void onChanged(ArrayList<ModelMain> modelMains) {
                        myRecycleAdapter.setArrayList(modelMains);
                        recyclerView.setAdapter(myRecycleAdapter);
                    }
                });


    }
    private void onclickitem(){

        myRecycleAdapter.setOnClickListenerr(new MyRecycleAdapter.OnClickListenerr() {
            @Override
            public void onClick(int postion) {
                switch (postion){
                    case 0 :
                        Intent intent = new Intent(getActivity(),FirstActivity.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_qiblaFragment);
                        break;
                    case 2 :
                        Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_listenQuran);
                        break;

                }
            }
        });
    }
}