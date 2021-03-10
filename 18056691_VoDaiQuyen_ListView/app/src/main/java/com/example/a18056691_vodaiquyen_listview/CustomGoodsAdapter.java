package com.example.a18056691_vodaiquyen_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter  {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvTen= view.findViewById(R.id.tvTen);
        TextView tvTien = view.findViewById(R.id.tvTien);
        ImageView imgGoods = view.findViewById(R.id.imgGoods);
        //
        tvTen.setText(arrayList.get(i).getName());
        tvTien.setText(arrayList.get(i).getShopName());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }
}
