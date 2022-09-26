package oops;
public class Flight {

    private int flightNumber;
    private String departure;
    private String destination;
    private String date;
    private String time;
    private int capacity;
    private double originalprice;
    private int Seatchart[][];

    public Flight(int flightnumber, String departure, String destination, String date, String time, int capacity, double originalprice, int Seatchart[][]) {

        this.flightNumber = flightnumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.capacity = capacity;
        this.originalprice = originalprice;
        this.Seatchart = Seatchart;
    }

    public double getPrice() {
        return originalprice;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int[][] getSeatchart() {
        return Seatchart;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setPrice(double originalprice) {
        this.originalprice = originalprice;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightnumber) {
        this.flightNumber = flightnumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSeatchart(int Seatchart[][]) {
        this.Seatchart = Seatchart;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String toString() {
        String one = "Flight " + flightNumber+", Departure: " + departure + " Destination: " + destination;
        String two = ", Date: " + date + " Time: " + time;
        String three = ", Original Price: " + originalprice + "Rupees";
        return one + two + three;
    }

}

