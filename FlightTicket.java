package apr24.a2z1g6;

public class FlightTicket extends Ticket {
    String flightNo;
    String destination;
    
    public FlightTicket(String ticketNo, String flightNo, String destination, double price){
        super(ticketNo, price);
        this.flightNo = flightNo;
        this.destination = destination;
    }
    
    @Override
    public String toString(){
        return  "\n------------------------------\n"
                + "Flight Ticket\n"
                + "------------------------------\n"
                + "Flight No: " + flightNo + "\n"
                + "Destination: " + destination + "\n"
                + super.toString()+ "\n"
                + "------------------------------" ;
    }
    
    public void display(){
        System.out.println(this);
    }

}
