package com.example.a18056691_vodaiquyen_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Google","18$",R.drawable.google));
        arrayList.add(new Goods("Google","18$",R.drawable.code));
        arrayList.add(new Goods("Google","18$",R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Goods("Google","18$",R.drawable.computer));
        arrayList.add(new Goods("Google","18$",R.drawable.computer_engineer));
        arrayList.add(new Goods("Google","18$",R.drawable.computer_engineer_mens_sport));
        arrayList.add(new Goods("Google","18$",R.drawable.custom_tshirt_1));




        adt = new CustomGoodsAdapter(this, R.layout.item_listview, arrayList);
        lvGoods.setAdapter(adt);

    }
}