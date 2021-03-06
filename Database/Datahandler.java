//connects to SQL
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Datahandler {
    //connection url
    static String connectionUrl = "jdbc:sqlserver://\\sqlexpress.Delicious-Catering.windows.net:1433;" + "database=Delicious-Catering;"
                + "user=sa;"+"password=1234;" + "trustServerCertificate=false;" + "loginTimeout=30;";   

    
    public void UpdateDB(int BookingNumber, String MealTypeAdults, String MealTypeKids ) {
        

        String insertSql = "UPDATE dbo.Booking_System SET MealTypeAdults = '"+MealTypeAdults+"', MealTypeKids = '"+MealTypeKids+"' WHERE BookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
        //testing that we our connection is successfull
        
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
                //execute sql command
            prepsInsertProduct.execute();
            // Retrieve the generated key from the insert. 
            resultSet = prepsInsertProduct.getGeneratedKeys();

            // Print the ID of the inserted row. 
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1));
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    // add data to database method
    public void insertDataToDB(String EventType, String EventDate, String EventTime, String VenueAddress, int NumberOfKids, int NumberOfAdults, String MealTypeAdults, String MealTypeKids, String Drinks, String Deserts, String ThemeType, String Name, String Surname, String PhoneNumber, float Cost, String EventConfirmation) {

        String insertSql = "INSERT INTO dbo.Booking_System(EventType, EventDate, EventTime, VenueAddress, NumberOfKids, NumberOfAdults, MealTypeAdults, MealTypeKids, Drinks, Deserts, ThemeType, Name, Surname, PhoneNumber, Cost, EventConfirmation) VALUES "
                + "('"+EventType+"', '"+EventDate+"', '"+EventTime+"', '"+VenueAddress+"', '"+NumberOfKids+"', '"+NumberOfAdults+"', '"+MealTypeAdults+"', '"+MealTypeKids+"', '"+Drinks+"', '"+Deserts+"', '"+ThemeType+"', '"+Name+"', '"+Surname+"', '"+PhoneNumber+"', '"+Cost+"', '"+EventConfirmation+"');";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
        //insert statement
        //comparible to sql command
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsertProduct.execute();
            System.out.println("executing");
            // Retrieve the generated key from the insert. if null then not successfull, if 1 then successfull
            resultSet = prepsInsertProduct.getGeneratedKeys();

            // Print the ID of the inserted row.number of rows?
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1));
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
//<<<<<<< HEAD
        // This is my branc now!
//=======
    

    //view ticket
    public void View(int BookingNumber){
//>>>>>>> master

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
            String SQL = "SELECT * FROM dbo.Booking_System WHERE BookingNumber='"+BookingNumber+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("BookingNumber") + " " + rs.getString("EventType")+ " " + rs.getString("EventDate")+ " " + rs.getString("EventTime")+ " " + rs.getString("VenueAddress")+ " " + rs.getString("NumberOfKids")+ " " + rs.getString("NumberOfAdults")+ " " + rs.getString("Drinks")+ " " + rs.getString("Deserts")+ " " + rs.getString("ThemeType")+ " " + rs.getString("Name")+ " " + rs.getString("Surname")+ " " + rs.getString("PhoneNumber")+ " " + rs.getString("Cost")+ " " + rs.getString("EventConfirmation"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ViewConfirm(String evenc){

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
            String SQL = "SELECT * FROM dbo.Booking_System WHERE EventConfirmation= '"+evenc+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("BookingNumber") + " " + rs.getString("EventType")+ " " + rs.getString("EventDate")+ " " + rs.getString("EventTime")+ " " + rs.getString("VenueAddress")+ " " + rs.getString("NumberOfKids")+ " " + rs.getString("NumberOfAdults")+ " " + rs.getString("Drinks")+ " " + rs.getString("Deserts")+ " " + rs.getString("ThemeType")+ " " + rs.getString("Name")+ " " + rs.getString("Surname")+ " " + rs.getString("PhoneNumber")+ " " + rs.getString("Cost")+ " " + rs.getString("EventConfirmation"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ViewAdmin(){

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
            String SQL = "SELECT * FROM dbo.Booking_System";
            ResultSet rs = stmt.executeQuery(SQL);
            

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("BookingNumber") + " " + rs.getString("EventType")+ " " + rs.getString("EventDate")+ " " + rs.getString("EventTime")+ " " + rs.getString("VenueAddress")+ " " + rs.getString("NumberOfKids")+ " " + rs.getString("NumberOfAdults")+ " " + rs.getString("Drinks")+ " " + rs.getString("Deserts")+ " " + rs.getString("ThemeType")+ " " + rs.getString("Name")+ " " + rs.getString("Surname")+ " " + rs.getString("PhoneNumber")+ " " + rs.getString("Cost")+ " " + rs.getString("EventConfirmation"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // public static void main(String[] args){
    //     //testing that we our connection is successfull
    //     //insertDataToDB("wedding", "06/06/99", "12", "Home", 3, 2, "Bread", "Kids meal", "Coke", "pudding", "dark", "Admin", "Nhlabathi", "0849879510", 3000, "Yes");
    // }
}