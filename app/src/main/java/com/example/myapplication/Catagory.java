package com.example.myapplication;

public class Catagory {

    private String Catagory;
    private String Name;
    private String Price;
    private String Discription;

        public Catagory() {

        }

        public Catagory(String catagory, String name, String price, String discription) {
            this.Catagory = catagory;
            this.Name = name;
            this.Price = price;
            this.Discription = discription;
        }



        public String getCatagory() {
            return Catagory;
        }

        public void setCatagory(String catagory) {
            this.Catagory = catagory;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String price) {
            this.Price = price;
        }

        public String getDiscription() {
            return Discription;
        }

        public void setDiscription(String discription) {
            this.Discription = discription;
        }
    }

