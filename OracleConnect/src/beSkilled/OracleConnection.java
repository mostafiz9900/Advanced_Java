package beSkilled;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OracleConnection {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employees");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+ rs.getString(2)+rs.getString(3));                
                con.close();
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
