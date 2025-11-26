//Muhammad Yaqub
public class Car extends Vehicle {
    private double gasMileage;
    private int numberOfPassengers;
    public Car() {
        super();
        gasMileage = 0.0;
        numberOfPassengers = 0;
    }
    public Car(String manufacturerName, int numberOfCylinders, String ownersName,
               double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownersName);
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }
    //Accessor for gas mileage
    public double getGasMileage() {
        return gasMileage;
    }
    //Mutator for gas mileage
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0.0) {
            this.gasMileage = gasMileage;
        } else {
            this.gasMileage = 0.0;
        }
    }
    //Accessor for number of passengers
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    // Mutator for number of passengers
    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            this.numberOfPassengers = 0;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Car))
            return false;
        Car other = (Car) obj;
        return Double.compare(this.gasMileage, other.gasMileage) == 0
                && this.numberOfPassengers == other.numberOfPassengers;
    }
    // toString overrides Vehicle.toString and adds gas mileage and passenger count
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Gas Mileage: ").append(String.format("%.1f", gasMileage)).append(" gallons").append("\n");
        sb.append("Number of Passengers: ").append(numberOfPassengers);
        return sb.toString();
    }
}