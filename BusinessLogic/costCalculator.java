package BusinessLogic;

public class costCalculator {
   // This page will calculate the cost of the event for the user.
   

   public static void Calculator() 
   {
       //Using static values to calculate cost (testing purposes)
        EventDetails even = new EventDetails();
        float totalCosts = 0;
        float desertCost = 20;
        float kidMealCost = 20;
        float drinksCost = 30;
        float adultMealCost = 50;

        String drinks = even.getDrinks();
        String dessert = even.getDessert();
        String kidMeal = even.getKidMeals();
        String adultMeal = even.getAdultMeals();
        int kidCount = even.getNumberOfKids();
        int adultCount = even.getNumberOfAdults();


        if (drinks.equalsIgnoreCase("yes")) {
            totalCosts+= drinksCost*(kidCount+adultCount);
        } 
        if (dessert.equalsIgnoreCase("yes")) {
            totalCosts+=desertCost*(kidCount+adultCount);
        } 
        if (kidMeal.equalsIgnoreCase("yes")) {
            totalCosts+=kidMealCost*kidCount;
        } 
        if (adultMeal.equalsIgnoreCase("yes")) {
            totalCosts+=adultMealCost*adultCount;
        } 
        else {
            
        }
        even.setCost(totalCosts);
   }
}
