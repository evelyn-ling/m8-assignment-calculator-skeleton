package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int a1 = 0;
    private int a2 = 0;

    public Divide(int one, int two){
        a1 = one;
        a2 = two;
    }

    public String toString(){
        return (a1/a2) + " R: " + (a1%a2);
    }
}
