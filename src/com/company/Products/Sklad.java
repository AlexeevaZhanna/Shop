package com.company.Products;

public class Sklad implements Runnable{
    Product product;

    public Sklad(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            product.put();
        }

    }
}