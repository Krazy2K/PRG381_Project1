package BusinessLogic;

import Database.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventDetails {
    String eventType;
    LocalDate eventDate;
    LocalTime eventTime;
    String venueAdress;
    int numberOfKids;
    int numberOfAdults;
    String adultMeals;
    String kidMeals;
    String drinks; 
    String dessert; 
    String themeType;
    String cusName;
    String cusSurname;
    String cusPhoneNumber;
    float cost;
    String eventConfirmed;

    public EventDetails(){

    }

    public EventDetails(String eventType, LocalDate eventDate, LocalTime eventTime, String venueAdress, int numberOfKids,
            int numberOfAdults, String adultMeals, String kidMeals, String drinks, String dessert, String themeType,
            String cusName, String cusSurname, String cusPhoneNumber, float cost, String eventConfirmed) {
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venueAdress = venueAdress;
        this.numberOfKids = numberOfKids;
        this.numberOfAdults = numberOfAdults;
        this.adultMeals = adultMeals;
        this.kidMeals = kidMeals;
        this.drinks = drinks;
        this.dessert = dessert;
        this.themeType = themeType;
        this.cusName = cusName;
        this.cusSurname = cusSurname;
        this.cusPhoneNumber = cusPhoneNumber;
        this.cost = cost;
        this.eventConfirmed = eventConfirmed;
    }
    public EventDetails(String eventType, LocalDate eventDate, LocalTime eventTime, String venueAdress, int numberOfKids,
            int numberOfAdults, String adultMeals, String kidMeals, String drinks, String dessert, String themeType,
            String cusName, String cusSurname, String cusPhoneNumber, float cost) {
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venueAdress = venueAdress;
        this.numberOfKids = numberOfKids;
        this.numberOfAdults = numberOfAdults;
        this.adultMeals = adultMeals;
        this.kidMeals = kidMeals;
        this.drinks = drinks;
        this.dessert = dessert;
        this.themeType = themeType;
        this.cusName = cusName;
        this.cusSurname = cusSurname;
        this.cusPhoneNumber = cusPhoneNumber;
        this.cost = cost;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getVenueAdress() {
        return venueAdress;
    }

    public void setVenueAdress(String venueAdress) {
        this.venueAdress = venueAdress;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public String getAdultMeals() {
        return adultMeals;
    }

    public void setAdultMeals(String adultMeals) {
        this.adultMeals = adultMeals;
    }

    public String getKidMeals() {
        return kidMeals;
    }

    public void setKidMeals(String kidMeals) {
        this.kidMeals = kidMeals;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getThemeType() {
        return themeType;
    }

    public void setThemeType(String themeType) {
        this.themeType = themeType;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusSurname() {
        return cusSurname;
    }

    public void setCusSurname(String cusSurname) {
        this.cusSurname = cusSurname;
    }

    public String getCusPhoneNumber() {
        return cusPhoneNumber;
    }

    public void setCusPhoneNumber(String cusPhoneNumber) {
        this.cusPhoneNumber = cusPhoneNumber;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String isEventConfirmed() {
        return eventConfirmed;
    }

    public void setEventConfirmed(String eventConfirmed) {
        this.eventConfirmed = eventConfirmed;
    }

    public void saveToDb(){
        Datahandler save = new Datahandler();
        save.insertDataToDB(eventType, eventDate.toString(), eventTime.toString(), venueAdress, numberOfKids, numberOfAdults, adultMeals, kidMeals, drinks, dessert, themeType, cusName, cusSurname, cusPhoneNumber, cost, eventConfirmed);
    }

    public void DisplayAll(){
        Datahandler vAll = new Datahandler();
        vAll.ViewAdmin();
    }
    //Parameters need to be refactored to be included in get and set methods to increase security. Need different constructors
    public void DisplayTicket(int BookingNumber){
        Datahandler vtick = new Datahandler();
        vtick.View(BookingNumber);   
    }
    //Parameters need to be refactored to be included in get and set methods to increase security. Need different constructors
    public void DisplayConfirmed(String evenc){
        Datahandler vconfirmed = new Datahandler();
        vconfirmed.ViewConfirm(evenc);
    }

    //Parameters need to be refactored to be included in get and set methods to increase security. Need different constructors
    public void UpdateDB(int BookingNumber, String MealTypeAdults, String MealTypeKids){
        Datahandler update = new Datahandler();
        update.UpdateDB(BookingNumber, MealTypeAdults, MealTypeKids);

    }

    
}
