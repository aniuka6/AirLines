public class Luggage{
    private String brandName;
    private double luggageWeight;

    public Luggage(String brandName, double luggageWeight) {
        this.luggageWeight = luggageWeight;
        this.brandName = brandName;
    }
        public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(double luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    @Override
    public String toString() {
        return brandName + luggageWeight;
    }
}
