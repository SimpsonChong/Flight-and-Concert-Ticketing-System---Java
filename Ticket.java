package apr24.a2z1g6;

public abstract class Ticket {
    String ticketNo;
    double price;
    
    public Ticket(String ticketNo, double price){
        this.ticketNo = ticketNo;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket No.: " + ticketNo + "\nPrice: RM " + String.format("%.2f", price);
    }
    
    
}
