package cse360assignment02;

/**
 * This class represents an Adding Machine which can add and subtract values.
 */
public class AddingMachine {
    /**
     * Stores the total value after performing the calculations.
     * Stores the history of all the inputs.
     */
    private int total;
    private String history;

    /**
     * This is the constructor for the class.
     * Sets the inital value of total and history to 0.
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * This method gets the total value.
     * @return int The value total.
     */
    public int getTotal () {
        return total;
    }

    /**
     * This method adds the value to the total.
     * @param value The number to be added.
     */
    public void add (int value) {
        total=total+value;
        history+=" + "+value;
    }

    /**
     * This method subtracts the value to the total.
     * @param value The number to be subtracted.
     */
    public void subtract (int value) {
        total=total-value;
        history+=" - "+value;
    }

    /**
     * This method prints out the history of inputs.
     * @return String The value of history.
     */
    public String toString () {
        return history;
    }

    /**
     * This method clears the memory by resetting the values.
     */
    public void clear() {
        total = 0;
        history = "0";
    }

    /**
     * This method is the driver method.
     */
    public static void main(String[] args) {
        AddingMachine myCalculator=new AddingMachine();
        myCalculator.add (4);
        myCalculator.subtract (2);
        System.out.println(myCalculator.getTotal());
        System.out.println(myCalculator.toString());
        myCalculator.clear();
    }
}


