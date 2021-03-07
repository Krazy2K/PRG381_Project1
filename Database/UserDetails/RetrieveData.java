package Database.UserDetails;

import java.io.*;

public class RetrieveData {
    public static final File file = new File("UserData.ser");
    //returns userpassword from UserData.ser
    public String getPassword() throws Exception {
            User userData = new User();
            FileInputStream fos = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fos);
    
            userData = (User) ois.readObject();
            ois.close();
            fos.close();
    
            System.out.println("Data retrieved");
            return userData.getPassword();
    }
    //returns userName from UserData.ser
    public String getUsername() throws Exception{
        User userData = new User();
        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fos);
    
        userData = (User) ois.readObject();
        ois.close();
        fos.close();
        System.out.println("Data retrieved");
        String username = userData.getUsername();
        return username;        
    }
    
}
