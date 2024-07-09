/* 
 Title : CSE 11
 Main Class File: Sweet.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Represents a sweet snack item, a subclass of Snack, with an additional property for sweetness level.
 */
public class Sweet extends Snack {
     /**
     * Sweetness level of the sweet snack.
     */
    private int sweetnessLevel;
    /**
     * Constant representing the type of the sweet snack.
     */
    private static final String TYPE = "Sweet";

    /**
     * Constructs a sweet snack with default values.
     */
    public Sweet() {
        super("Unnamed Drink", 0.0, 0, 0, "");
        this.sweetnessLevel = 0; 
    }

    /**
     * Constructs a sweet snack with specified attributes.
     *
     * @param name           the name of the sweet snack
     * @param price          the price of the sweet snack
     * @param calories       the calorie content of the sweet snack
     * @param servingSize    the serving size of the sweet snack
     * @param texture        the texture of the sweet snack
     * @param sweetnessLevel the sweetness level of the sweet snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Sweet(String name, double price, int calories, 
            int servingSize, String texture, int sweetnessLevel) {
                super(name,price,calories, servingSize, texture);
               
                this.sweetnessLevel= sweetnessLevel;
    }

    /**
     * Gets the sweetness level of the sweet snack.
     *
     * @return the sweetness level of the sweet snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getSweetnessLevel() {
        return this.sweetnessLevel;
    }

    /**
     * Gets the type of the sweet snack.
     *
     * @return the type of the sweet snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * Compares this sweet snack with the specified object for equality.
     *
     * @param object the object to compare this sweet snack with
     * @return true if the specified object is equal to this sweet snack, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Sweet)) {
            return false;
        }
        Sweet newObject= (Sweet) object;
        if(super.equals(object)&&
         this.sweetnessLevel== newObject.sweetnessLevel){
            return true;
        }

        return false;
    }

    /**
     * Returns a string representation of the sweet snack.
     *
     * @return a string representation of the sweet snack
     */
    @Override
    public String toString() {
        return "Drink (" + getName() + ") sweetnessLevel: " + 
            getSweetnessLevel();
    }
}