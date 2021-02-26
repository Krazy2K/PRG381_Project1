package BusinessLogic;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuMethods {
    Scanner scan = new Scanner(System.in);
    ArrayList<EventDetails> newOrder = new ArrayList<>();
    EventDetails evnDets = new EventDetails();
    
    public void eventType(){
        System.out.print("enter the type of event: ");
        String eventType = scan.nextLine();
        evnDets.setEventType(eventType);
    }

    public void numbAdultsKids(){
        System.out.print("enter the amount of Adults attending the event: ");
        String adultCount = scan.next();
        System.out.print("enter the amount of Kids attending the event: ");
        String kidCount = scan.next();

        evnDets.setNumberOfAdults(adultCount);
        evnDets.setNumberOfKids(kidCount);
    }

    public void venuAddress(){
        System.out.print("enter the address number of the event: ");
        String AddressNumb = scan.next();
        System.out.print("enter the address street of the event: ");
        String AddressStreet = scan.next();
        System.out.print("enter the address suburb of the event: ");
        String AddressSuburb = scan.next();
        evnDets.setVenueAdress(AddressNumb+AddressStreet+AddressSuburb);
    }

    public void menuDetails(){
        ArrayList<String> menu = new ArrayList<String>();

        System.out.println("enter the number of the item you want:\n1.Adult meals \n2.Kids meals \n3.drinks \n4.desserts \n5.Exit");
        int choice = scan.nextInt();
        while(choice!=5){
            switch(choice){
                case 1:
                    menu.add("adult meals");
                    evnDets.setAdultMeals("Yes");
                    break;
                case 2:
                    menu.add("kids meals");
                    evnDets.setKidMeals("Yes");
                    break;
                case 3:
                    menu.add("drinks");
                    evnDets.setDrinks("Yes");
                    break;
                case 4:
                    menu.add("desserts");
                    evnDets.setDessert("Yes");
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
    }

    
    public void theme(){
        System.out.println("is there a theme?");
        String answer = scan.next();
        String thme = "n/a";
    

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("what is your theme: ");
            thme = scan.next();
            evnDets.setThemeType(thme);
        } 
    }

    public void perDetails(){
        System.out.println();
        System.out.print("Please enter your name: ");
        String nam= scan.next();
        System.out.print("Please enter your surname: ");
        String snam= scan.next();
        System.out.print("Please enter your phone number: ");
        String phoneNumb= scan.next();

        evnDets.setCusName(nam);
        evnDets.setCusSurname(snam);
        evnDets.setCusPhoneNumber(phoneNumb);
    }

    public void eventDate(){
        System.out.print("Enter the year of the event (yyyy)");
        int year = scan.nextInt();
        System.out.print("Enter the month of the event (mm)");
        int month = scan.nextInt();
        System.out.print("Enter the day of the event (dd)");
        int day = scan.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        evnDets.setEventDate(date);
    }
    public void eventTime(){
        System.out.print("Enter the year of the event (hh)");
        int hour = scan.nextInt();
        System.out.print("Enter the month of the event (mm)");
        int minute = scan.nextInt();

        LocalTime date = LocalTime.of(hour, minute);
        evnDets.setEventTime(date);
    }
    public void eventConfirm(){
        newOrder.add(new EventDetails(evnDets.getEventType(), evnDets.getEventDate(), evnDets.getEventTime(), evnDets.getVenueAdress(), evnDets.getNumberOfKids(), evnDets.getNumberOfAdults(), evnDets.getAdultMeals(), evnDets.getKidMeals(), evnDets.getDrinks(), evnDets.getDessert(), evnDets.getThemeType(), evnDets.getCusName(), evnDets.getCusSurname(), evnDets.getCusPhoneNumber(), evnDets.getCost()));
        
        Iterator itr = newOrder.iterator();
        while(itr.hasNext()){
            EventDetails ev = (EventDetails)itr.next();
            System.out.println("\f confirming your details:");
            System.out.println("Event Type:"+ev.eventType);    
            System.out.println("Event Time:"+ev.eventTime);  
            System.out.println("Event Date:"+ev.eventDate);  
            System.out.println("Number of Kid/s Attending:"+ev.numberOfKids);  
            System.out.println("Number of Adult/s Attending:"+ev.numberOfAdults);  
            System.out.println("Adult meals:"+ev.adultMeals);  
            System.out.println("Kid meals:"+ev.kidMeals);  
            System.out.println("drinks:"+ev.drinks);  
            System.out.println("desserts:"+ev.dessert);
            System.out.println("Event Theme:"+ev.themeType);         
            System.out.println("Your Name:"+ev.cusName);  
            System.out.println("Your Surname:"+ev.cusSurname);  
            System.out.println("Your Phone Number:"+ev.cusPhoneNumber);  
            System.out.println("Event Cost:"+ev.cost);  
        }
          
        System.out.println("would you like to confirm your details \n1.yes \n2.no");
        int yesNo = scan.nextInt();

        switch(yesNo){
            case 1:
                evnDets.setEventConfirmed("yes");
            case 2:
                evnDets.setEventConfirmed("no");
        }
    }


}
