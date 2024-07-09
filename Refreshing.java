// TODO: Remember to write file/class/method headers!
/* 
 Title : CSE 11
 Main Class File: Refreshing.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Represents a refreshing drink item, a subclass of Drink, with an additional property for coolness level.
 */
public class Refreshing extends Drink {
    /**
     * Coolness level of the refreshing drink.
     */
    private int coolnessLevel;
    /**
     * constant showing refreshing type of drink.
     */
    private static final String TYPE = "Refreshing";

    /**
     * Constructs a refreshing drink with default values.
     */
    public Refreshing() {
        super("Unnamed Drink", 0.0, 0, 0.0, "");
        this.coolnessLevel = 0; 
    }

    /**
     * Constructs a refreshing drink with specified attributes.
     *
     * @param name          the name of the refreshing drink
     * @param price         the price of the refreshing drink
     * @param calories      the calorie content of the refreshing drink
     * @param volume        the volume of the refreshing drink
     * @param flavor        the flavor of the refreshing drink
     * @param coolnessLevel the coolness level of the refreshing drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Refreshing(String name, double price, int calories, 
            double volume, String flavor, int coolnessLevel) {
                super(name,price,calories,volume,flavor);
                this.coolnessLevel= coolnessLevel;
    }

    
    /**
     * Gets the coolness level of the refreshing drink.
     *
     * @return the coolness level of the refreshing drink
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getCoolnessLevel() {
        return this.coolnessLevel;
    }

    /**
     * Gets the type of the refreshing drink.
     *
     * @return the type of the refreshing drink
     */
    
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * Compares this refreshing drink with the specified object for equality.
     *
     * @param object the object to compare this refreshing drink with
     * @return true if the specified object is equal to this refreshing drink, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Refreshing)) {
            return false;
        }
        Refreshing otherRefreshing = (Refreshing) object;
        if(super.equals(object) &&
        this.coolnessLevel == otherRefreshing.coolnessLevel){
            return true;
        }

        return false;
    }

    /**
     * Returns a string representation of the refreshing drink.
     *
     * @return a string representation of the refreshing drink
     */
    @Override
    public String toString() {
        return "Drink (" + getName() + ") coolnessLevel: " + 
        getCoolnessLevel();
    }
}