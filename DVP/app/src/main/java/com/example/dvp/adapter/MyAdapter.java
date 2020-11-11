package com.example.dvp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dvp.Activity_chititet;
import com.example.dvp.R;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[],data2[];
    int hinh[];
    Context context;
    public MyAdapter(Context ct, String s1[], String s2[], int hinhAnh[]){
        context = ct;
        data1 = s2;
        data2 = s1;
        hinh = hinhAnh;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.text1.setText(data1[position]);
      holder.text2.setText(data2[position]);
      holder.img.setImageResource(hinh[position]);
      holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(context, Activity_chititet.class);
              context.startActivity(intent);
          }
      });

    }

    @Override
    public int getItemCount() {
        return hinh.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text1,text2;
        ImageView img;
        ConstraintLayout constraintLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.textView);
            text2 = itemView.findViewById(R.id.textView2);
            img = itemView.findViewById(R.id.imageView);
            constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.layoutds);
        }
    }
}
