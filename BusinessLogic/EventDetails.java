package BusinessLogic;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventDetails {
    String eventType;
    LocalDate eventDate;
    LocalTime eventTime;
    String venueAdress;
    String numberOfKids;
    String numberOfAdults;
    String adultMeals;
    String kidMeals;
    String drinks; 
    String dessert; 
    String themeType;
    String cusName;
    String cusSurname;
    String cusPhoneNumber;
    String cost;
    String eventConfirmed;

    public EventDetails(){

    }

    public EventDetails(String eventType, LocalDate eventDate, LocalTime eventTime, String venueAdress, String numberOfKids,
            String numberOfAdults, String adultMeals, String kidMeals, String drinks, String dessert, String themeType,
            String cusName, String cusSurname, String cusPhoneNumber, String cost, String eventConfirmed) {
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
    public EventDetails(String eventType, LocalDate eventDate, LocalTime eventTime, String venueAdress, String numberOfKids,
            String numberOfAdults, String adultMeals, String kidMeals, String drinks, String dessert, String themeType,
            String cusName, String cusSurname, String cusPhoneNumber, String cost) {
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

    public String getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(String numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public String getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(String numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public String getAdultMeals() {
        return adultMeals;
    }

    public void setAdultMeals(String adultMeals) {
        this.adultMeals = adultMeals;
    }

    public String getKidMeals() {
        return adultMeals;
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String isEventConfirmed() {
        return eventConfirmed;
    }

    public void setEventConfirmed(String eventConfirmed) {
        this.eventConfirmed = eventConfirmed;
    }
}
