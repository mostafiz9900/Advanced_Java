
package beSkilled.Services;


import beSkilled.Jbconnect;
import beSkilled.dao.CommonDao;
import beSkilled.doman.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmployeesServices implements CommonDao{
    Connection con=Jbconnect.getConnection("xe", "hr", "hr");
    @Override
    public  List<?> getList() {
        List<Employees> list=new ArrayList<>();
       //Employees em=new Employees();
       Employees em;
        try {
            PreparedStatement ps=con.prepareStatement("select * from employees");
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                em=new Employees();
                 em.setId(Integer.parseInt(rs.getString(1)));
                 em.setName(rs.getString(2));
                 list.add(em);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeesServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
