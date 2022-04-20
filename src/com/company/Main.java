package com.company;

import com.company.Products.*;
import com.company.Shop.Address;
import com.company.Shop.Name;
import com.company.Shop.Shop;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Shop lenta = new Shop(new Name("Лента.Москва"), new Address("Москва, улица, дом"), "8-24");
        System.out.println(lenta);

         Shop lentaEkb = lenta.clone();             // клонирование, создание однотипных магазинов
        lentaEkb.setNameShop("Лента.Екатеринбург");
        lentaEkb.setAddress("Екатеринбург, улица, дом");
        System.out.println(lentaEkb);
        lenta.setWork();


        for (int i = 1; i < 20; i ++) {                                 //потоки покупки и отгрузки товаров работают
            new BuyThread("Товар с номером: "+ i).start();       // параллельно друг другу

        }


       /* MyBasket today = new MyBasket();
        today.myBasket();

        today.searchInBasket("Конфеты");
        today.searchInBasket("Маасдам");
        today.searchInBasket("Колбаса"); */
    }}