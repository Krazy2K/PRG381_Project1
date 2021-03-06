package BusinessLogic;

import UserDetails.*;
import BusinessLogic.*;
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
        //String staticUsername = "Kevin";
        //String staticPassword = "Password";
            //current username = tpage
            //current password = password123
        myScanner.close();

        // Condition to check if user is granted access 
        if (userName.equals(dynamicUsername) && userPassword.equals(dynamicPassword)) 
        {
            // Call the method that displays user order and countdown
            System.out.println("Login Successful!");
            countdownPage count = new countdownPage();

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

