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


    /* Not much fun getting intelliJ to make getters and setters of this class .
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     */
}
