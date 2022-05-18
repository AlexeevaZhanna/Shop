package com.company.Products;

public class Cheese  extends Product {
    private String name;
    private   double size;
    private int price;
    private String shelfLife;
    private int total;


    public String getName(String name) {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
        if (price >= 200) {
            System.out.println(price + " рублей");
        } else {
            System.out.println("Акция: " + price + " рублей");
        }
    }

    public int getTotal() {
        return total;
    }
        public void setTotal(int total) {
        this.total = total;
    }


    public void setSize(double size) {
        this.size = size;
    }

    public Cheese(String name, double size, int price, String shelfLife, int total) {
        super(name);
        this.name = name;
        this.size = size;
        this.price = price;
        this.shelfLife = shelfLife;
        this.total = total;
    }
    public Cheese(String name){
        super(name);
        this.name = name;
    }
    public Cheese(){
     super();
    }

    public void setDescription(String name, String shelfLife) {
        this.name = name;
        this.shelfLife = shelfLife;
        System.out.println(name + " хранить в холодильнике до: " + shelfLife + "," + " готово к употреблению");
    }


    public String getShelfLife() {
        return shelfLife; }



    public void cut() {
        System.out.println("Нарезaть: " + name);
    }
    public void pack() {
        System.out.println("Упаковать в пленку: " + name);
           }

    }
