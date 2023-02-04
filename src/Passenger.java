public class Passenger{
    private String name;
    private int pesel;
    private double weight;
    private Luggage luggage;

    public Passenger(String name, int pesel, double weight){
        this.name = name;
        this.pesel = pesel;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "imię: "+name + " pesel: " + pesel + " waga: " + weight +" kg";
    }
}
