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
 * Use the {@link FragmentViewPages370#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentViewPages370 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentViewPages370() {
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
    public static FragmentViewPages370 newInstance(String param1, String param2) {
        FragmentViewPages370 fragment = new FragmentViewPages370();
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
        viewGroup = (ViewGroup) inflater.inflate(R.layout.page370, container, false);
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


        s = getActivity().getResources().getString(R.string.page370);

        views = new ArrayList<>();
        int i = 1 ;
        for (String word : s.split(" ")){
            textView = new TextView(getActivity());
            textView.setText(word);
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(20f);
            views.add(textView);

            switch (i){
                case 8 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num61);
                    views.add(imageView);
                    break;
                case 14 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num62);
                    views.add(imageView);
                    break;
                case 27 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num63);
                    views.add(imageView);
                    break;
                case 30 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num64);
                    views.add(imageView);
                    break;
                case 35 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num65);
                    views.add(imageView);
                    break;
                case 38 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num66);
                    views.add(imageView);
                    break;
                case 46 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num67);
                    views.add(imageView);
                    break;
                case 51 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num68);
                    views.add(imageView);
                    break;
                case 55 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num69);
                    views.add(imageView);
                    break;
                case 61 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num70);
                    views.add(imageView);
                    break;
                case 67 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num71);
                    views.add(imageView);
                    break;
                case 72 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num72);
                    views.add(imageView);
                    break;
                case 76 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num73);
                    views.add(imageView);
                    break;
                case 82 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num74);
                    views.add(imageView);
                    break;
                case 87 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num75);
                    views.add(imageView);
                    break;
                case 90 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num76);
                    views.add(imageView);
                    break;
                case 96 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num77);
                    views.add(imageView);
                    break;
                case 100 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num78);
                    views.add(imageView);
                    break;
                case 104 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num79);
                    views.add(imageView);
                    break;
                case 108 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num80);
                    views.add(imageView);
                    break;
                case 112 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num81);
                    views.add(imageView);
                    break;
                case 120 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num82);
                    views.add(imageView);
                    break;
                case 126 :
                    imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.num83);
                    views.add(imageView);
                    break;

            }if(word.contains("("))
            Log.d(TAG, "handleViews: " +word+ " " + i);
            i++;
        }


        linearLayout = viewGroup.findViewById(R.id.linear370);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutDirection(LinearLayout.LAYOUT_DIRECTION_RTL);
        populateText(linearLayout , views , getActivity());

    }
}