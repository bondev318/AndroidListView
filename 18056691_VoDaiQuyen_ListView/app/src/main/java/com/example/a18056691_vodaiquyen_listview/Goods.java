package com.example.a18056691_vodaiquyen_listview;

public class Goods {
    private int imageGoods;
    private String name;
    private String shopName;

    public Goods(String name, String shopName, int imageGoods) {
        this.imageGoods = imageGoods;
        this.name = name;
        this.shopName = shopName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }
}
