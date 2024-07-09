// TODO: Remember to write file/class/method headers!
/* 
 Title : CSE 11
 Main Class File: Assignment6.java 
 File: (Item,drink,snack,sweet,refreshing,energising,
        savory,vendingmachine,assignment6).java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

import java.util.ArrayList;
/**
 * A class representing an assignment related to a vending machine and items.
 */
public class Assignment6 {
    /**
     * A helper method to print an array of items.
     *
     * @param itemArr the array of items to print
     */
    // This helper method is given to help you debug!
    // It is OPTIONAL to use.
    public static void printItemArray(Item[] itemArr) {
        System.out.println('[');
        for (int i = 0; i < itemArr.length; i++) {
            System.out.print("  " + itemArr[i]);
            System.out.println(',');
        }
        System.out.println(']');
    }

    /**
     * A helper method to print an ArrayList of items.
     *
     * @param itemArr the ArrayList of items to print
     */
    // This helper method is given to help you debug!
    // It is OPTIONAL to use.
    public static void printItemArray(ArrayList<Item> itemArr) {
        System.out.println('[');
        for (int i = 0; i < itemArr.size(); i++) {
            System.out.print("  " + itemArr.get(i));
            System.out.println(',');
        }
        System.out.println(']');
    }

    /**
     * Runs unit tests for the assignment.
     *
     * @return true if all tests pass, false otherwise
     */
    public static boolean unitTests() {
        // SETUP
        VendingMachine vm = new VendingMachine();

        // Add items to a VendingMachine object
        Refreshing r1 = new Refreshing("Lemonade", 10.0, 
            100, 12.0, "Sour", 5);
        vm.addToItemList(r1); 
        Item[] itemsToAdd = { 
            new Energizing("Coffee", 8.0, 250, 6.0, "Sugary", 10),
            new Sweet("Twix", 3.0, 210, 1, "Chewy", 6),
            new Savory("Pretzels", 4.0, 130, 2, "Crunchy", 4)
        };
        vm.addToItemList(itemsToAdd);

        // feel free to add more items to VendingMachine object!


        // TEST CASE 1
        // We provide a test case for applyPriceSurge
        // Save all the original prices of the items
        double[] originalPrices = new double[vm.getItemList().size()];
        for (int i = 0; i < vm.getItemList().size(); i++) {
            originalPrices[i] = vm.getItemList().get(i).getPrice();
        }
        
        // Apply price increase
        double increaseRate = 1.5;
        int increaseIndex = vm.applyPriceSurge(increaseRate);
        
        // Check itemList prices
        for (int i = 0; i < vm.getItemList().size(); i++) {
            Item item = vm.getItemList().get(i);
            if (i != increaseIndex || increaseRate < 1) {
                // Check that the Item as this index is still the same
                if (item.getPrice() != originalPrices[i]) {
                    // Item has changed unexpectedly
                    System.out.println("applyPriceSurge 1" +
                        " - Item unexpectedly changed " +
                        "at index: " + i);
                    System.out.println(vm.getItemList());
                    return false;
                }
            } else {
                // Check that the Item has the expected discount price
                double actualPrice = originalPrices[i] * increaseRate;
                if (item.getPrice() != actualPrice) {
                    System.out.println("applyPriceSurge 1" +
                        " - Item does not have expected increased price");
                    System.out.println(item.getPrice());
                    System.out.println(actualPrice);
                    System.out.println(vm.getItemList());
                    return false;
                }
            }
        }
        // TODO: write more test cases HERE!!!!!!
        // TEST CASE 2
        Drink drink1 = new Drink("Cola", 2.0, 100, 355, "Cola Flavor");
        Drink drink2 = new Drink("Orange Juice", 2.5, 120, 500, "Orange Flavor");
        int comparison1 = VendingMachine.compareSize(drink1, drink2);
        // Expected Result: comparison1 should be 1, indicating drink1 is larger
        if (comparison1 != -1) {
            System.out.println("Test Case 2 failed."+ comparison1);
            return false;
        }


        

        // TEST CASE 3
        // We provide another test case for applyPriceSurge with increase rate less than 1
        // Save all the original prices of the items
        double[] originalPrices2 = new double[vm.getItemList().size()];
        for (int j = 0; j < vm.getItemList().size(); j++) {
            originalPrices2[j] = vm.getItemList().get(j).getPrice();
        }

        // Apply price increase
        double increaseRate2 = 0.5; // Increase rate less than 1
        int increaseIndex2 = vm.applyPriceSurge(increaseRate2);

        // Check itemList prices
        for (int k = 0; k < vm.getItemList().size(); k++) {
            Item item2 = vm.getItemList().get(k);
            if (k != increaseIndex2 || increaseRate2 < 1) {
                // Check that the Item as this index is still the same
                if (item2.getPrice() != originalPrices2[k]) {
                    // Item has changed unexpectedly
                    System.out.println("applyPriceSurge 3" +
                        " - Item unexpectedly changed " +
                        "at index: " + k);
                    System.out.println(vm.getItemList());
                    return false;
                }
            } else {
                // Check that the Item has the expected price (same as original)
                double actualPrice2 = originalPrices2[k]; // No change expected
                if (item2.getPrice() != actualPrice2) {
                    System.out.println("applyPriceSurge 3" +
                        " - Item does not have expected price (same as original)");
                    System.out.println(item2.getPrice());
                    System.out.println(actualPrice2);
                    System.out.println(vm.getItemList());
                    return false;
                }
            }
        }



        Snack snack1 = new Savory("Chips", 1.0, 150, 2, "Crunchy", 10);
        Snack snack2 = new Sweet("Chocolate", 2.0, 200, 1, "Soft", 18);
        vm.addToItemList(snack1);
        vm.addToItemList(snack2);
        Item[] snacks = vm.getItemsByType("Sweet");
       // System.out.println("hello"+ java.util.Arrays.toString (snacks));

        if (snacks.length != 6) 
        {
            System.out.println("getItemsByType 1 - " +
                "Incorrect number of items returned");
            return false;
        }
        for(int i=0; i<2; i++)
        {
            if(snacks[i].getType() != "Sweet")
            {
                System.out.println("getItemsByType 1 - " +
                    "Incorrect type of item returned");
                return false;
            }
        }
        for (int i = 2; i < snacks.length; i++) 
        {
            if (snacks[i] != null) 
            {
                System.out.println("getItemsByType 1 - " +
                    "Incorrect item returned");
                return false;
            }
        }

        // Optional: TEST CASE 5...

        return true;
    

       

}


    /**
     * The main method to run the assignment.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Perform unitTests 
        if(unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
            return;
        }

        // Don't need to write code in main!
    }

}

