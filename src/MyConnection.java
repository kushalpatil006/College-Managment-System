
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyConnection {
    public static Connection getConnection()
    {
    
        Connection con = null;

            try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 System.out .println("yes");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3308/studentdb", "root",""); 
                 System.out .println("driver is yes");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return con;
        
    }
 }
    

