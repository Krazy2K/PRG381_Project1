package BusinessLogic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Updates {
    EventDetails details = new EventDetails();
    public void updateDate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Order number: ");
        int orderNumber = scan.nextInt();
        System.out.print("Enter the year of the event (yyyy)");
        int year = scan.nextInt();
        System.out.print("Enter the month of the event (mm)");
        int month = scan.nextInt();
        System.out.print("Enter the day of the event (dd)");
        int day = scan.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        details.UpdateDate(orderNumber, date.toString());
        scan.close();
    }
    public void updateTime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Order number: ");
        int orderNumber = scan.nextInt();
        System.out.print("Enter the year of the event (hh)");
        int hour = scan.nextInt();
        System.out.print("Enter the month of the event (mm)");
        int minute = scan.nextInt();
        LocalTime time = LocalTime.of(hour, minute);
        details.UpdateTime(orderNumber, time.toString());
        scan.close();
    }
    public void updatevenuAddress(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Order number: ");
        int orderNumber = scan.nextInt();
        System.out.print("enter the new address number: ");
        String AddressNumb = scan.next();
        System.out.print("enter the new address street: ");
        String AddressStreet = scan.next();
        System.out.print("enter the new address suburb: ");
        String AddressSuburb = scan.next();
        String Address =AddressNumb+" "+AddressStreet+" "+AddressSuburb;
        details.UpdateVAddress(orderNumber, Address);
        scan.close();
    }
    public void updatenumbAdultsKids(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Order number: ");
        int orderNumber = scan.nextInt();
        System.out.print("enter the amount of Adults attending the event: ");
        int adultCount = scan.nextInt();
        System.out.print("enter the amount of Kids attending the event: ");
        int kidCount = scan.nextInt();
        String NewAdults = String.valueOf(adultCount);
        String NewKids = String.valueOf(kidCount);
        details.UpdateNofKidsAdults(orderNumber, NewKids, NewAdults);
        scan.close();
    }
    public void updateConfirm(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Order number: ");
        int orderNumber = scan.nextInt();
        System.out.print("State confirmation to yes or no");
        String confirm = scan.next();
        details.UpdateConfirmation(orderNumber, confirm);
        scan.close();
    }
}
