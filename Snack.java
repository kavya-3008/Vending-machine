// TODO: Remember to write file/class/method headers!
/* 
 Title : CSE 11
 Main Class File: Snack.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Represents a snack item, a subclass of Item, with additional properties such as serving size and texture.
 */
public class Snack extends Item {
    /**
     * Serving size of the snack.
     */
    private int servingSize;
    /**
     * texture of the snack.
     */
    private String texture;
    /**
     * Constant for high level type of the snack.
     */
    private static final String HIGH_LEVEL_TYPE = "Snack";
    /**
     * constant for type of the snack.
     */
    private static final String TYPE = "Untyped Snack";

    /**
     * Constructs a snack with default attributes.
     */
    public Snack() {
        super("Unnamed Nonconsumable", 0.0, 0);
        this.servingSize = 0;
        this.texture = "";
    }

    /**
     * Constructs a snack with specified attributes.
     *
     * @param name        the name of the snack
     * @param price       the price of the snack
     * @param calories    the calorie content of the snack
     * @param servingSize the serving size of the snack
     * @param texture     the texture of the snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Snack(String name, double price, int calories, 
            int servingSize, String texture) {
                super(name,price,calories);
                this.servingSize= servingSize;
                this.texture= texture;
    }

    /**
     * Gets the serving size of the snack.
     *
     * @return the serving size of the snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public int getServingSize() {
        return this.servingSize;
    }

    /**
     * Gets the texture of the snack.
     *
     * @return the texture of the snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public String getTexture() {
        return this.texture;
    }

    /**
     * Gets the type of the snack.
     *
     * @return the type of the snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * Gets the type of the snack.
     *
     * @return the type of the snack
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getHighLevelType() {
        return HIGH_LEVEL_TYPE;
    }

    /**
     * Compares this snack with the specified object for equality.
     *
     * @param object the object to compare this snack with
     * @return true if the specified object is equal to this snack, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Snack)) {
            return false;
        }

        Snack otherSnack = (Snack) object;
        if(super.equals(object) &&
               this.servingSize == otherSnack.servingSize &&
               this.texture.equals(otherSnack.texture)){
                return true;
               }

               return false;
    }


    /**
     * Returns a string representation of the snack.
     *
     * @return a string representation of the snack
     */
    @Override
    public String toString() {
        return "Snack (" + getName() + ") servingSize: " + 
            getServingSize() + "; texture: " + getTexture();
    }
}


