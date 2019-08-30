package com.example.materialtest;

public class Fruit {
    private String name;
    private  int iamgeid;
    public Fruit(String name,int iamgeid){
        this.iamgeid=iamgeid;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getIamgeid() {
        return iamgeid;
    }
}
