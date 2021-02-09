package no.dnb.ad;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Coffe", 2.50, 5, true);
        Product p2 = new Product("Book 1 ", 8);

        System.out.println(p1.getSalesTax());
        System.out.println(p2.getSalesPrice());


    }
}
