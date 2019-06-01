package com.example.myapplication;

public class Shopitem {
    private String Name;
    private String Price;
    private String Discription;

    public Shopitem() {

    }

    public Shopitem(String name, String price, String discription) {
        Name = name;
        Price = price;
        Discription = discription;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }
}
