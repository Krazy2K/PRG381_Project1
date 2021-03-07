package BusinessLogic;

import Database.UserDetails.*;
import java.util.*;

public class SignInPage 
{
    public void LoginDetails() throws Exception 
    {
        int i = 0;
        int b = 3;
        do {
        Scanner myScanner = new Scanner(System.in); 
        System.out.println("You have "+b+" chances remaining.");
        System.out.println("Please enter your username");
        String userName = myScanner.nextLine();
        System.out.println("Please enter your password");
        String userPassword = myScanner.nextLine();
        RetrieveData userData = new RetrieveData();
        String dynamicUsername = userData.getUsername();
        String dynamicPassword = userData.getPassword();
            //current username = tpage
            //current password = password123
        if (userName.equalsIgnoreCase("admin") && userPassword.equals("123456")) 
        {
            EventDetails data = new EventDetails();
            data.DisplayAll();

        } else if(userName.equals(dynamicUsername) && userPassword.equals(dynamicPassword)){
            System.out.println("Login Successful!");
            System.out.println("please enter your order number");
            int orderNum = myScanner.nextInt();
            countdownPage count = new countdownPage();
            count.CountdownClock(orderNum);
            System.out.println(count);
            myScanner.close();
        }
        else{
            System.out.println("Login Failed! Username or Password was incorrect!");
            if(b!=0){
                i++;
                b = b-1;
            }
            else{
                System.out.println("You have failed to login, please pocess a new order.");
                IntermediaryFile inFile = new IntermediaryFile();
                inFile.NewOrder();
            }
        }
        } while ((i <= 3));
           
        
    }
    

    
}

