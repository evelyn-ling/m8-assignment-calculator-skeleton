package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    private int a1 = 0;
    private int a2 = 0;

    public Multiply(int one, int two){
        a1 = one;
        a2 = two;
    }

    public String toString(){
        return "" + (a1 * a2);
    }
}
