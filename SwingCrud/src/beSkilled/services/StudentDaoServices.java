package beSkilled.services;

import beSkilled.connection.DbConnection;
import beSkilled.dao.StudentDao;
import beSkilled.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentDaoServices implements StudentDao {

    Connection con = DbConnection.getConnection("xe", "hr", "hr");

    @Override
    public void insert(Student s) {
       
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createTable() {
        PreparedStatement ps=con.prepareStatement("create table student (in number(5))")
    }

}
