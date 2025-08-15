
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class score {

 public void insertUpdateDeleteScore( char operation, Integer Sid, 
          Integer Cid, Double scr, String Description) 
  {
       Connection con = MyConnection.getConnection();
        PreparedStatement ps= null;
        
        //i for insert
        if(operation == 'i'){
            
        try{
            
            ps = con.prepareStatement("INSERT INTO `score`(`student_id`, `course_id`, `student_score`, `description`) VALUES (?,?,?,?)");
           
            ps.setInt(1,Sid);
             ps.setInt(2,Cid);
              ps.setDouble(3,scr);
              ps.setString(4,Description);
           
            
            if(ps.executeUpdate() > 0)
            {
                
                JOptionPane.showMessageDialog(null," New Score is inserted");
            }
            
          
        }catch(SQLException ex){
            
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }   
        }
 
        
        if(operation == 'u')//u for update
        {
            
        try{
            
            ps = con.prepareStatement("UPDATE `score` SET `student_score`=?,`description`=? WHERE `student_id`=? AND `course_id`=?");
            ps.setDouble(1,scr);
            ps.setString(2,Description);
             ps.setInt(3,Sid);
                 ps.setInt(4,Cid);
            if(ps.executeUpdate() > 0)
            {
                
                JOptionPane.showMessageDialog(null,"Score is  update");
            }
            
          
        }catch(SQLException ex){
            
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }   
        }
        
        if(operation == 'D'){
            
        try{
            
            ps = con.prepareStatement("DELETE FROM `score` WHERE `student_id`=? AND `course_id`=?");
           
            ps.setInt(1,Sid);
             ps.setInt(2,Cid);
           
            
            if(ps.executeUpdate() > 0)
            {
                
                JOptionPane.showMessageDialog(null,"Score is Deleted");
            }
            
          
        }catch(SQLException ex){
            
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }   
       } 
        
      }
 public void fillScoreJtable(JTable table){
       Connection con = MyConnection.getConnection();
        PreparedStatement ps= null;
      try {
          ps = con.prepareStatement("SELECT * FROM `score`");
          
          
          ResultSet rs = ps.executeQuery();
          DefaultTableModel model = (DefaultTableModel)table.getModel();
          
          Object[] row;
          while(rs.next()){
              row = new Object[4];
              row[0] = rs.getInt(1);
              row[1] = rs.getInt(2);
              row[2] = rs.getDouble(3);
              row[3] = rs.getString(4);
              
              model.addRow(row);
              
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(New_student.class.getName()).log(Level.SEVERE, null, ex);
      }
        
  }
}
  