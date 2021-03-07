package PresentationLayer;

import BusinessLogic.*;

import java.util.*;

public class Query {
    
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Sign in");
        System.out.println("2.Create an order");
        int signTask = scan.nextInt();
        while(signTask!=0){
            switch(signTask){
                case 1:
                    SignInPage signIn = new SignInPage();
                    signIn.LoginDetails();
                    break;
                case 2:
                    IntermediaryFile inFile = new IntermediaryFile();
                    inFile.NewOrder();
                    break;
            }
            
            System.out.println("\f");
            System.out.println();
            System.out.println("1.Sign in");
            System.out.println("2.Sign up");
            signTask = scan.nextInt();
            
        }
        scan.close();
    }
    
    
}
