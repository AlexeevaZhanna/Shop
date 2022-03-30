package com.company.Shop;

public class Address implements Cloneable {
    private String address;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Address(String address) {
        this.address = address;
    }
    @Override
    protected Address clone() throws CloneNotSupportedException {
        return new Address(address);
}

}
