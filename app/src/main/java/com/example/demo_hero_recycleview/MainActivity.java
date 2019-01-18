package com.example.demo_hero_recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public ImageView imgView;
    public TextView tv_name;
    String url= "http://static.gamehub.vn/img/files/2018/02/24/Goku_bad_father_1.jpg";
    ArrayList<Item> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ImageView imageView = (ImageView) findViewById(R.id.img_view);
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        RecyclerView recyclerView  = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager  = new LinearLayoutManager(this, LinearLayout.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        arrayList = new ArrayList<>();
        arrayList.add(new Item(url,"Goku Transtin"));
        arrayList.add(new Item("http://genknews.genkcdn.vn/thumb_w/660/2017/photo-1-1512544424603.png","Goku Super Sayja"));
        arrayList.add(new Item("https://t2.rbxcdn.com/7c0dbe9329c7fd350a9c8db4f4aca649","Goku God"));
        arrayList.add(new Item("http://images6.fanpop.com/image/photos/39900000/Goku-Super-Saiyan-God-Dragon-Ball-Z-superboymdj-39975253-1400-700.jpg","Goku Blue"));
        arrayList.add(new Item("https://attackofthefanboy.com/wp-content/uploads/2016/07/Dragon-ball-super-black-goku-fight-760x427.jpg","Goku Black"));
        ItemAdapter itemAdapter =new ItemAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(itemAdapter);
    }
}
