// TODO: Remember to write file/class/method headers!
/* 
 Title : CSE 11
 Main Class File: VendingMachine.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

import java.util.ArrayList;

/**
 * Represents a vending machine that manages a list of items.
 */

public class VendingMachine {
    private ArrayList<Item> itemList;

    /**
     * Constructs a vending machine with an empty item list.
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public VendingMachine() {
        itemList= new ArrayList<>();
    }

    /**
     * Adds a single item to the vending machine's item list.
     *
     * @param item the item to add to the item list
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public void addToItemList(Item item) {
        itemList.add(item);
    }

    /**
     * Adds an array of items to the vending machine's item list.
     *
     * @param items the array of items to add to the item list
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public void addToItemList(Item[] items) {
        for(Item item: items){
            itemList.add(item);
        }
    }

    /**
     * Checks if the vending machine has an item with the specified name.
     *
     * @param itemName the name of the item to check
     * @return true if the vending machine has the item, false otherwise
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public boolean hasItem(String itemName) {
        for(Item item : itemList){
            if(item.getName().equals(itemName)){
                return true;
            }
        }
        return false;
    }

    /**
     * Gets and removes an item with the specified name from the vending machine's item list.
     *
     * @param itemName the name of the item to get
     * @return the item with the specified name, or null if not found
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Item getItem(String itemName) {
        for(Item item : itemList ){
            if(item.getName().equals(itemName)){
                itemList.remove(item);
                return item;
            }
        }

        return null;
    }

    // Helper method for computing size based on the item type
    // helper method
    private static double computeSize(Item item) {
      if(item instanceof Drink){
        return ((Drink) item).getVolume();
      } else if(item instanceof Snack){ 
        return ((Snack) item).getServingSize() * 12.0; 
        } else{
            return 0;
        }

      }
    

    /**
     * Compares the sizes of two items.
     *
     * @param item1 the first item to compare
     * @param item2 the second item to compare
     * @return -1 if item1 is smaller, 0 if they are equal, 1 if item1 is larger
     */
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public static int compareSize(Item item1, Item item2) {
        double size1= computeSize(item1);
        double size2= computeSize(item2);
        //   System.out.println(size1+ "size" + size2);
        if(size1<size2){
            return -1;
        } if (size1==size2){
            return 0;
        }else{
            return 1;
        }
        

      
    }

    /**
     * Applies a price surge to item in the vending machine
     *
     * @param increaseRate the rate by which to increase the price
     * @return the index of the item to which the price surge was applied
     */

    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public int applyPriceSurge(double increaseRate) {
        int randomIndex= (int) (Math.random()* itemList.size());

        if(increaseRate>=1){
            double originalPrice= itemList.get(randomIndex).getPrice();
            double newPrice= originalPrice * increaseRate;
            itemList.get(randomIndex).setPrice(newPrice);
            // System.out.println("this"+ newPrice);

        }

        
        return randomIndex;
    }

    /**
     * Gets an array of items of a specific type from the vending machine's item list.
     *
     * @param type the type of items to retrieve
     * @return an array of items of the specified type
     */
    // TODO: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Item[] getItemsByType(String type) {
        ArrayList<Item> itemsOfType= new ArrayList<>();
   
        for(Item item : itemList){
            if(item.getType().equals(type)){
                itemsOfType.add(item);
            }
        }

        for(Item item: itemList){
            if(!(item.getType().equals(type))){
                itemsOfType.add(null);
            }
        }

        return itemsOfType.toArray(new Item[0]);
    } 

    /**
     * Gets the item list of the vending machine.
     *
     * @return the item list of the vending machine
     */
    // helper method for testing
    public ArrayList<Item> getItemList() {
        return this.itemList;
    }
}