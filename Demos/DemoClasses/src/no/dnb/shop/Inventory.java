package no.dnb.shop;

import java.util.ArrayList;


/* Online Retailer
---------------
Define a Product class
 - description
 - category
 - netPrice
 - unitsInStock
 - stockReorderThreshold
Functionality:
 - inStock()
 - getSalesTax()
 - getGrossPrice()
 - checkStockLevelAndMaybeReorder()
 - ???

Define a simple Main class to test your Product code

 */


public class Inventory {

    private ArrayList<Product> products = new ArrayList<Product>();

    public void addInventory(Product aProduct)
    {
        products.add(aProduct);
    }

    public int getNumberOfItemsInInventory() {
        return products.size();
    }
/*
    public boolean containsInventoru(String inventoryToSearchFor) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.nameOfProduct().equals(inventoryToSearchFor)) {
                return true;
            }
        }
        return false;
    }
public class Inventory {

    private ArrayList<Product> products = new ArrayList<Product>();

    public void addInventory(Product aProduct)
    {
        products.add(aProduct);
    }

    public int getNumberOfItemsInInventory() {
        return products.size();
    }

    public boolean containsInventory(String inventoryToSearchFor) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getTitle().equals(inventoryToSearchFor)) {
                return true;
            }
        }
        return false;
    }
}
 */
}