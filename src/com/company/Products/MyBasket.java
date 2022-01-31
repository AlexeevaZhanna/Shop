package com.company.Products;

import com.company.Basket;

import java.util.Collection;

public class MyBasket implements Basket {


    Chicken chicken = new Chicken("Петелинка", 0.850, 200, "31.12.2021", 20);

    public void chicken() {
        int count = chicken.take(1);
        while (count < 5) {
            System.out.println(count);
            count++;
        }

        do {
            count++;
        } while (count < chicken.getTotal());
        System.out.println("Всего можно взять: " + count);
        //do-while


        for (count = 1; count <= 20; count++) {
            System.out.println(count);
        }

        chicken.setDescription("Петелинка", "31.12.2021");
        chicken.cut();
        chicken.pack();

        chicken.setPrice(); //в классе Chicken,цена >=300, иначе "акция", if - else
    }

    Cheese maasdam = new Cheese("Маасдам", 0.200, 250, "01.31.2021", 45);

    public void maasdam() {
        maasdam.setDescription("Маасдам", "01.31.2021");

        maasdam.cut();
        maasdam.pack();
        maasdam.setPrice(200); // в классе Cheese цена >= 200,иначе "Акция", if- else
    }

    Meat chickenWing = new Chicken("Куриные крылья");

    public void chickenWing() {
        chickenWing.setDescription("Куриные крылья");
    }



    Collection<Product> myAllProducts = Basket.getCollectionProducts();

    public void myBasket(){

       myAllProducts.add(chicken);
       myAllProducts.add(maasdam);
       myAllProducts.add(new Meat("Говяжья вырезка"));
       myAllProducts.add(new Cheese("Сырная нарезка"));
       myAllProducts.add(new Cheese("Российский сыр"));
       for (Product p : myAllProducts) {
           System.out.println("В корзину добавлено:" + p.getName());
       }
}
   }

