package com.company.Products;

public abstract class Product implements Buy{
    private String name;


    public Product(String name) {

        this.name = name;
    }

    public Product() {
    }

    public String getName() {

        return name;

    }
    public  int take (int p) {
        return p;

    }

    public static int put(int a) {
        return a;
    }

public static int result(int z) {
        return z;
}

    public void setDescription(String name) {
        this.name = name;
        System.out.println("Описание");
    }

    public abstract void pack();



}


