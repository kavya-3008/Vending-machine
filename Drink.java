// TODO: Remember to write file/class/method headers!
/* 
 Title : CSE 11
 Main Class File: Drink.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Represents a drink item, a subclass of Item, with additional properties such as volume and flavor.
 */
public class Drink extends Item {
    /**
     * Volume of the drink.
     */
    private double volume;
    /**
     * Flavour of the drink.
     */
    private String flavor;
    /**
     * Constant representing the high-level type of the drink.
     */
    private static final String HIGH_LEVEL_TYPE = "Drink";
    /**
     * Constant representing the untyped type of the drink.
     */
    private static final String TYPE = "Untyped Drink";

    /**
     * Constructs a drink with default values.
     */
    public Drink() {
        super("Unnamed Consumable", 0.0, 0);
        this.volume = 0;
        this.flavor = "";
    }

    /**
     * Constructs a drink with specified attributes.
     *
     * @param name     the name of the drink
     * @param price    the price of the drink
     * @param calories the calorie content of the drink
     * @param volume   the volume of the drink
     * @param flavor   the flavor of the drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Drink(String name, double price, int calories, 
            double volume, String flavor) {

                super(name,price,calories);
                this.volume= volume;
                this.flavor= flavor;
    }

    /**
     * Gets the volume of the drink.
     *
     * @return the volume of the drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public double getVolume() {
        return this.volume;
    }

    /**
     * Gets the flavor of the drink.
     *
     * @return the flavor of the drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public String getFlavor() {
        return this.flavor;
    }

    /**
     * Gets the volume of the drink.
     *
     * @return the volume of the drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * Gets the type of the drink.
     *
     * @return the type of the drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getHighLevelType() {
        return HIGH_LEVEL_TYPE;
    }

    /**
     * Compares this drink with the specified object for equality.
     *
     * @param object the object to compare this drink with
     * @return true if the specified object is equal to this drink, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Drink != true ){
            return false; 
        }

        Drink object1= (Drink) object;
        if(super.equals(object)&&this.volume==object1.volume && this.flavor.equals(object1.flavor )){
            return true; 
        }
        return false;
    }

    /**
     * Returns a string representation of the drink.
     *
     * @return a string representation of the drink
     */
    @Override
    public String toString() {
        return "Drink (" + getName() + ") volume: " + 
            getVolume() + "; flavor: " + getFlavor();
    }
}


