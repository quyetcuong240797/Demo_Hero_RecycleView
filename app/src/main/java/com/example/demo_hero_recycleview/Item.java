package com.example.demo_hero_recycleview;

public class Item  {
    public String imgItem;
    public String nameItem;

    public Item(String imgItem, String nameItem) {
        this.imgItem = imgItem;
        this.nameItem = nameItem;
    }

    public String getImgItem() {
        return imgItem;
    }

    public void setImgItem(String imgItem) {
        this.imgItem = imgItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }
}
