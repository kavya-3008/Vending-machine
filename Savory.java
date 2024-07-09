// TODO: Remember to write file/class/method headers!

/* 
 Title : CSE 11
 Main Class File: Savory.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Represents a savory snack item, a subclass of Snack, with an additional property for savoriness level.
 */
public class Savory extends Snack {
    /**
     * Savoriness level of the savory snack.
     */
    private int savorinessLevel;
    /**
     * Constant representing the type of the savory snack.
     */
    private static final String TYPE = "Savory";

   /**
     * Constructs a savory snack with default values.
     */
    public Savory() {
        super("Unnamed Drink", 0.0, 0, 0, "");
        this.savorinessLevel = 0; 
    }

    /**
     * Constructs a savory snack with specified attributes.
     *
     * @param name            the name of the savory snack
     * @param price           the price of the savory snack
     * @param calories        the calorie content of the savory snack
     * @param servingSize     the serving size of the savory snack
     * @param texture         the texture of the savory snack
     * @param savorinessLevel the savoriness level of the savory snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Savory(String name, double price, int calories, 
            int servingSize, String texture, int savorinessLevel) {
                super(name,price,calories,servingSize,texture);
                this.savorinessLevel= savorinessLevel;
    }

    /**
     * Gets the savoriness level of the savory snack.
     *
     * @return the savoriness level of the savory snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getSavorinessLevel() {
        return this.savorinessLevel;
    }

    /**
     * Gets the type of the savory snack.
     *
     * @return the type of the savory snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * Compares this savory snack with the specified object for equality.
     *
     * @param object the object to compare this savory snack with
     * @return true if the specified object is equal to this savory snack, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Savory)) {
            return false;
        }

        Savory newSav= (Savory) object;
        if(super.equals(object)&& 
        this.savorinessLevel== newSav.savorinessLevel){
                return true;
        }

        return false;

    }

    /**
     * Returns a string representation of the savory snack.
     *
     * @return a string representation of the savory snack
     */
    @Override
    public String toString() {
        return "Drink (" + getName() + ") savorinessLevel: " + 
        getSavorinessLevel();
    }
}