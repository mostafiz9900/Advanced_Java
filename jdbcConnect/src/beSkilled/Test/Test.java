package beSkilled.Test;

import beSkilled.Services.EmployeesServices;
import beSkilled.dao.CommonDao;
import beSkilled.doman.Employees;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        CommonDao emDao = new EmployeesServices();
        List<Employees> list = (List<Employees>) emDao.getList();
        for (Employees e : list) {
            System.out.println(e.getId() + " " + e.getName());
        }

    }
}
