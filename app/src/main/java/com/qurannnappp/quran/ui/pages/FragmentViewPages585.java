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
 * Use the {@link FragmentViewPages585#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentViewPages585 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentViewPages585() {
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
    public static FragmentViewPages585 newInstance(String param1, String param2) {
        FragmentViewPages585 fragment = new FragmentViewPages585();
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
        viewGroup = (ViewGroup) inflater.inflate(R.layout.page585, container, false);
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


        s = getActivity().getResources().getString(R.string.page585);

        views = new ArrayList<>();
        int i = 1 ;
        for (String word : s.split(" ")){
            textView = new TextView(getActivity());
            textView.setText(word);
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(20f);
            views.add(textView);

            switch (i){
                case 2 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num1);
                    views.add(imageView);
                    break;
                case 5 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num2);
                    views.add(imageView);
                    break;
                case 9 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num3);
                    views.add(imageView);
                    break;
                case 13 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num4);
                    views.add(imageView);
                    break;
                case 16 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num5);
                    views.add(imageView);
                    break;
                case 19 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num6);
                    views.add(imageView);
                    break;
                case 23 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num7);
                    views.add(imageView);
                    break;
                case 27 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num8);
                    views.add(imageView);
                    break;
                case 29 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num9);
                    views.add(imageView);
                    break;
                case 32 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num10);
                    views.add(imageView);
                    break;
                case 35 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num11);
                    views.add(imageView);
                    break;
                case 38 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num12);
                    views.add(imageView);
                    break;
                case 41 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num13);
                    views.add(imageView);
                    break;
                case 43 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num14);
                    views.add(imageView);
                    break;
                case 45 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num15);
                    views.add(imageView);
                    break;
                case 47 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num16);
                    views.add(imageView);
                    break;
                case 51 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num17);
                    views.add(imageView);
                    break;
                case 55 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num18);
                    views.add(imageView);
                    break;
                case 59 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num19);
                    views.add(imageView);
                    break;
                case 62 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num20);
                    views.add(imageView);
                    break;
                case 65 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num21);
                    views.add(imageView);
                    break;
                case 69 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num22);
                    views.add(imageView);
                    break;
                case 74 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num23);
                    views.add(imageView);
                    break;
                case 78 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num24);
                    views.add(imageView);
                    break;
                case 82 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num25);
                    views.add(imageView);
                    break;
                case 86 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num26);
                    views.add(imageView);
                    break;
                case 89 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num27);
                    views.add(imageView);
                    break;
                case 91 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num28);
                    views.add(imageView);
                    break;
                case 93 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num29);
                    views.add(imageView);
                    break;
                case 95 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num30);
                    views.add(imageView);
                    break;
                case 97 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num31);
                    views.add(imageView);
                    break;
                case 100 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num32);
                    views.add(imageView);
                    break;
                case 103 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num33);
                    views.add(imageView);
                    break;
                case 108 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num34);
                    views.add(imageView);
                    break;
                case 110 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num35);
                    views.add(imageView);
                    break;
                case 112 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num36);
                    views.add(imageView);
                    break;
                case 118 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num37);
                    views.add(imageView);
                    break;
                case 121 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num38);
                    views.add(imageView);
                    break;
                case 123 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num39);
                    views.add(imageView);
                    break;
                case 127 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num40);
                    views.add(imageView);
                    break;
                case 129 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num41);
                    views.add(imageView);
                    break;
                case 133 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num42);
                    views.add(imageView);
                    break;
            }
            if(word.contains("("))
            Log.d(TAG, "handleViews: " +word+ " " + i);
            i++;
        }


        linearLayout = viewGroup.findViewById(R.id.linear585);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutDirection(LinearLayout.LAYOUT_DIRECTION_RTL);
        populateText(linearLayout , views , getActivity());

    }
}