package com.example.thuchanh12_03_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList= new ArrayList<>();
        arrayList.add(new Goods("Adidas", "Shop Babe", R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Goods("Computer", "Shop home", R.drawable.computer_engineer));
        arrayList.add(new Goods("Google black", "Shop Center", R.drawable.download));
        adt= new CustomGoodAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);
    }
}