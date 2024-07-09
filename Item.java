// TODO: Remember to write file/class/method headers!

/* 
 Title : CSE 11
 Main Class File: Item.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */


/**
 * Represents an item with a name, price, and calorie content.
 */
public class Item {
    /**
     * Name of the item.
     */
    private String name;
     /**
     * Price of the item.
     */
    private double price;
    /**
     * Calorie content of the item.
     */
    private int calories;
    /**
     * Constant representing the untyped high-level type of the item.
     */
    private static final String HIGH_LEVEL_TYPE = "Untyped High Level Item";
    /**
     * Constant representing the untyped type of the item.
     */
    private static final String TYPE = "Untyped Item";

    // TODO: Method header
    /**
     * Constructs an item with default values.
     */
    public Item() {
        this.name = "Unnamed Item";
        this.price = 0.0;
        this.calories = 0;
    }

    // TODO: Method header
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    /**
     * Constructs an item with specified name, price, and calories.
     *
     * @param name     the name of the item
     * @param price    the price of the item
     * @param calories the calorie content of the item
     */
    public Item(String name, double price, int calories) {
        this.name= name;
        this.price= price;
        this.calories= calories;
    }

    /**
     * Gets the name of the item.
     *
     * @return the name of the item
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public String getName() {
        return this.name;
    }

    /**
     * Gets the price of the item.
     *
     * @return the price of the item
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the calorie content of the item.
     *
     * @return the calorie content of the item
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public int getCalories() {
        return this.calories;
    }

    /**
     * Gets the type of the item.
     *
     * @return the type of the item
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD.
    public String getType() {
        return TYPE;
    }

    /**
     * Gets the high-level type of the item.
     *
     * @return the high-level type of the item
     */

    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD.
    public String getHighLevelType() {
        return HIGH_LEVEL_TYPE;

    }

    /**
     * Sets the price of the item.
     *
     * @param price the new price of the item
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public void setPrice(double price) {
        this.price= price;
    }

    /**
     * Compares this item with the specified object for equality.
     *
     * @param object the object to compare this item with
     * @return true if the specified object is equal to this item, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD????
   
    public boolean equals(Object object) {
        if(object instanceof Item != true ){
            return false; 
        }
        Item obj1 = (Item) object;
        if(this.price==obj1.price && this.calories==obj1.calories && this.name.equals(obj1.name)){
            return true; 
        }
        return false;

   
    }

    // The rest of getter methods don't have to be implemented.
    // They will be overridden by subclasses!
    /**
     * Gets the volume of the item.
     *
     * @return the volume of the item
     */
    public double getVolume() {
        return 0;
    }

    /**
     * Gets the flavor of the item.
     *
     * @return the flavor of the item
     */
    public String getFlavor() {
        return "";
    }

    /**
     * Gets the serving size of the item.
     *
     * @return the serving size of the item
     */
    public int getServingSize() {
        return 0;
    }

    /**
     * Gets the texture of the item.
     *
     * @return the texture of the item
     */
    public String getTexture() {
        return "";
    }

    /**
     * Gets the coolness level of the item.
     *
     * @return the coolness level of the item
     */
    public int getCoolnessLevel() {
        return 0;
    }

    /**
     * Gets the boost level of the item.
     *
     * @return the boost level of the item
     */
    public int getBoostLevel() {
        return 0;
    }
    /**
     * Gets the sweetness level of the item.
     *
     * @return the sweetness level of the item
     */
    public int getSweetnessLevel() {
        return 0;
    }

    /**
     * Gets the savoriness level of the item.
     *
     * @return the savoriness level of the item
     */
    public int getSavorinessLevel() {
        return 0;
    }

    /**
     * Returns a string representation of the item.
     *
     * @return a string representation of the item
     */
    @Override
    
    public String toString() {
        return "Item (" + getName() + ") type: " + 
            getType() + "; price: " + getPrice() + 
            "; calories: " + getCalories();
    }

}
