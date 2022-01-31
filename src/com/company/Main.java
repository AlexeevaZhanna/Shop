package com.company;

import com.company.Products.*;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Shop lenta = new Shop();
        System.out.println(lenta.getName());
        lenta.setWork();

        Chicken all = new Chicken(lenta);
        all.free();


        // В классе Корзина создала коллекцию. Пример использования Интерфейса коллекций.
        // Добавила продукты в "моя корзина" MyBasket:
MyBasket today = new MyBasket();
       today.myBasket();
// write your code here
    }


}
