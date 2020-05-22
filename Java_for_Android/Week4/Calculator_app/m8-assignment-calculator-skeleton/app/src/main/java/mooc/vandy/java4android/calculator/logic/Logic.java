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
       implements LogicInterface {
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
    private static final add=0;
    private static final sub=1;
    private static final mul=2;
    private static final div=3;
    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){

        if(operation==add)
        {
            Add a=new Add(argumentOne,argumentTwo);
            mOut.print(Integer.toString(a.getresult()));
        }
        else  if(operation==sub)
        {
            Subtract b=new Subtract(argumentOne,argumentTwo);
            mOut.print(Integer.toString(b.getresult()));
        }
        else if(operation==mul)
        {
            Multiply c=new Multiply(argumentOne,argumentTwo);
            mOut.print(Integer.toString(c.getresult()));
        }
        else
        {
            Divide e=new Divide(argumentOne,argumentTwo);
            mOut.print(e.getresult()+" R:"+e.getremind());
        }
        // TODO -- start your code here
    }
}
