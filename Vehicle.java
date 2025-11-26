//Muhammad Yaqub
public class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownersName;
    public Vehicle() {
        manufacturerName = "none";
        numberOfCylinders = 1;//minimum valid value
        ownersName = "none";
    }
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownersName) {
        setManufacturerName(manufacturerName);//validate and set manufacturer
        setNumberOfCylinders(numberOfCylinders);//validate and set cylinders
        setOwnersName(ownersName);//validate and set owners name
    }
    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        if (manufacturerName == null || manufacturerName.trim().isEmpty()) {
            this.manufacturerName = "none";
        } else {
            this.manufacturerName = manufacturerName.trim();
        }
    }
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            this.numberOfCylinders = 1;
        }
    }
    public String getOwnersName() {
        return ownersName;
    }
    public void setOwnersName(String ownersName) {
        if (ownersName == null || ownersName.trim().isEmpty()) {
            this.ownersName = "none";
        } else {
            this.ownersName = ownersName.trim();
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Vehicle))
            return false;
        Vehicle other = (Vehicle) obj;
        //Compare manufacturer, number of cylinders, and owners name
        return this.manufacturerName.equals(other.manufacturerName)
                && this.numberOfCylinders == other.numberOfCylinders
                && this.ownersName.equals(other.ownersName);
    }
    //toString returns manufacturers name, number of cylinders, and owners name
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer's Name: ").append(manufacturerName).append("\n");
        sb.append("Number Of Cylinders: ").append(numberOfCylinders).append("\n");
        sb.append("Owner's Name: ").append(ownersName);
        return sb.toString();
    }
}
