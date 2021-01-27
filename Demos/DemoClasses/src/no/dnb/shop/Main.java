package no.dnb.shop;
/*Functionality :
        - inStock() - done
        - getSalesTax() - done
        - getGrossPrice() - done
        - checkStockLevelAndMaybeReorder()
        - unitsSold () NEW - done
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("testing");

        Product jeans = new Product("Levis", "Casual jeans", 100, 2, 5);
        Product shirt = new Product("Turnbull & Asser", "Tailored Fit", 1000, 97, 10);

        System.out.println(jeans.inStock());
        System.out.println(jeans.getSalesTax());
        System.out.println(jeans.getGrossPrice());
        System.out.println(jeans.checkStockLevelAndMaybeReorder());
        jeans.unitSold();
        System.out.println(jeans.inStock());

    }

}
