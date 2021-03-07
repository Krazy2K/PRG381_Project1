package BusinessLogic;

import java.util.Scanner;

public class changesMade {
   public void makingChanges(){
       Scanner scan = new Scanner(System.in);
       Updates details = new Updates();
       MenuMethods meth = new MenuMethods();

       System.out.println("what would you like to change: ");
       System.out.println("1.Date\n2.Time\n3.Venue Address\n4.Number of adults and kids\n5.Confirm all\n6.Done");
       int choice = scan.nextInt();

       while (choice!=6) {
            switch (choice) {
                case 1:{
                    details.updateDate();
                break;
                }
                case 2:{
                    details.updateTime();
                break;
                }
                case 3:{
                    details.updatevenuAddress();
                break;
                }
                case 4:{
                    details.updatenumbAdultsKids();
                break;
                }
                case 5:{
                    meth.eventConfirm();
                break;
                }
                default:{
                    System.out.println("Not an option. to make any other changes please contact the store directly ");
                    break;
                }
                
            } 
            
            System.out.println("what else would you like to change: ");
            System.out.println("1.Date\n2.Time\n3.Venue Address\n.4Number of adults and kids\n.5Confirm all\n6.Done");
            choice = scan.nextInt();
       }
       scan.close();
   } 
}
