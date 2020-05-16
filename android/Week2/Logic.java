package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        int i,j,k=1;
        mOut.print("+");
        for(i=0;i<size*2;i++)
        {
            mOut.print("-");
        }
        mOut.print("+\n");
        for(i=0;i<(size*2-1);i++)
        {
            mOut.print("|");
            if(i==size-1&&size%2==0)
            {
                mOut.print("<");
                for(j=0;j<(size-1)*2;j++)
                {mOut.print("-");}
                mOut.print(">");
            }
            else if(i==size-1&&size%2==1)
            {
                mOut.print("<");
                for(j=0;j<(size-1)*2;j++)
                {mOut.print("=");}
                mOut.print(">");
            }
            else {

                if (i < size) {
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        mOut.print(" ");
                    }
                    mOut.print("/");
                    for (j = 0; j <i*2;j++)
                    {   if(i%2==0)
                       mOut.print("=");
                    else
                        mOut.print("-");

                    }
                    mOut.print("\\");
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        mOut.print(" ");
                    }


                }

                if (i >= size) {
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        mOut.print(" ");
                    }
                    mOut.print("\\");
                    for (j = 0; j <(size-1)*2-(k*2);j++)
                    {   if(i%2==0)
                        mOut.print("=");
                    else
                        mOut.print("-");

                    }
                    k++;
                    mOut.print("/");
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        mOut.print(" ");
                    }

                }


        }


            mOut.print("|\n");
    }
        mOut.print("+");
        for(i=0;i<size*2;i++)
        {
            mOut.print("-");
        }
        mOut.print("+\n");
}
}
