package BusinessLogic;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import Database.Datahandler;


public class countdownPage {

    public void CountdownClock(int orderNum) throws SQLException 
    {
        Scanner scan = new Scanner(System.in);
        Datahandler data = new Datahandler();
        int numberOfDays = 15;
        LocalDate setDate = LocalDate.parse(data.viewDate(orderNum));
        LocalDate presentTime = LocalDate.now();
        long timeLeft = ChronoUnit.DAYS.between(setDate, presentTime);

        if (timeLeft > numberOfDays) {
            
            System.out.println("You have " + timeLeft + " days left to make any changes before your order is locked in!");
            data.View(orderNum);
            System.out.println("would you like to make any changes?");
            System.out.println("1.Yes \n2.No");
            int choice = scan.nextInt();
            if (choice == 1) {
                changesMade change = new changesMade();
                change.makingChanges();
            } else {
                System.out.println("okay then. Enjoy your day");
            }
        }
        else{
            System.out.println("Sorry! Your time to make changes has run out!");
        }

        scan.close();
    }
}
