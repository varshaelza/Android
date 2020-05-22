package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    public static final int HERD=24;


    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here

    public void simulateHerd(Random r)
    {
       int size=HERD;
       int pen=size;
       int pasture=0;
       int count=0;

       for(int i=0;i<MAX_ITERATIONS;i++)
       {
           if(pen==0)
           {
               mEastGate.open(Gate.OUT);
               count=mEastGate.thru(r.nextInt(pen)+1);
               pen+=count;
               pasture-=count;
           }
           if(pasture==0)
           {
               mWestGate.open(Gate.IN);
               count=mEastGate.thru(r.nextInt(pasture)+1);
               pasture+=count;
               pen-=count;
           }
           else
           {
               if(r.nextBoolean()==true)
               {
                   mEastGate.open(Gate.OUT);
                   count=mEastGate.thru(r.nextInt(pen)+1);
                   pen+=count;
                   pasture-=count;
               }
               else
               {
                   mWestGate.open(Gate.IN);
                   count=mEastGate.thru(r.nextInt(pasture)+1);
                   pasture+=count;
                   pen-=count;
               }
               }

           }
       }

    }



