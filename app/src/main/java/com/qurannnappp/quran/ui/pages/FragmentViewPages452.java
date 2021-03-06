package com.qurannnappp.quran.ui.pages;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.qurannnappp.quran.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentViewPages452#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentViewPages452 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentViewPages452() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentViewPages3.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentViewPages452 newInstance(String param1, String param2) {
        FragmentViewPages452 fragment = new FragmentViewPages452();
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
    private static final String TAG = "youssef2";
    private LinearLayout linearLayout;
    private TextView textView;
    private ImageView imageView ;
    private ArrayList<View> views;
    private String s;
    private  ViewGroup viewGroup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        viewGroup = (ViewGroup) inflater.inflate(R.layout.page452, container, false);
        handleViews();
        return viewGroup ;
    }

    private void populateText(LinearLayout ll, ArrayList<View> views , Context mContext) {
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        ll.removeAllViews();
        int maxWidth = display.getWidth() - 30;

        LinearLayout.LayoutParams params;
        LinearLayout newLL = new LinearLayout(mContext);
        newLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        newLL.setGravity(Gravity.RIGHT);
        newLL.setLayoutDirection(LinearLayout.LAYOUT_DIRECTION_RTL);
        newLL.setOrientation(LinearLayout.HORIZONTAL);

        int widthSoFar = 0;

        for (int i = 0 ; i < views.size() ; i++ ){
            LinearLayout LL = new LinearLayout(mContext);
            LL.setOrientation(LinearLayout.HORIZONTAL);
            LL.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM);
            LL.setLayoutParams(new ListView.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            //my old code
            //TV = new TextView(mContext);
            //TV.setText(textArray[i]);
            //TV.setTextSize(size);  <<<< SET TEXT SIZE
            //TV.measure(0, 0);
            views.get(i).measure(0,0);
            params = new LinearLayout.LayoutParams(views.get(i).getMeasuredWidth(),
                    110);
            params.setMargins(4, 0, 4, 0);  // YOU CAN USE THIS
            //LL.addView(TV, params);
            LL.addView(views.get(i), params);
            LL.measure(0, 0);
            widthSoFar += views.get(i).getMeasuredWidth() + 25;// YOU MAY NEED TO ADD THE MARGINS
            if (widthSoFar >= maxWidth) {
                ll.addView(newLL);

                newLL = new LinearLayout(mContext);
                newLL.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.FILL_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));
                newLL.setOrientation(LinearLayout.HORIZONTAL);
                newLL.setGravity(Gravity.RIGHT);
                newLL.setLayoutDirection(LinearLayout.LAYOUT_DIRECTION_RTL);
                params = new LinearLayout.LayoutParams(LL
                        .getMeasuredWidth(), LL.getMeasuredHeight());
                newLL.addView(LL, params);
                widthSoFar = LL.getMeasuredWidth();
            } else {
                newLL.addView(LL);
            }
        }
        ll.addView(newLL);
    }
    private void handleViews(){


        s = getActivity().getResources().getString(R.string.page452);

        views = new ArrayList<>();
        int i = 1 ;
        for (String word : s.split(" ")){
            textView = new TextView(getActivity());
            textView.setText(word);
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(20f);
            views.add(textView);

            switch (i){
                case 4 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num154);
                    views.add(imageView);
                    break;
                case 6 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num155);
                    views.add(imageView);
                    break;
                case 10 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num156);
                    views.add(imageView);
                    break;
                case 15 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num157);
                    views.add(imageView);
                    break;
                case 25 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num158);
                    views.add(imageView);
                    break;
                case 29 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num159);
                    views.add(imageView);
                    break;
                case 33 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num160);
                    views.add(imageView);
                    break;
                case 36 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num161);
                    views.add(imageView);
                    break;
                case 40 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num162);
                    views.add(imageView);
                    break;
                case 45 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num163);
                    views.add(imageView);
                    break;
                case 51 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num164);
                    views.add(imageView);
                    break;
                case 54 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num165);
                    views.add(imageView);
                    break;
                case 57 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num166);
                    views.add(imageView);
                    break;
                case 60 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num167);
                    views.add(imageView);
                    break;
                case 66 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num168);
                    views.add(imageView);
                    break;
                case 70 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num169);
                    views.add(imageView);
                    break;
                case 74 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num170);
                    views.add(imageView);
                    break;
                case 79 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num171);
                    views.add(imageView);
                    break;
                case 82 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num172);
                    views.add(imageView);
                    break;
                case 86 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num173);
                    views.add(imageView);
                    break;
                case 90 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num174);
                    views.add(imageView);
                    break;
                case 93 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num175);
                    views.add(imageView);
                    break;
                case 95 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num176);
                    views.add(imageView);
                    break;
                case 101 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num177);
                    views.add(imageView);
                    break;
                case 105 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num178);
                    views.add(imageView);
                    break;
                case 108 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num179);
                    views.add(imageView);
                    break;
                case 114 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num180);
                    views.add(imageView);
                    break;
                case 117 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num181);
                    views.add(imageView);
                    break;
                case 121 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num182);
                    views.add(imageView);
                    break;

            }
            Log.d(TAG, "handleViews: " +word+ " " + i);
            i++;
        }


        linearLayout = viewGroup.findViewById(R.id.linear452);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutDirection(LinearLayout.LAYOUT_DIRECTION_RTL);
        populateText(linearLayout , views , getActivity());

    }
}