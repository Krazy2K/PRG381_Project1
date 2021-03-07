//connects to SQL
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Datahandler {
    static String connectionUrl = "jdbc:sqlserver://\\sqlexpress.Delicious-Catering.windows.net:1433;" + "database=Delicious-Catering;"
                + "user=sa;"+"password=1234;" + "trustServerCertificate=false;" + "loginTimeout=30;";   

    
    public void UpdateDB(int BookingNumber, String MealTypeAdults, String MealTypeKids ) {
        

        String insertSql = "UPDATE dbo.Booking_System SET MealTypeAdults = '"+MealTypeAdults+"', MealTypeKids = '"+MealTypeKids+"' WHERE BookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Updated orderNumber: " + BookingNumber+" Successfully");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    public void UpdateDate(int BookingNumber, String EventDate) {
        

        String insertSql = "UPDATE dbo.Booking_System SET EventDate = '"+EventDate+"' WHERE BookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Updated orderNumber: " + BookingNumber+" Successfully And Event date to "+EventDate+"");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    public void UpdateConfirmation(int BookingNumber, String Confirmed) {
        

        String insertSql = "UPDATE dbo.Booking_System SET EventConfirmation = '"+Confirmed+"' WHERE BookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Updated orderNumber: " + BookingNumber+" Successfully And EventConfirmation to "+Confirmed+"");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    public void UpdateTime(int BookingNumber, String EventTime) {
        

        String insertSql = "UPDATE dbo.Booking_System SET EventTime = '"+EventTime+"' WHERE BookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Updated orderNumber: " + BookingNumber+" Successfully And Event time to "+EventTime+"");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    public void UpdateVAddress(int BookingNumber, String VenueAddress) {
        

        String insertSql = "UPDATE dbo.Booking_System SET  VenueAddress = '"+VenueAddress+"' WHERE BookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Updated orderNumber: " + BookingNumber+" Successfully And Address to "+VenueAddress+"");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    public void UpdateNofKidsAdults(int BookingNumber, String NumberOfKids, String NumberOfAdults) {
        

        String insertSql = "UPDATE dbo.Booking_System SET  NumberOfKids = '"+NumberOfKids+"', NumberOfAdults = '"+NumberOfAdults+"' WHERE BookBookingNumber='"+BookingNumber+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Updated orderNumber: " + BookingNumber+" Successfully");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    

    }
    public void insertDataToDB(String EventType, String EventDate, String EventTime, String VenueAddress, int NumberOfKids, int NumberOfAdults, String MealTypeAdults, String MealTypeKids, String Drinks, String Deserts, String ThemeType, String Name, String Surname, String PhoneNumber, float Cost, String EventConfirmation) {

        String insertSql = "INSERT INTO dbo.Booking_System(EventType, EventDate, EventTime, VenueAddress, NumberOfKids, NumberOfAdults, MealTypeAdults, MealTypeKids, Drinks, Deserts, ThemeType, Name, Surname, PhoneNumber, Cost, EventConfirmation) VALUES "
                + "('"+EventType+"', '"+EventDate+"', '"+EventTime+"', '"+VenueAddress+"', '"+NumberOfKids+"', '"+NumberOfAdults+"', '"+MealTypeAdults+"', '"+MealTypeKids+"', '"+Drinks+"', '"+Deserts+"', '"+ThemeType+"', '"+Name+"', '"+Surname+"', '"+PhoneNumber+"', '"+Cost+"', '"+EventConfirmation+"');";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsertProduct.execute();
            System.out.println("executing");
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Your orderNumber: " + resultSet.getString(1));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //view ticket
    public void View(int BookingNumber){

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
            String SQL = "SELECT * FROM dbo.Booking_System WHERE BookingNumber='"+BookingNumber+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println("1.BookingNumber: "+rs.getString("BookingNumber") + "\n2.Event Type: " + rs.getString("EventType")+ "\n3.Event Date " + rs.getString("EventDate")+ "\n4.EventTime: " + rs.getString("EventTime")+ "\n5.VenueAddress: " + rs.getString("VenueAddress")+ "\n6.Number of kids: " + rs.getString("NumberOfKids")+ "\n7.Number of adults: " + rs.getString("NumberOfAdults")+ "\n8.Drinks " + rs.getString("Drinks")+ "\n9.Desserts " + rs.getString("Deserts")+ "\n10.Theme: " + rs.getString("ThemeType")+ "\n11.Name " + rs.getString("Name")+ "\n12.Surame " + rs.getString("Surname")+ "\n13.Phone " + rs.getString("PhoneNumber")+ "\n14.Cost " + rs.getString("Cost")+ "\n15.Confirmed " + rs.getString("EventConfirmation"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ViewConfirm(String evenc){

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
            String SQL = "SELECT * FROM dbo.Booking_System WHERE EventConfirmation= '"+evenc+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println("\t"+rs.getString("BookingNumber") + " " +"\t"+ rs.getString("EventType")+ " " +"\t"+ rs.getString("EventDate")+ " " +"\t"+ rs.getString("EventTime")+ " " +"\t"+ rs.getString("VenueAddress")+ " " +"\t"+ rs.getString("NumberOfKids")+ " " +"\t"+ rs.getString("NumberOfAdults")+ " " +"\t"+ rs.getString("Drinks")+ " " +"\t"+ rs.getString("Deserts")+ " " +"\t"+ rs.getString("ThemeType")+ " " +"\t"+ rs.getString("Name")+ " " +"\t"+ rs.getString("Surname")+ " " +"\t"+ rs.getString("PhoneNumber")+ " " +"\t"+ rs.getString("Cost")+ " " +"\t"+ rs.getString("EventConfirmation"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ViewAdmin(){

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
            String SQL = "SELECT * FROM dbo.Booking_System";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println("\t"+rs.getString("BookingNumber") + " " +"\t"+ rs.getString("EventType")+ " " +"\t"+ rs.getString("EventDate")+ " " +"\t"+ rs.getString("EventTime")+ " " +"\t"+ rs.getString("VenueAddress")+ " " +"\t"+ rs.getString("NumberOfKids")+ " " +"\t"+ rs.getString("NumberOfAdults")+ " " +"\t"+ rs.getString("Drinks")+ " " +"\t"+ rs.getString("Deserts")+ " " +"\t"+ rs.getString("ThemeType")+ " " +"\t"+ rs.getString("Name")+ " " +"\t"+ rs.getString("Surname")+ " " +"\t"+ rs.getString("PhoneNumber")+ " " +"\t"+ rs.getString("Cost")+ " " +"\t"+ rs.getString("EventConfirmation"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String viewDate(int BookingNumber) throws SQLException {
        Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();
        String SQL = "SELECT EventDate FROM dbo.Booking_System WHERE BookingNumber = '"+BookingNumber+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            String date = "";
            while (rs.next()) {
                date = rs.getString("EventDate");
            }
            
            
            return date;
    }
}