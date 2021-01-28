package no.dnb.shop;


// Updated class based on coursematerial 28.1.21
// + added use of final and static on variables, and use of "this.*"


    public class Product {

        //Starting with properties of object
        private String nameOfProduct; //desription
        private String category;
        private double netPrice;
        private int unitsInStock;
        private int stockReorderThreshold;
        private boolean inStock;

        //adds 28.1 + "global" variables
        private static int itemID = 200; // added item id - starting at random number
        private final static int REORDER_PER = 10;
        private final static double SALES_TAX = 25;
        private final static int REORDER_AMOUNT = 10; // TO-DO - make this a function of REORDER_PER later


        //adds 28.1 - Constructor overload
        public Product(String nameOfProduct, String category) {
            this(nameOfProduct, category, 100, 10);
        }


        //constructor of product - updated bad coding based on feedback 27.1 :-)
        public Product(String nameOfProduct, String category, int netPrice, int unitsInStock) {
            this.nameOfProduct = nameOfProduct;
            this.category = category;
            this.netPrice = netPrice;
            this.unitsInStock = unitsInStock;
            // To test:
            System.out.println("product initialized");

        }

        // follow Andy's template - getters and setters
        public double getGrossPrice() {
            return netPrice * getSalesTax();
        }

        public double getSalesTax() {
            // 28.1 - This function is replaces with an global constant.
            // Could also be considered the amount of tax based on price
            return SALES_TAX;
        }

        public double getNetPrice() {
            return this.netPrice;
        }

        //see if item in stock
        public boolean inStock() {
            return this.unitsInStock > 0;
        }

        //Instance methods

        //sell a product
        //28.1 Changed int unitSold to int unitAvaliable - could be replaced with an expression ..
        //This is now an alternative to the boolen function "inStock()".
        public boolean unitAvailable() {
            if (this.unitsInStock > 0) {
                this.unitsInStock--;
                return true;
            } else {
                System.out.printf("You are out of %s \n", this.nameOfProduct);
                return false;
            }
        }


        public int checkStockLevelAndMaybeReorder() {
            // Increases stock by ordering 5 more if,  stocklevel is below
            //28.1 - added global constants -keeping print and if statement for debug purposes.
            // todo - change to input parameters later
            if (this.unitsInStock < REORDER_PER) {
                this.unitsInStock += REORDER_AMOUNT;
                System.out.println("Five new items reordered, you now have:" + this.unitsInStock);
            } else {
                System.out.println("You don't need to reorder. Your stock is: " + this.unitsInStock);
            }
            return 0; //hmm?
        }

        public String toString() {
            return String.format("%s %.2f %d", this.nameOfProduct, this.getGrossPrice(), this.unitsInStock);


        }

    }