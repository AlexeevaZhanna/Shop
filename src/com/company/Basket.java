package com.company;


import com.company.Products.Product;


import java.util.ArrayList;
import java.util.Collection;

public interface Basket {
     static Collection<Product> getCollectionProducts() {

        return new ArrayList<Product>();
    }


}
