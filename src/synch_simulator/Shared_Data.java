package synch_simulator;

public class Shared_Data {
    /* This Class contains Shared Data Between All Threads */
    
    /* As we said , we have a box contains Balls  , here some Basic information about this Box */
    public static int numberOfBalls=10;
    public static double weightPerBall= 7.25;
    public static double TheWeightOfBox ()
    {
        return numberOfBalls *weightPerBall;
    }
}
