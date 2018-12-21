
package university;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionDataBase {
    static Connection conn =null;
    static String encoding = "?useUnicode=yes&characterEncoding=UTF-8";
    static String dbname="jdbc:mysql://localhost/university";
    static String dbNameWithENcoding=dbname+encoding;
    static String user="mahmoud";
    static String password="mahmoud";
    public static Connection connect()
    {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection(dbNameWithENcoding,user,password);
              //  JOptionPane.showMessageDialog(null,"connected");
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            System.err.print(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
