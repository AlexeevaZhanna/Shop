package com.company.Shop;

public  class Shop implements Cloneable {

    private Name nameShop ;
    private Address address;
    private String work;


    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = new Address(address);
    }




    public Name getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = new Name(nameShop);
    }

    public Shop(Name nameShop, Address address, String work) {
        this.nameShop = nameShop;
        this.address = address;
        this.work = work;
    }

    public Shop(Name nameShop) {
    }

        public void setWork() {
            this.work = "8 - 24";
            System.out.println("Магазин открыт: " + work);
        }

    public Shop clone() throws CloneNotSupportedException {
            return new Shop (nameShop.clone(),address.clone(), work);
        }

    public String toString() {
        return this.nameShop.getName() + " (" + this.address.getAddress() + "," +" время работы: " + this.work + ")";
    }

    }


