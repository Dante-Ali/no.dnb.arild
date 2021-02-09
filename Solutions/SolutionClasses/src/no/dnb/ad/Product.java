package no.dnb.ad;

public class Product {

    private String description;
    private double netPrice; //15.99 - > 1599

    private final int reorderThreshold; // not possible to change
    private int numberInStock = 0;
    private int reorderAmount;
    private boolean perishable;

    private final int reorderFactor = 10;
    private final double salesTax = 25;

    public Product(String description, double netPrice, int reorderThreshold, boolean perishable) {

        this.description = description;
        this.netPrice = netPrice;
        this.reorderThreshold = reorderThreshold;
        this.reorderAmount = reorderThreshold / reorderFactor;
        this.perishable = true;
    }
    public Product(String description, double netPrice) {

        this.description = description;
        this.netPrice = netPrice;
        this.reorderThreshold = 10;
        this.reorderAmount = 5;
        this.perishable = true;
    }
    public String getDescription() {
        return description;
    }

    public void reorderIfLowStock() {
        if (numberInStock < reorderThreshold) {
            numberInStock += reorderAmount;
        }

    }

    public double getSalesTax() {
        return (netPrice * salesTax) / 100; // percentage calculations
    }

    public double getSalesPrice() {
        return netPrice + getSalesTax();
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }
}
