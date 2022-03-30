package com.company.Shop;

public class Name implements Cloneable {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Name(String name) {
        this.name = name;
    }

    @Override
    protected Name clone() {
        return new Name(name);
        }



}
