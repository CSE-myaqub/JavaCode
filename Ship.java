//Muhammad Yaqub
public class Ship {
    private String name;
    private String launchDate;
    //default launch date used when input is invalid
    private static final String DEFAULT_LAUNCH_DATE = "01/01/1990";
    public Ship() {
        name = "none";
        launchDate = DEFAULT_LAUNCH_DATE;
    }
    //constructor that sets name and launch date using mutators
    public Ship(String name, String launchDate) {
        setName(name);//use mutator to handle null/empty names
        setLaunchDate(launchDate);//validate and set launch date
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "none";
        } else {
            this.name = name.trim();
        }
    }
    public String getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(String date) {
        if (date == null) {
            System.out.println("Error: Invalid launch date format. Resetting " + this.name + "'s launch date to the default " + DEFAULT_LAUNCH_DATE);
            this.launchDate = DEFAULT_LAUNCH_DATE;
            return;
        }
        String trimmed = date.trim();
        String[] parts = trimmed.split("/");
        if (parts.length != 3) {
            //wrong format
            System.out.println("Error: Invalid launch date format. Resetting " + this.name + "'s launch date to the default " + DEFAULT_LAUNCH_DATE);
            this.launchDate = DEFAULT_LAUNCH_DATE;
            return;
        }
        try {
            int year = Integer.parseInt(parts[2]);
            if (year < 1990) {
                //year too early
                System.out.println("Error: Launch date prior to 1990. Resetting " + this.name + "'s launch date to the default " + DEFAULT_LAUNCH_DATE);
                this.launchDate = DEFAULT_LAUNCH_DATE;
            } else if (year > 2019) {
                //year too late
                System.out.println("Error: Launch date after 2019. Resetting " + this.name + "'s launch date to the default " + DEFAULT_LAUNCH_DATE);
                this.launchDate = DEFAULT_LAUNCH_DATE;
            } else {
                this.launchDate = trimmed;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid launch date format. Resetting " + this.name + "'s launch date to the default " + DEFAULT_LAUNCH_DATE);
            this.launchDate = DEFAULT_LAUNCH_DATE;
        }
    }
    public String toString() {
        return "Name: " + name + "\nLaunch Date: " + launchDate;
    }
}
