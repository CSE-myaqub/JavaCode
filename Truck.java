//Muhammad Yaqub
public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;
    public Truck() {
        super();
        loadCapacity = 0.0;
        towingCapacity = 0.0;
    }
    public Truck(String manufacturerName, int numberOfCylinders, String ownersName,
                 double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownersName);
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }
    public double getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0.0) {
            this.loadCapacity = loadCapacity;
        } else {
            this.loadCapacity = 0.0;
        }
    }
    public double getTowingCapacity() {
        return towingCapacity;
    }
    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0.0) {
            this.towingCapacity = towingCapacity;
        } else {
            this.towingCapacity = 0.0;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Truck))
            return false;
        Truck other = (Truck) obj;
        return Double.compare(this.loadCapacity, other.loadCapacity) == 0
                && Double.compare(this.towingCapacity, other.towingCapacity) == 0;
    }
    //toString overrides Vehicle.toString and adds load/towing info
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Load Capacity: ").append(String.format("%.1f", loadCapacity)).append("\n");
        sb.append("Towing Capacity: ").append(String.format("%.1f", towingCapacity));
        return sb.toString();
    }
}