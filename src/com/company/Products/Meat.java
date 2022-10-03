package com.company.Products;


public class Meat extends Product  {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Meat(String name) {
        super(name);
        this.name = name;
    }

    public Meat() {
        super();
    }

    public void setDescription(String name) {
        this.name = name;
        System.out.println("Хранить в холодильнике");
    }

    public void pack() {
        System.out.println("Упаковать в пакет: " + name);
    }


}
