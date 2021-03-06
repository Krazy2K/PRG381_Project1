package BusinessLogic;

public class costCalculator {
   // This page will calculate the cost of the event for the user.
   

   public static void Calculator() 
   {
       //Using static values to calculate cost (testing purposes)

   float desertCost = 20;
   float mainMealCost = 50;
   float drinksCost = 30;
   float starterCost = 20;

   float TotalCost = desertCost + mainMealCost + drinksCost + starterCost;

       System.out.println(TotalCost);

        // Calling the menuDetails method that contains what all the user wants
       MenuMethods myMenu = new MenuMethods();
       myMenu.menuDetails();
   }
}
