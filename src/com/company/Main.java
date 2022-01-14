package com.company;

import com.company.Product.*;

public class Main {

    public static void main(String[] args) {
        Shop lenta = new Shop();
        System.out.println(lenta.getName());
        lenta.setWork();

        Chiken all = new Chiken(lenta);
        all.free();

        Chiken chiken = new Chiken("Петелинка", 0.850, 200, "31.12.2021",20);
        int count = chiken.take(1);
       while (count < 5) {                            //берем курицу, добавляем в корзину по 1, если надо 4 упаковки,
           System.out.println(count);                // while
           count++;
       }

       do { count++;
       } while (count < chiken.getTotal());
        System.out.println("Всего можно взять: " + count);  //можно взять не более доступного количества курицы,
                                                               //do-while



        for (count = 1; count<=20; count++) {
            System.out.println(count);  // все доступные упаковки, for
        }

       chiken.setDescription("Петелинка", "31.12.2021");
        chiken.cut();
        chiken.pack();

        chiken.setPrice(); //в классе Chiken,цена >=300, иначе "акция", if - else

        Cheese maasdam = new Cheese("Маасдам", 0.200,250, "01.31.2021", 45);
        maasdam.setDescription("Маасдам","01.31.2021");

        maasdam.cut();
        maasdam.pack();
        maasdam.setPrice(); // в классе Cheese цена >= 200,иначе "Акция", if- else

        Meat chikenWing = new Chiken("Куриные крылья");
        chikenWing.setDescription("Куриные крылья");
        Product milk1= new Milk();
        milk1.setDescription("Простоквашино");

// write your code here
    }
}
