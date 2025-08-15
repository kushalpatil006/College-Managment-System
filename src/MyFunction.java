
import java.sql.*;
public class MyFunction {
    public static int countData(String tableName){
            int total =0;
       
            try{
                Connection con = MyConnection.getConnection();
                 Statement st;
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
                while(rs.next()){
                    total= rs.getInt(1);
                }
            }catch(SQLException ex){
                
            }
            
            
            
            
       
         return total;
        
    }
}

