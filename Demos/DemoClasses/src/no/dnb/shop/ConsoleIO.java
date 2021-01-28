package no.dnb.shop;

import java.util.Scanner;

//28.1 - static classes

public class ConsoleIO {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static String getText(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    // ANDY: You don't want these get/set methods anyway - you don't want to expose the Scanner to the outside world, it's just for internal usage inside this class.
    //       If you really did want to implement these methods, they should to be static.
    
    /* Not much fun getting intelliJ to make getters and setters of this class .
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     */
}
