package com.jieun.springrecipes.shop;

public class Disc extends Product {
    private int capacity;

    public Disc(){
        super();
    }

    public Disc(String name, double price){
        super(name, price);
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}