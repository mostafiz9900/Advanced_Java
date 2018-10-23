package beSkilled.test;

import beSkilled.dao.StudentDao;
import beSkilled.domain.Student;
import beSkilled.services.StudentDaoServices;

public class Test {

    public static void main(String[] args) {
        String sq = "create table student2(id number(5) primary key, name varchar2(55))";
        StudentDao obj = new StudentDaoServices();
        //obj.createTable(sq);

        Student student = new Student();
        student.setId(3);
        student.setName("Mahabub");
        obj.insert(student);

        for (Student st : obj.getStrdents()) {
            System.out.println(" ID : " + st.getId() + " Name " + st.getName());

        }
    }
}
