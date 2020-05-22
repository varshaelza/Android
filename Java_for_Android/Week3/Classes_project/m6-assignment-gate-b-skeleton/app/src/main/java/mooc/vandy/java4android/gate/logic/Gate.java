package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {

    // TODO -- Fill in your code here
    public static final int IN=1;
    public static final int OUT=-1;
    public static final int CLOSED=0;
    private int mSwing;

    public boolean setSwing(int direction)
    {
        mSwing=direction;
        if(direction>=OUT&&direction<=IN)
        {

            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean open(int direction)
    {
        if(direction==IN||direction==OUT)
        {
            boolean b=setSwing(direction);
            return b;

        }
        else
            return false;
    }

    public void close()
    {
        setSwing(0);
    }

    public int getSwingDirection()
    {
        return mSwing;
    }
    public int thru(int count)
    {
        if(getSwingDirection()==IN)
        {
            return count;
        }
        else if(getSwingDirection()==OUT)
        {
            return -count;
        }
        else
        {
            return 0;
        }
    }
    public String toString()
    {
        if(getSwingDirection()==CLOSED)
        {
            return "This gate is closed\n";
        }
        else if(getSwingDirection()==IN)
        {
            return "This gate is open and swings to enter the pen only\n";
        }
        else if(getSwingDirection()==OUT)
        {
            return "This gate is open and swings to exit the pen only\n";
        }
        else
        {
            return "This gate has an invalid swing direction\n";
        }

    }
}
