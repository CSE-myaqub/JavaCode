//Muhammad Yaqub
import java.util.Scanner;
public class Apple {
		private String type;//stores the apple type
		private double weight;//stores the apples weight in kilograms
		private double price;//stores the apples price per apple
		private static final String[] ALLOWED_TYPES = {
		        "Red Delicious", "Golden Delicious", "Gala", "Granny Smith"
		    };
		public Apple() {
	        type = "Gala";//default information
	        weight = 0.5;
	        price = 0.88;
	    }
		public Apple(String xType, double xWeight, double xPrice) {
	        setType(xType);//calls mutator to validate and set type
	        setWeight(xWeight);//validates and sets the weight
	        setPrice(xPrice);//validates and sets the price
	    }
		public String getType() {
	        return type;
	    }
	    public double getWeight() {
	        return weight;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setType(String xType) {
	        boolean valid = false;
	        for (String allowed : ALLOWED_TYPES) {
	            if (allowed.equals(xType)) {
	                valid = true;
	                break;
	            }
	        }
	        if (valid) {
	            type = xType;
	        } else {
	            System.out.println("Invalid value for type!");
	            type = null;//resets to null when invalid
	        }
	    }
	    public void setWeight(double xWeight) {
	        if (xWeight >= 0 && xWeight <= 2) {
	            weight = xWeight;
	        } else {
	            System.out.println("Invalid value for weight!");
	            weight = 0.0;//resets to 0.0 if invalid
	        }
	    }

	    public void setPrice(double xPrice) {
	        if (xPrice >= 0) {
	            price = xPrice;
	        } else {
	            System.out.println("Invalid value for price!");
	            price = 0.0; //resets to 0.0 if invalid
	        }
	    }

	    //method to display the apple details neatly
	    public void writeOutput() {
	        System.out.println("Type: " + type);
	        System.out.println("Weight: " + weight + " kg");
	        System.out.println("Price: $" + String.format("%.2f", price));//price formatted to 2 decimals
	}

}
