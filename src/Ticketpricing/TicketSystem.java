package Ticketpricing;

import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int numberOfTickets = input.nextInt();

        int age;
        while (true) {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            if(age >= 0) {
                break;
            }
            else{
                System.out.println("Invalid. Age must be positive.");
            }
        }

        System.out.print("Do you belong to the group? (yes/no) ");
        String membership = input.next().toLowerCase();


        int ticketPrice = 0;

        if(age >= 0 && age <= 12) {
            ticketPrice = membership.equals("yes") ? 5 : 7;
        }
        else if (age >= 13 && age <= 17) {
            ticketPrice = membership.equals("yes") ? 8 : 10;
        }
        else if(age >= 18 && age <= 59) {
            ticketPrice = membership.equals("yes") ? 12 : 15;
        }else if(age >= 60) {
            ticketPrice = membership.equals("yes") ? 6 : 8;
        }


        if(numberOfTickets >= 5) {
            ticketPrice -= 3;
        }
        double totalCost = ticketPrice * numberOfTickets;

        System.out.println("NUmber of Tickets: " + numberOfTickets);
        System.out.println("Age: " + age);
        System.out.println("Membership: " + membership);
        System.out.println("Ticket price per ticket is: $" + ticketPrice);
        System.out.println("Total Cost for: " + numberOfTickets + "tickets are: $" + totalCost);

    }
}
