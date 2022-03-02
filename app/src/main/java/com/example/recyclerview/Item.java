package com.example.recyclerview;

public class Item {
    int filename;
    String itemName;
    float itemPrice;
    String Descr;

    public Item(int filename, String itemName, float itemPrice, String descr) {
        this.filename = filename;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        Descr = descr;
    }

    public int getFilename() {
        return filename;
    }

    public void setFilename(int filename) {
        this.filename = filename;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getDescr() {
        return Descr;
    }

    public void setDescr(String descr) {
        Descr = descr;
    }
}
