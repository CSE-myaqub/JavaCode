//Muhammad Yaqub
public class Coffee {
    private String name;
    private int caffeineContent;
    public Coffee() {
        name = "none";
        caffeineContent = 50;
    }
    //constructor that uses mutators to check if inputs are valid
    public Coffee(String xName, int xCaffeine) {
        setName(xName); //calls mutator to set name (handles null)
        setCaffeineContent(xCaffeine); //calls mutator to validate and set caffeine
    }
    //accessor for name
    public String getName() {
        return name;
    }
    //accessor for caffeine content
    public int getCaffeineContent() {
        return caffeineContent;
    }
    //mutator for name
    public void setName(String xName) {
        if (xName == null) {
            name = "none";
        } else {
            name = xName;
        }
    }
    //mutator for caffeineContent that makes sure its 50 to 300
    public boolean setCaffeineContent(int xCaffeine) {
        if (xCaffeine >= 50 && xCaffeine <= 300) {
            caffeineContent = xCaffeine;
            return true;
        } else {
            return false;
        }
    }
    public double riskyAmount() {
        double cups = 180.0 / ((caffeineContent / 100.0) * 6.0);
        return cups;
    }
    public void writeOutput() {
        System.out.println(name + " (" + caffeineContent + " mg)");
    }
}