//connects to SQL
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datahandler {

    // github connection to db
    // temporary
    // still need to workout connection to sql
    static String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "database=Delicious-Catering;"
            + "user=SHAMZA-BOSS@sqlexpress;" + "encrypt=true;" + "trustServerCertificate=false;" + "loginTimeout=30;";

         // String connectionUrl = "jdbc:sqlserver://yourserver.database.windows.net:1433;" + "database=dbo.Booking System;"
        //         + "user=yourusername@yourserver;" + "password=yourpassword;" + "encrypt=true;"
        //         + "trustServerCertificate=false;" + "loginTimeout=30;";   

    
    static void UpdateDB(int BookingNumber, String MealTypeAdults, String MealTypeKids ) {
        

        String insertSql = "UPDATE dbo.Booking System SET MealTypeAdults = '"+MealTypeAdults+"', MealTypeKids = '"+MealTypeKids+"'";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
        
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
    static void insertDataToDB(String EventType, String EventDate, String EventTime, String VenueAddress, int NumberOfKids, int NumberOfAdults, String MealTypeAdults, String MealTypeKids, String Drinks, String Deserts, String ThemeType, String Name, String Surname, String PhoneNumber, float Cost, String EventConfirmation) {

        String insertSql = "INSERT INTO dbo.Booking System (EventType, EventDate, EventTime, VenueAddress, NumberOfKids, NumberOfAdults, MealTypeAdults, MealTypeKids, Drinks, Deserts, ThemeType, Name, Surname, PhoneNumber, Cost, EventConfirmation) VALUES "
                + "('"+EventType+"', '"+EventDate+"', '"+EventTime+"', '"+VenueAddress+"', '"+NumberOfKids+"', '"+NumberOfAdults+"', '"+MealTypeAdults+"', '"+MealTypeKids+"', '"+Drinks+"', '"+Deserts+"', '"+ThemeType+"', '"+Name+"', '"+Surname+"', '"+PhoneNumber+"', '"+Cost+"',, '"+EventConfirmation+"');";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
        //insert statement
        //comparible to sql command
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsertProduct.execute();
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

    //view ticket
    static void View(int BookingNumber){

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM dbo.Booking System WHERE BookingNumber='"+BookingNumber+"'";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        //testing that we our connection is successfull
        insertDataToDB("wedding", "06/06/99", "12", "Home", 3, 2, "Bread", "Kids meal", "Coke", "pudding", "dark", "Admin", "Nhlabathi", "0849879510", 3000, "Yes");
    }
}