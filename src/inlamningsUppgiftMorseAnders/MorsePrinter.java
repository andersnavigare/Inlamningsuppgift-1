package inlamningsUppgiftMorseAnders;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MorsePrinter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Morse morsa = new Morse();
        int choice;
        boolean running = true;

        while (running) {
            try {
                System.out.println("(1) for letters, (2) for morse-code");
                choice = scan.nextInt();
                scan.nextLine();
                morsa.processChoice(choice, scan);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again: ");
                scan.nextLine();
                continue;
            }
            System.out.println("Do you wanna continue? (Y) / (N)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                running = false;
            }

        }

    }

}



