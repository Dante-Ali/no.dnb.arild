package no.dnb.shop;
/*
Define a Product class
 - description
 - category
 - netPrice
 - unitsInStock
 - stockReorderThreshold
Functionality:
 - inStock() - done
 - getSalesTax() - done
 - getGrossPrice() - done
 - checkStockLevelAndMaybeReorder()
 - unitsSold () NEW - done

Define a simple Main class to test your Product code

 */
    public class Product {

        //Starting with properties of object
        private String nameOfProduct; //desription
        private String category;
        private double netPrice;
        private int unitsInStock;
        private int stockReorderThreshold;

        private boolean inStock;


        //constructor of product - add more attributes later
        public Product(String a, String b, int c, int d, int e){

            nameOfProduct = a;
            category = b;
            netPrice = c;
            unitsInStock = d;
            stockReorderThreshold = e;
            // To test:
            System.out.println("product initialized");

        }
        // follow Andy's template - getters and setters
        public double getGrossPrice() {
            return netPrice * getSalesTax();
        }

        public double getSalesTax() {
            // Set to 1.25 to simplify arithmeitc (ohh!)
            // Could also be considered the amount of tax based on price
            return 1.25;
        }

        public double getNetPrice() {
            return netPrice;
        }

    //see if item in stock
        public boolean inStock() {
            return unitsInStock > 0;
        }

        //Instance methods

        //sell a product
        public int unitSold() {
            if (unitsInStock > 0) {
                unitsInStock--;
                return 1;
            } else {
                System.out.printf("You are out of %s \n", nameOfProduct);
                return 0;
            }
        }



        public int checkStockLevelAndMaybeReorder() {
            // Increases stock by ordering 5 more if,  stocklevel is below 3
            // todo - change to input parameters later
            if (unitsInStock < 3) {
                unitsInStock = unitsInStock + 5;
                System.out.println("Five new items reordered, you now have:" + unitsInStock);
            } else {
                System.out.println("You don't need to reorder. Your stock is: " + unitsInStock);
            }
            return 0; //hmm?
        }


/*
        public String toString(){
            return String.format("%s, in category %s, available? %s", nameOfProduct, category, isAvailable);
        }

 */
    }

