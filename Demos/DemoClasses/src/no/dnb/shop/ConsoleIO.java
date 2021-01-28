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

    // ANDY: You shouldn't implement these methods - the Scanner is meant to be internal. If you really need to implement, they should be static
    /* Not much fun getting intelliJ to make getters and setters of this class .
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     */
}
