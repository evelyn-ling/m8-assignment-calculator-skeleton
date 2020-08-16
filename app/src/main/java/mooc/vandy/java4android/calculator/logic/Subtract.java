package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    private int a1 = 0;
    private int a2 = 0;

    public Subtract(int one, int two){
        a1 = one;
        a2 = two;
    }

    public String toString(){
        return "" + (a1 - a2);
    }
}
