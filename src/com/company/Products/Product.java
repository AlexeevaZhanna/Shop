package com.company.Products;

public abstract class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Product(String name) {

        this.name = name;
    }


    public Product() {
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


