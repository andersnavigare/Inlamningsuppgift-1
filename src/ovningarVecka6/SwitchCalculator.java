package ovningarVecka6;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Välj 1: Addition");
        System.out.println("Välj 2: Subtraktion");
        System.out.println("Välj 3: Multiplikation");
        System.out.println("Välj 4: Division");

        int choice = Integer.parseInt(scan.nextLine());
        int tal1;
        int tal2;

        switch (choice) {
            case 1:
                System.out.println("Addition: Skriv in ditt första nummer:");
                tal1 = Integer.parseInt(scan.nextLine());
                System.out.println("Skriv in ditt andra nummer:");
                tal2 = Integer.parseInt(scan.nextLine());
                System.out.println("Summan av dessa blev: " + (tal1 + tal2));
                break;

            case 2:
                System.out.println("Subtraktion: Skriv in ditt första nummer:");
                tal1 = Integer.parseInt(scan.nextLine());
                System.out.println("Skriv in ditt andra nummer:");
                tal2 = Integer.parseInt(scan.nextLine());
                System.out.println("Summan av dessa blev: " + (tal1 - tal2));
                break;

            case 3:
                System.out.println("Multiplikation: Skriv in ditt första nummer:");
                tal1 = Integer.parseInt(scan.nextLine());
                System.out.println("Skriv in ditt andra nummer:");
                tal2 = Integer.parseInt(scan.nextLine());
                System.out.println("Summan av dessa blev: " + (tal1 * tal2));
                break;

            case 4:
                System.out.println("Division: Skriv in ditt första nummer:");
                tal1 = Integer.parseInt(scan.nextLine());
                System.out.println("Skriv in ditt andra nummer:");
                tal2 = Integer.parseInt(scan.nextLine());
                System.out.println("Summan av dessa blev: " + (tal1 / tal2));
                break;


        }

    }
}

// Skapa en enkel kalkylator som tar emot två tal och en operation (addition, subtraktion, multiplikation, division)
// från användaren. Använd en switch-sats för att bestämma vilken operation som ska utföras baserat på användarens input.

