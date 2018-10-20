package beSkilled;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST = "jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection;
    private static String url = HOST + ":" + PORT + ":";
    
    
     public static Connection getConnection(String dbname, String dbUserName, String dbPass){
        String dbName;
        try {
            connection =DriverManager.getConnection(url + dbname, dbUserName,dbPass);
            System.out.println("::Conneted::");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
     }
    

}
