//Muhammad Yaqub
public class CargoShip extends Ship {
    private int tonnage;
    private double maxSpeed;
    public CargoShip() {
        super();
        tonnage = 0;
        maxSpeed = 0.0;
    }
    //constructor that sets name, launch date, tonnage, and maxSpeed
    public CargoShip(String name, String launchDate, int tonnage, double maxSpeed) {
        super(name, launchDate);
        setTonnage(tonnage);
        setMaxSpeed(maxSpeed);
    }
    public int getTonnage() {
        return tonnage;
    }
    public void setTonnage(int tonnage) {
        if (tonnage < 0) {
            this.tonnage = 0;
        } else {
            this.tonnage = tonnage;
        }
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed < 0.0) {
            this.maxSpeed = 0.0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Tonnage: ").append(tonnage).append(" DWT").append("\n");
        sb.append("Maximum Speed: ").append(maxSpeed).append(" mph");
        return sb.toString();
    }
}
