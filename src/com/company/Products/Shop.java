package com.company.Products;

public  class Shop {
    private String name;
    private String address;
    private String work;


    public Shop(String name, String address, String work) {
        this.name = name;
        this.address = address;
        this.work = work;
    }
    public  Shop(){

    }


    public String getName() {
        return "Лента";
    }

    public String getAddress() {
        return "Город, улица";
    }

    public void setWork() {
        this.work = "8 - 24";
        System.out.println("Магазин открыт: " + work);
    }
}
