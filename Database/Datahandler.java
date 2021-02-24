//connects to SQL
package Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datahandler {
// github connection to db
        // temporary
        //still need to workout connection to sql
     static String connectionUrl = "jdbc:sqlserver://yourserver.database.windows.net:1433;"
            + "database=Delicious-Catering;" + "user=yourusername@yourserver;" + "password=yourpassword;"
            + "encrypt=true;" + "trustServerCertificate=false;" + "loginTimeout=30;";
    //add data to database method
    static void insertDataToDB(String EventType, Date EventDate, Time EventTime, String VenueAddress, int NumberOfKids, int NumberOfAdults, String MealTypeAdults, String MealTypeKids, String Drinks, String Deserts, String ThemeType, String Name, String Surname, String PhoneNumber, float Cost, String EventConfirmation) {

        String connectionUrl = "jdbc:sqlserver://yourserver.database.windows.net:1433;" + "database=dbo.Booking System;"
                + "user=yourusername@yourserver;" + "password=yourpassword;" + "encrypt=true;"
                + "trustServerCertificate=false;" + "loginTimeout=30;";

        String insertSql = "INSERT INTO dbo.Booking System (EventType, EventDate, EventTime, VenueAddress, NumberOfKids, NumberOfAdults, MealTypeAdults, MealTypeKids, Drinks, Deserts, ThemeType, Name, Surname, PhoneNumber, Cost, EventConfirmation) VALUES "
                + "('"+EventType+"', '"+EventDate+"', '"+EventTime+"', '"+VenueAddress+"', '"+NumberOfKids+"', '"+NumberOfAdults+"', '"+MealTypeAdults+"', '"+MealTypeKids+"', '"+Drinks+"', '"+Deserts+"', '"+ThemeType+"', '"+Name+"', '"+Surname+"', '"+PhoneNumber+"', '"+Cost+"',, '"+EventConfirmation+"');";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

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
        // Hello there Luke

    }
}