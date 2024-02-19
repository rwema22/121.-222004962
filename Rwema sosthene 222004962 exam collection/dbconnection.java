
package exam_collection;

import java.sql.Connection;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.awt.Component;
import static java.lang.System.out;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author rwema
 */


public class dbconnection {
    
    public static Connection connect(){
        Connection con = null;
        
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            
            Component rootPane=null;
            
            out.println("connect");
            
        }catch(Exception ex){
             
            showMessageDialog(null,ex);
        }
        return con;
    }
}
