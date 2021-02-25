package BusinessLogic;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuMethods {
    Scanner scan = new Scanner(System.in);

    public String eventType(){
        System.out.print("enter the type of event: ");
        String eventType = scan.nextLine();
        return eventType;
    }

    public int[] numbAdultsKids(){
        int[] totalAttendees = new int[2];
        System.out.print("enter the amount of Adults attending the event: ");
        int adultCount = scan.nextInt();
        System.out.print("enter the amount of Kids attending the event: ");
        int kidCount = scan.nextInt();

        totalAttendees[0]=adultCount;
        totalAttendees[1]=kidCount;

        return totalAttendees;
    }

    public String venuAddress(){
        System.out.print("enter the address of the event: ");
        String eventAddress = scan.nextLine();
        return eventAddress;
    }

    public ArrayList<String> menuDetails(){
        ArrayList<String> menu = new ArrayList<String>();

        System.out.println("enter the number of the item you want:\n1.Adult meals \n2.Kids meals \n3.drinks \n4.desserts \n5.Exit");
        int choice = scan.nextInt();
        while(choice!=5){
            switch(choice){
                case 1:
                    menu.add("adult meals");
                    break;
                case 2:
                    menu.add("kids meals");
                    break;
                case 3:
                    menu.add("drinks");
                    break;
                case 4:
                    menu.add("desserts");
                    break;
                case 5:
                    break;
            }
            System.out.println("\f");
            System.out.println("selected items:");
            for (String string : menu) {
                System.out.print(string+"+");
            }

            System.out.println();
            System.out.println("enter the number of the item you want:\n1.Adult meals \n2.Kids meals \n3.drinks \n4.desserts \n5.Exit");
            choice = scan.nextInt();
        }
        return menu;
    }

    public String theme(){
        System.out.println("is there a theme?");
        String answer = scan.next();
        String thme = "n/a";
    

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("what is your theme: ");
            thme = scan.next();
        } 
        return thme;
    }

    public ArrayList<String> perDetails(){
        ArrayList<String> personalDetails = new ArrayList<String>();
        System.out.print("Please enter your name: ");
        String nam= scan.next();
        System.out.print("Please enter your surname: ");
        String snam= scan.next();
        System.out.print("Please enter your phone number: ");
        String phoneNumb= scan.next();

        personalDetails.add(nam);
        personalDetails.add(snam);
        personalDetails.add(phoneNumb);

        return personalDetails;
    }
}
