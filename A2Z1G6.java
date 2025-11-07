package apr24.a2z1g6;
import java.util.ArrayList;
import java.util.Scanner;

public class A2Z1G6 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<FlightTicket> flightTickets = new ArrayList<>();
    static ArrayList<ConcertTicket> concertTickets = new ArrayList<>();
    static int flightTicketCounter = 1;
    static int concertTicketCounter = 1;
    
    public static void main(String[] args) {
        int mainselection;
        
        do {
            System.out.println("\nMain menu:");
            System.out.println("1. Sell ticket");
            System.out.println("2. Check sales");
            System.out.print("Enter selection number (0 to exit): ");
            mainselection = scanner.nextInt();

            switch (mainselection) {
                case 1:
                    sellTicket();
                    break;
                case 2:
                    showsales();
                    break;
                case 0:
                    System.out.println("\nThank you for using the system.");
                    break;
                default:
                    System.out.println("\nInvalid selection. Please try again.");
            }
        } while (mainselection != 0);
    }
    
    public static void sellTicket(){
        int ticketTypeSelection;
        
        do {
            System.out.println("\nTicket type:");
            System.out.println("1. Flight ticket");
            System.out.println("2. Concert ticket");
            System.out.print("Enter selection number (0 to quit ordering): ");
            ticketTypeSelection = scanner.nextInt();

            switch (ticketTypeSelection) {
                case 1:
                    sellFlightTicket();
                    break;
                case 2:
                    sellConcertTicket();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nInvalid selection. Please try again.");
            }
        } while (ticketTypeSelection != 0);
    }
    
    public static void sellFlightTicket(){
        String[] destinations ={"Langkawi", "Alor Star", "Ipoh", "Sultan Muhamad", "Melaka", "Senai", "Kuching", "Miri", "Kota Kinabalu"};
        double[] prices ={189.00, 139.00, 129.00, 139.00, 99.00, 159.00, 169.00, 199.00, 209.00};
        int destchoice;
        
        do{
            System.out.println("\nDestination selection:");
            for(int i = 0; i < destinations.length; i++){
                System.out.println((i + 1) + ". " + destinations[i] + " RM " + String.format("%.2f", prices[i]));
            }
            
            System.out.print("Enter selection (0 to cancel): ");
            destchoice=scanner.nextInt();
            
            if (destchoice > 0 && destchoice <= destinations.length){
                System.out.print("Enter flight no.: ");
                String flightNo = scanner.next();
                String ticketNo = flightNo + "-" + flightTicketCounter++;
                FlightTicket flightTicket = new FlightTicket(ticketNo, flightNo, destinations[destchoice - 1], prices[destchoice - 1]);
                flightTickets.add(flightTicket);
                flightTicket.display();
            }        
        }while (destchoice != 0);
    }
    
    public static void sellConcertTicket(){
        String[] ticketTypes = {"Adult 3 days pass", "Adult 1 day pass", "Kid 1 day pass"};
        double[] prices = {638.00, 288.00, 88.00};
        int ticketChoice;
        
        do {
            System.out.println("\nTicket selection:");
            for (int i = 0; i < ticketTypes.length; i++) {
                System.out.println((i + 1) + ". " + ticketTypes[i] + " RM " + String.format("%.2f", prices[i]));
            }
            
            System.out.print("Enter selection (0 to cancel): ");
            ticketChoice = scanner.nextInt();
            
            if (ticketChoice > 0 && ticketChoice <= ticketTypes.length) {
                String ticketNo = "C" + concertTicketCounter++;
                ConcertTicket concertTicket = new ConcertTicket(ticketNo, ticketTypes[ticketChoice - 1], "Rainforest World Music Festival 2024", prices[ticketChoice - 1]);
                concertTickets.add(concertTicket);
                concertTicket.display();
            }
        } while (ticketChoice != 0);
    }
    
    public static void showsales(){
        System.out.println("\nFlight tickes:");
        System.out.println("--------------------------------------------------");
        System.out.println("Flight No   Ticket No   Destination        Price");
        double flightTotal = 0;
        
        for(FlightTicket ticket : flightTickets){
            System.out.printf("%-11s %-11s %-18s %.2f%n", ticket.flightNo, ticket.ticketNo, ticket.destination, ticket.price);
            flightTotal += ticket.price;
        }
        
        System.out.println("--------------------------------------------------");
        System.out.printf("Total %36s %.2f%n", "", flightTotal);
        System.out.println("==================================================");
        
        System.out.println("\nRainforest World Music Festival 2024 Convert tickets:");
        System.out.println("----------------------------------------");
        System.out.println("Ticket Type         Ticket No   Price");
        double concertTotal = 0;
        
        for (ConcertTicket ticket : concertTickets){
            System.out.printf("%-19s %-11s %.2f%n", ticket.ticketType, ticket.ticketNo, ticket.price);
            concertTotal += ticket.price;
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("Total %25s %.2f%n", "", concertTotal);
        System.out.println("========================================");
    }
}

    
