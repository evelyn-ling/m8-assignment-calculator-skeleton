package mooc.vandy.java4android.calculator.logic;

public class Module {
    private int a1 = 0;
    private int a2 = 0;

    public Module(int one, int two){
        a1 = one;
        a2 = two;
    }

    public String toString(){
        return "" + (a1 % a2);
    }
}
