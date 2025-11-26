//Muhammad Yaqub
public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crewMembers;
    public CruiseShip() {
        super();
        passengerCapacity = 0;
        crewMembers = 0;
    }
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewMembers) {
        super(name, launchDate);//initialize name and launch date in Ship
        setPassengerCapacity(passengerCapacity);//validate and set passenger capacity
        setCrewMembers(crewMembers);//validate and set crew members
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity < 0) {
            this.passengerCapacity = 0;
        } else {
            this.passengerCapacity = passengerCapacity;
        }
    }
    public int getCrewMembers() {
        return crewMembers;
    }
    public void setCrewMembers(int crewMembers) {
        if (crewMembers < 0) {
            this.crewMembers = 0;
        } else {
            this.crewMembers = crewMembers;
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Passenger Capacity: ").append(passengerCapacity).append("\n");
        sb.append("Crew: ").append(crewMembers);
        return sb.toString();
    }
}
