package com.example.dvp;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.dvp.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {


    LinearLayout linearLayout;
    RecyclerView recyclerView;
    String s1[],s2[];
    int hinhAnh[]={R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.k};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.filter);
        linearLayout.setVisibility(View.GONE);
        recyclerView = findViewById(R.id.recycle);
        s1 = getResources().getStringArray(R.array.tenphim);
        s2 = getResources().getStringArray(R.array.theloai);
        MyAdapter myAdapter = new MyAdapter(this,s1,s2,hinhAnh);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        //Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.devider);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void tatca(View view) {
    }

    public void dachieu(View view) {
    }

    public void timkiem(View view) {
    }

    public void lick(View view) {
        linearLayout.setVisibility(View.VISIBLE);
    }
}