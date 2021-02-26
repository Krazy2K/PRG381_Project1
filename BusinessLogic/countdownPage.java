package BusinessLogic;

public class countdownPage {

    public static void CountdownClock() 
    {
        // This countdown clock will tell users how long they have to make changes to their order.

        //Setting static clock values
        int clockValue = 15;

        if (clockValue > 15 || clockValue == 15) 
        {
            // Displays how much time the user has left to make adjustments
            // Brings up a method to make adjustments to hte order
        } 
        else 
        {
            System.out.println("Time is up! Order has been confirmed.");
        }
    }
}
