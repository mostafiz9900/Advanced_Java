package beSkilled.dao;

import beSkilled.domain.Student;
import java.util.List;

public interface StudentDao {

    void createTable();

    void insert(Student s);

    void update(Student s);

    void delete(Student s);

    Student getById(Student s);

    List<Student> getStrdents();

}
