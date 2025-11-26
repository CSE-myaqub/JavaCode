//Muhammad Yaqub
public class Concert {
	//stores concert details and ticket info
    private String bandName;
    private int capacity;
    private double priceByPhone;
    private double priceAtVenue;
    private int ticketsSoldByPhone;
    private int ticketsSoldAtVenue;
    //default constructor that sets the starting values
    public Concert() {
        bandName = "none";
        capacity = 100;
        priceByPhone = 0.0;
        priceAtVenue = 0.0;
        ticketsSoldByPhone = 0;
        ticketsSoldAtVenue = 0;
    }
    //constructor that sets all the variables using the entered values
    public Concert(String name, int cap, double pByPhone, double pAtVenue) {
        bandName = (name == null || name.isEmpty()) ? "none" : name;
        capacity = (cap >= 0) ? cap : 0;
        priceByPhone = (pByPhone >= 0.0) ? pByPhone : 0.0;
        priceAtVenue = (pAtVenue >= 0.0) ? pAtVenue : 0.0;
        ticketsSoldByPhone = 0;
        ticketsSoldAtVenue = 0;
    }
    public String getBandName() {
        return bandName;
    }
    public void setBandName(String name) {
        bandName = (name == null || name.isEmpty()) ? "none" : name;
    }
    public int getNumTicketsSoldByPhone() {
        return ticketsSoldByPhone;
    }
    public int getNumTicketsSoldAtVenue() {
        return ticketsSoldAtVenue;
    }
    public void setPriceByPhone(double price) {
        if (price >= 0.0) priceByPhone = price;
    }
    public void setPriceAtVenue(double price) {
        if (price >= 0.0) priceAtVenue = price;
    }
    public void buyTicketsByPhone(int number) {
        if (number <= 0) return;
        int remaining = ticketsRemaining();
        if (remaining == 0) {
            System.out.println("The concert is sold out!");
            return;
        }
        if (number <= remaining) {
            ticketsSoldByPhone += number;
            if (ticketsRemaining() == 0) System.out.println("The concert is sold out!");
        } else {
            System.out.println("The concert is sold out!");
        }
    }
    public void buyTicketsAtVenue(int number) {
        if (number <= 0) return;
        int remaining = ticketsRemaining();
        if (remaining == 0) {
            System.out.println("The concert is sold out!");
            return;
        }
        if (number <= remaining) {
            ticketsSoldAtVenue += number;
            if (ticketsRemaining() == 0) System.out.println("The concert is sold out!");
        } else {
            System.out.println("The concert is sold out!");
        }
    }
    public int ticketsRemaining() {
        int rem = capacity - (ticketsSoldByPhone + ticketsSoldAtVenue);
        return rem >= 0 ? rem : 0; //calculates how many tickets remain unsold
    }
    public int totalNumberOfTicketsSold() {
        return ticketsSoldByPhone + ticketsSoldAtVenue; //calculates total number of tickets sold
    }
    public void setCapacity(int newCapacity) { 
        if (newCapacity >= 0 && newCapacity >= totalNumberOfTicketsSold()) {
            capacity = newCapacity; //updates venue capacity if new capacity is valid
        }
    }
    public double totalSales() {
        return (ticketsSoldByPhone * priceByPhone) + (ticketsSoldAtVenue * priceAtVenue);
    }
}
