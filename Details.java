package oops;
import java.util.*;

class Details {

    List<Flight> flights;
    List<Passenger> passenger;

    public Details(){

        flights = new ArrayList<Flight>();
        passenger = new ArrayList<Passenger>();

    }

    public void Creatingflights(){

        int flightnumber, capacity;
        double originalprice;
        String departure, destination, date, time;

        int[][] Seatchart = { { 1, 2, 3}, { 4, 5, 6 }, {7, 8, 9} };

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter flight Number");
        flightnumber = scan1.nextInt();

        System.out.println("Enter flight capacity");
        capacity = scan1.nextInt();

        System.out.println("Enter original price of ticket");
        originalprice= scan1.nextDouble();

        System.out.println("Enter flight origin");
        departure = scan2.nextLine();

        System.out.println("Enter flight destination");
        destination = scan2.nextLine();

        System.out.println("Enter flight date");
        date = scan2.nextLine();

        System.out.println("Enter flight time");
        time = scan2.nextLine();

        Flight F = new Flight(flightnumber, departure, destination, date, time, capacity, originalprice, Seatchart);
        flights.add(F);
        System.out.println("The following flight has been created:");
        System.out.println(F);

    }

    public void Availableflights(String departure, String destination) {

        boolean a = true;
        String b, c;
        int size = flights.size();

        for (int i = 0; i < size; i++) {
            int seat = flights.get(i).getCapacity();

            b = flights.get(i).getDeparture();

            c = flights.get(i).getDestination();

            if ((b.equals(departure) == true) && (c.equals(destination) == true) && seat>0) {
                if (a == true) {
                    System.out.println("List of available flights:");
                    a = false;
                }
                System.out.println(flights.get(i));

            }
        }
        if (a == true) {
            System.out.println("no available flights");
        }

    }

    public int getflightindex(int flightnumber){

        int size = flights.size();
        int index = 0;

        for (int i = 0; i < size; i++)
        {
            if (flights.get(i).getFlightNumber() == flightnumber) {

                index = i;
                break;
            }
        }

        return index;
    }

    public void Creatingticket(int flightNumber, int SeatNumber){

        String firstName, lastName, street, city, telephoneNumber;

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter first Name");
        firstName = scan1.nextLine();

        System.out.println("Enter lastName");
        lastName = scan1.nextLine();

        System.out.println("Enter street");
        street= scan1.nextLine();

        System.out.println("Enter city");
        city = scan1.nextLine();

        System.out.println("Enter Telephone Number");
        telephoneNumber = scan1.nextLine();

        Random rnd = new Random();
        int ReservationNumber = rnd.nextInt();

        Passenger P = new Passenger(firstName, lastName, street, city, telephoneNumber, flightNumber, SeatNumber, ReservationNumber);
        passenger.add(P);

    }

    public void PrintingDetails(int flightnumber){

        int index = getflightindex(flightnumber);

        int x = passenger.size();

        System.out.println(flights.get(index));
        System.out.println(passenger.get(x-1));

    }

    public void Seat(int flightnumber){

        int index = getflightindex(flightnumber);

        int[][] arr = flights.get(index).getSeatchart();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public void BookSeat(int flightnumber, int SeatNumber){

        int index = getflightindex(flightnumber);
        int capacity = flights.get(index).getCapacity();

        int[][] array = flights.get(index).getSeatchart();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(array[i][j] == SeatNumber){
                    array[i][j] = 0;
                    break;

                }
            }
        }

        flights.get(index).setSeatchart(array);
        flights.get(index).setCapacity(capacity-1);

    }

    public void Cancellation(int flightnumber, int SeatNumber){

        int index = getflightindex(flightnumber);

        int psize = passenger.size();
        int iindex = 0;

        for (int i = 0; i < psize; i++)
        {
            if (passenger.get(i).getSeatNumber() == SeatNumber) {

                iindex = i;
                break;
            }
        }

        System.out.println(flights.get(index));
        System.out.println(passenger.get(iindex));

        Scanner scan = new Scanner(System.in);
        System.out.println(" Do you want to cancel reservation? ");
        System.out.println("Enter 1 to cancel");
        int a = scan.nextInt();

        if( a == 1){
            passenger.remove(iindex);
        }
    }

}
