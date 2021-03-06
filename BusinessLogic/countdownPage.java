package BusinessLogic;
import java.time.LocalDateTime;

public class countdownPage {

    public void CountdownClock() 
    {
        // This countdown clock will tell users how long they have to make changes to their order.

        //Setting value to 15 days (number of days before event starts that user can make changes to order)
        int numberOfDays = 15;

        //Getting local date
        LocalDateTime presentTime = LocalDateTime.now();

        //Calling the event time from the MenuMethods file
        MenuMethods eventDate = new MenuMethods();
        eventDate.eventDate();
        int timeLeft;   // How do I subtract the event date from the present date?

        if (timeLeft > numberOfDays) {
            
            System.out.println("You have " + timeLeft + " days left to make any changes before your order is locked in!");
        }
        else{
            System.out.println("Sorry! Your time to make changes has run out!");
        }

        
    }
}
