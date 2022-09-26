package oops;
public class Passenger {

    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String telephoneNumber;
    private int flightNumber;
    private int SeatNumber;
    private int ReservationNumber;

    public Passenger(String firstName, String lastName, String street, String city, String telephoneNumber, int flightNumber, int SeatNumber, int ReservationNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.telephoneNumber = telephoneNumber;
        this.flightNumber = flightNumber;
        this.SeatNumber = SeatNumber;
        this.ReservationNumber = ReservationNumber;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setflightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(int SeatNumber) {
        this.SeatNumber = SeatNumber;
    }

    public void setReservationNumber(int ReservationNumber) {
        this.ReservationNumber = ReservationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getflightNumber() {
        return flightNumber;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }


    public int getReservationNumber() {
        return ReservationNumber;
    }

    public String toString() {

        String one =  "NAME : "+firstName+" "+lastName+" ";
        String two = "Address : "+street+" "+city+" ";
        String three = "Original Price: " + telephoneNumber + "Seat Number: "+SeatNumber;
        String four = "Reservation Number: "+ReservationNumber+" ";
        return four + one + two + three;
    }


}


