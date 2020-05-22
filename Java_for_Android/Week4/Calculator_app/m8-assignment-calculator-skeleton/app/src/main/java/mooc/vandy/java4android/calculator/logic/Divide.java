package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int result;
    private int remind;
    public Divide(int ar1,int ar2)
    {
        result=ar1/ar2;
        remind=ar1%ar2;
    }
    public int getresult()
    {
        return result;
    }
    public int getremind()
    {
        return result;
    }
}
