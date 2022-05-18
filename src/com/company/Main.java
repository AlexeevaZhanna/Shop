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
        Cheese maasdam = new Cheese("Маасдам", 0.200, 250, "01.31.2021", 45);
        Chicken chicken = new Chicken("Петелинка", 0.850, 200, "31.12.2021", 20);
        Sklad skladChicken = new Sklad(chicken);
        Sklad skladMaasdam = new Sklad(maasdam);
        Consumer consumer1 = new Consumer(chicken);
        Consumer consumer2 = new Consumer(maasdam);
        new Thread(skladChicken).start();
        new Thread(consumer1).start();
        new Thread(skladMaasdam).start();
        new Thread(consumer2).start();
    }
}