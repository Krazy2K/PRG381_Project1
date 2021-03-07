package BusinessLogic;

import UserDetails.*;
import Database.Datahandler;

import java.util.*;

public class SignInPage 
{
    
    // This page will allow users to login to their profile so view thier order and view the duration they have left in order to make changes to their order.

    public void LoginDetails() throws Exception 
    {
        int i = 0;
        int b = 3;
        do {
        Scanner myScanner = new Scanner(System.in); 
        //counter in chances remaining
        System.out.println("You have "+b+"chances remaining.");

        //Prompt for username input and read input
       
        System.out.println("Please enter your username");
        String userName = myScanner.nextLine();

        //Prompt for password input and read input
        System.out.println("Please enter your password");
        String userPassword = myScanner.nextLine();

        // Static values for username and password (Testing purposes)
        RetrieveData userData = new RetrieveData();
        String dynamicUsername = userData.getUsername();
        String dynamicPassword = userData.getPassword();
            //current username = tpage
            //current password = password123

        // Condition to check if user is granted access 
        if (userName.equalsIgnoreCase("admin") && userPassword.equals("123456")) 
        {
            Datahandler data = new Datahandler();
            data.ViewAdmin();
        } else if(userName.equals(dynamicUsername) && userPassword.equals(dynamicPassword)){
            // Call the method that displays user order and countdown
            System.out.println("Login Successful!");
            System.out.println("please enter your order number");
            int orderNum = myScanner.nextInt();
            countdownPage count = new countdownPage();
            count.CountdownClock(orderNum);
            System.out.println(count);
        }
        else{
            System.out.println("Login Failed! Username or Password was incorrect!");
            //determins the value of b according to login attempts            
            b = b-i;
            // NOTE! Needs to loop back to Login input.
            //need to test loop.
            if(b>0){
                //counts number of attempts
                i++;
                LoginDetails();
            }
            else{
                //registration page
                IntermediaryFile inFile = new IntermediaryFile();
                inFile.NewOrder();
            }
        }                    
        } while ((i <= 3));
           
        
    }
    

    
}

