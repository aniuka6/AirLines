public class Airlines {

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.addPassanger(new Passenger("Anna", 566456, 34), new Luggage("koko", 75));
        plane.addPassanger(new Passenger("Tomasz", 85674, 310), new Luggage("szanel", 67));
        plane.addPassanger(new Passenger("Joanna", 6536537, 34), new Luggage("coc", 78));
        plane.addPassanger(new Passenger("Emanuel", 967854, 21), new Luggage("jambo", 75));
        plane.addPassanger(new Passenger("Józef", 235346, 53), new Luggage("yves", 700));
        plane.addPassanger(new Passenger("Wojciech", 9787465, 67), new Luggage("zara", 80));

        System.out.println("Lista pasażerów: ");
        for (Passenger p: plane.getPassengers()){
            System.out.println(p);
        }
    }

}
