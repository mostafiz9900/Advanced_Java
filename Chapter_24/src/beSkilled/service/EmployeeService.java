package beSkilled.service;

import beSkilled.DbConnection;
import beSkilled.dao.CommonDao;
import beSkilled.doman.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeService implements CommonDao {

    Connection conn = DbConnection.getConnection("xe", "hr", "hr");

    @Override
    public void getList() {
        Employees em = new Employees();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from employees");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                em.setEmployeeID(Integer.parseInt(rs.getString(1)));
                em.setFirstName(rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
