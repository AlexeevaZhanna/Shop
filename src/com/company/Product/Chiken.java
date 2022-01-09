package com.company.Product;

public class Chiken extends Meat {

    private  String name;
   private  double size;
   private int price;
   private String shelfLife;
   private int total;
    private Shop shop;

    public Chiken(String name, double size, int price, String shelfLife, int total) {
        super(name);
        this.name = name;
        this.size = size;
        this.price = price;
        this.shelfLife = shelfLife;
        this.total = total;
    }

    public  Chiken(String name){
        super();
    }
    public Chiken (){
    }
    public Chiken(Shop shop){
        this.shop = shop;
    }
    public String getName() {
        return name;

    }
    public void setSize() {
        this.size = size;
    }
    public String getShelfLife() {
        return shelfLife; }
    public int getTotal() {
        return total;
    }

    public void setDescription(String name, String shelfLife) {
        this.name = name;
        this.shelfLife = shelfLife;
        System.out.println(name + " хранить в холодильнике до: " + shelfLife + "," + " не готово к употреблению в сыром виде");
    }
    public void setPrice() {            //if - else
        this.price = price;
        if (price >= 300) {
            System.out.println(price + " рублей");
        } else {
            System.out.println("Акция: " + price + " рублей");
        }
    }
    public Shop getShop() {
        return shop;}

    public void cut() {
        System.out.println("Нарезaть: " + name);
    }
    public void pack(int z) {
        System.out.println("Упаковать в пакет: " + name);
    }
    public void free(){
        shop.setWork();
        System.out.println("Товары доступны к покупке");
    }



}
