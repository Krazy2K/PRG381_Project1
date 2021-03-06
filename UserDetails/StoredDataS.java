package UserDetails;

import java.io.*;

public class StoredDataS {
    public static final File file = new File("UserData.ser");
    public static void main(String[] args) throws IOException
  {
    User user = new User();
    user.setUsername("tpage");
    user.setPassword("password123");
 
    //File file = new File("C:\\testFile.txt");
    OutputStream fileOutputStream = new FileOutputStream(file);
    ObjectOutput outputStream = new ObjectOutputStream(fileOutputStream);
    outputStream.writeObject(user);
    //password stored in new folder
    System.out.println("You have been successfully registered on: " + file.getName());
    outputStream.close();
  }
    
}
