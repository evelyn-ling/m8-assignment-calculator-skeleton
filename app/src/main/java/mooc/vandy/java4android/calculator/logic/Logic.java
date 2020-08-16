package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic
    //Evelyn Ling's Code
       implements LogicInterface {
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    //private static final int DIVIDE = 4;

    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        if(operation == ADDITION)
        {
            Add add = new Add(argumentOne, argumentTwo);
            mOut.print(add.toString());
        }
        else if(operation == SUBTRACTION){
            Subtract subtract = new Subtract(argumentOne, argumentTwo);
            mOut.print(subtract.toString());
        }
        else if(operation == MULTIPLICATION){
            Multiply multiply = new Multiply(argumentOne, argumentTwo);
            mOut.print(multiply.toString());
        }
        //else if(operation == DIVIDE){
            //Divide divide = new Divide(argumentOne, argumentTwo);
            //mOut.print(divide.toString());
        //}
        else{
            Module module = new Module(argumentOne, argumentTwo);
            mOut.print(module.toString());
        }
    }
}
