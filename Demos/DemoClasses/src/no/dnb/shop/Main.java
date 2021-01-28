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

        Product jeans = new Product("Levis", "Casual jeans", 100, 2);
        Product shirt = new Product("Turnbull & Asser", "Tailored Fit", 1000, 97);

        System.out.println(jeans.inStock());
        System.out.println(jeans.getSalesTax());
        System.out.println(jeans.getGrossPrice());
        System.out.println(jeans.checkStockLevelAndMaybeReorder());
        jeans.unitAvailable();
        System.out.println(jeans.inStock());


        //testing static methods - getInt and getText

        int number1 = ConsoleIO.getInt("Heltall takk!");
        String txt = ConsoleIO.getText("String please?");


    }

}
