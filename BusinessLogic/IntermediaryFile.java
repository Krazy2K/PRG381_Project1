package BusinessLogic;

import java.util.ArrayList;

public class IntermediaryFile {
    public ArrayList<EventDetails> NewOrder(){
        ArrayList<EventDetails> newOrder = new ArrayList<>(); 
        MenuMethods menuMeth = new MenuMethods();
        EventDetails even = new EventDetails();

        menuMeth.eventType();
        menuMeth.menuDetails();
        menuMeth.numbAdultsKids();
        menuMeth.theme();
        menuMeth.venuAddress();
        menuMeth.perDetails();
        menuMeth.eventDate();
        menuMeth.eventTime();
        menuMeth.eventConfirm();

        newOrder.add(new EventDetails(even.getEventType(), even.getEventDate(), even.getEventTime(), even.getVenueAdress(), even.getNumberOfKids(), even.getNumberOfAdults(), even.getAdultMeals(), even.getKidMeals(), even.getDrinks(), even.getDessert(), even.getThemeType(), even.getCusName(), even.getCusSurname(), even.getCusPhoneNumber(), even.getCost(), even.isEventConfirmed()));


        return newOrder;
    }
}
