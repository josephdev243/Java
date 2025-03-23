package Ticketpricing;

import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get valid number of tickets
        int numberOfTickets;
        while (true) {
            System.out.print("Enter the number of tickets: ");
            numberOfTickets = input.nextInt();
            if (numberOfTickets > 0) {
                break;
            } else {
                System.out.println("Invalid. Number of tickets must be positive.");
            }
        }

        // Get valid age
        int age;
        while (true) {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            if (age >= 0) {
                break;
            } else {
                System.out.println("Invalid. Age must be positive.");
            }
        }

        // Get membership status
        System.out.print("Do you belong to the group? (yes/no) ");
        String membership = input.next().trim().toLowerCase();

        int ticketPrice;
        if (age <= 12) {
            ticketPrice = membership.equals("yes") ? 5 : 7;
        } else if (age <= 17) {
            ticketPrice = membership.equals("yes") ? 8 : 10;
        } else if (age <= 59) {
            ticketPrice = membership.equals("yes") ? 12 : 15;
        } else {
            ticketPrice = membership.equals("yes") ? 6 : 8;
        }


        double totalCost = ticketPrice * numberOfTickets;


        if (numberOfTickets >= 5) {
            totalCost -= 3 * numberOfTickets;
        }


        System.out.println("\n--- Ticket Details ---");
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Age: " + age);
        System.out.println("Membership: " + (membership.equals("yes") ? "Yes" : "No"));
        System.out.println("Ticket price per ticket: $" + ticketPrice);
        System.out.println("Total Cost for " + numberOfTickets + " tickets is: $" + totalCost);

        input.close(); // Close scanner to prevent resource leak
    }
}
