package beSkilled.services;

import beSkilled.connection.DbConnection;
import beSkilled.dao.StudentDao;
import beSkilled.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDaoServices implements StudentDao {

    Connection con = DbConnection.getConnection("xe", "mkt", "mkt");

    @Override
    public void insert(Student s) {
        try {

            PreparedStatement ps = con.prepareStatement("insert into student(id, name) values(?,?)");
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.executeUpdate();
            System.out.println("One data has been inserted ");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoServices.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getStrdents() {
        List<Student> list = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement("select * from student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student();
                st.setId(rs.getInt(1));
                st.setName(rs.getNString(2));
                list.add(st);

            }

            System.out.println("One data has been inserted ");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void createTable(String sql) {
        try {
            //PreparedStatement ps = con.prepareStatement("create table student (id number(5) primary key, name varchar2(55)");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("One table has been Create ");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
