package com.qurann.quran.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.qurann.quran.R;
import com.qurann.quran.pojo.ModelMain;

import java.util.ArrayList;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.Holder> {

    ArrayList<ModelMain> arrayList;
    OnClickListenerr onClickListenerr;
    public void setArrayList(ArrayList<ModelMain> arrayList) {
        this.arrayList = arrayList;
    }

    public void setOnClickListenerr(OnClickListenerr onClickListenerr) {
        this.onClickListenerr = onClickListenerr;
    }

    public interface OnClickListenerr {
        void onClick(int postion) ;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
              holder.imageView.setImageResource(arrayList.get(position).getImage());
              holder.textView.setText(arrayList.get(position).getTitle());
              holder.textView2.setText(String.valueOf(arrayList.get(position).getId() +1) +" -");

    }

    @Override
    public int getItemCount() {
        if(arrayList != null){
            return arrayList.size();
        }else {
            return 0;
        }
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView, textView2;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_item);
            textView = itemView.findViewById(R.id.text_item);
            textView2 = itemView.findViewById(R.id.textnum);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAbsoluteAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        // you can trust the adapter position
                        // do whatever you intend to do with this position
                        if (onClickListenerr != null)
                            onClickListenerr.onClick(arrayList.get(getAbsoluteAdapterPosition()).getId());
                    }
                }
            });
        }
    }
}

