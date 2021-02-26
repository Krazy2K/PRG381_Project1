package BusinessLogic;

import java.util.*;

public class SignInPage 
{
    
    // This page will allow users to login to their profile so view thier order and view the duration they have left in order to make changes to their order.

    public void LoginDetails() 
    {
        Scanner myScanner = new Scanner(System.in); 

        //Prompt for username input and read input
        System.out.println("Please enter your username");
        String userName = myScanner.nextLine();

        //Prompt for password input and read input
        System.out.println("Please enter your password");
        String userPassword = myScanner.nextLine();

        // Static values for username and password (Testing purposes)
        String staticUsername = "Kevin";
        String staticPassword = "Password";
        myScanner.close();

        // Condition to check if user is granted access 
        if (userName == staticUsername && userPassword == staticPassword) 
        {
            // Call the method that displays user order and countdown
            System.out.println("Login Successful!");
            countdownPage count = new countdownPage();

            System.out.println(count);
        } 
        else 
        {
            System.out.println("Login Failed! Username or Password was incorrect!");
            
            // NOTE! Needs to loop back to Login input.
        }
    }

    
}

