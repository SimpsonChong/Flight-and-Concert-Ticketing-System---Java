package apr24.a2z1g6;

public class ConcertTicket extends Ticket {
    String ticketType;
    String concertName;

    public ConcertTicket(String ticketNo, String ticketType, String concertName, double price) {
        super(ticketNo, price);
        this.ticketType = ticketType;
        this.concertName = concertName;
    }

    @Override
    public String toString() {
        return "\n--------------------------------------------------\n"
                + "Concert Ticket\n"
                + "--------------------------------------------------\n"
                + "Concert: " + concertName + "\n"
                + "Ticket type: " + ticketType + "\n"
                + super.toString() + "\n"
                + "--------------------------------------------------";
    }

    public void display() {
        System.out.println(this);
    }
}

