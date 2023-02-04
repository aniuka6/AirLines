public class Plane {

//    private double MaxAircraftPayload;
//    private int MaxAircraftSeat;

    private static final double MAX_AIRCRAFT_PAYLOAD = 800;
    private static final int MAX_AIRCRAFT_SEAT = 20;
    private String namePlane;

    private Passenger[] passengers = new Passenger[20];
    private int passengerNumber;
    private double onePassangerWeight;
    private double passengersWeight;

    private Luggage[] luggages = new Luggage[passengerNumber];

    public void addPassanger(Passenger passenger, Luggage luggage) {
        if ((passengerNumber < MAX_AIRCRAFT_SEAT) && ((passengersWeight + passenger.getWeight() + luggage.getLuggageWeight()) < MAX_AIRCRAFT_PAYLOAD) &&
                (passenger.getPesel().length() == 11)) {
            passengers[passengerNumber] = passenger;
            System.out.println("Dodano pasażera" + passenger.getName());
            passengerNumber++;
            passengersWeight = (passengersWeight + passenger.getWeight() + luggage.getLuggageWeight());
        } else {
            System.out.println("nie dodano pasażera: " + passenger.getName());

        }
    }
        public Passenger[] getPassengers() {
            Passenger[] pass = new Passenger[passengerNumber];
            for (int i = 0; i < passengerNumber; i++) {
                pass[i] = passengers[i];
            }
            return pass;
        }
    }

