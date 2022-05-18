package com.company.Products;

public class Consumer implements Runnable {
    Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i--) {
            product.get();
        }

        }
}
