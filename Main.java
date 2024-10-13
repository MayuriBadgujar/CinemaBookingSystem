import Entity.Cinema;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema();
        int choice;

        do {
            System.out.println("\nCinema Booking System");
            System.out.println("1. Show Available Seats");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Load Bookings from File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    cinema.showAvailableSeats();
                    break;
                case 2:
                    try {
                        System.out.print("Enter your name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter row (0 to 4): ");
                        int row = sc.nextInt();
                        System.out.print("Enter column (0 to 4): ");
                        int column = sc.nextInt();
                        cinema.bookTicket(name, row, column);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    cinema.loadBookings();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

                    System.out.println("Enter yes if you want to continue : ");
                    String input=sc.next();
            }
        } while (choice != 4);
       System.out.println("Thank you visit again!!");
        sc.close();
    }
}