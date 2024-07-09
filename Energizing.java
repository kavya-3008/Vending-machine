// TODO: Remember to write file/class/method headers!
/* 
 Title : CSE 11
 Main Class File: Energising.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Represents an energizing drink item, a subclass of Drink, with an additional property for boost level.
 */
public class Energizing extends Drink {
     /**
     * Boost level of the energizing drink.
     */
    private int boostLevel;
    /**
     * Constant representing the type of the energizing drink.
     */
    private static final String TYPE = "Energizing";

    /**
     * Constructs an energizing drink with default values.
     */
    public Energizing() {
        super("Unnamed Drink", 0.0, 0, 0.0, "");
        this.boostLevel = 0; 
    }

    /**
     * Constructs an energizing drink with specified attributes.
     *
     * @param name       the name of the energizing drink
     * @param price      the price of the energizing drink
     * @param calories   the calorie content of the energizing drink
     * @param volume     the volume of the energizing drink
     * @param flavor     the flavor of the energizing drink
     * @param boostLevel the boost level of the energizing drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Energizing(String name, double price, int calories, 
            double volume, String flavor, int boostLevel) {
                super(name,price,calories,volume,flavor);
                this.boostLevel= boostLevel;
    }

    /**
     * Gets the boost level of the energizing drink.
     *
     * @return the boost level of the energizing drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getBoostLevel() {
        return this.boostLevel;
    }

    /**
     * Gets the type of the energizing drink.
     *
     * @return the type of the energizing drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * Compares this energizing drink with the specified object for equality.
     *
     * @param object the object to compare this energizing drink with
     * @return true if the specified object is equal to this energizing drink, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Energizing)) {
            return false;
        }

        Energizing newObj= (Energizing) object;
        if(super.equals(object)&&this.boostLevel== newObj.boostLevel){
            return true;
        }

        return false;
    }

    /**
     * Returns a string representation of the energizing drink.
     *
     * @return a string representation of the energizing drink
     */
    @Override
    public String toString() {
        return "Drink (" + getName() + ") boostLevel: " + 
            getBoostLevel();
    }
}