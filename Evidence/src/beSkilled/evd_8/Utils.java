/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mostafizur
 */
public class Utils {

    public static void writeToFile(String[] filename, List<Student> students) throws Exception {
        File destFile = new File(filename + ".txt");
        if (destFile.exists() == false) {
            System.out.println("Creat a new file");
            destFile.createNewFile();

        }
        PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
        for (Student s : students) {
            out.append(s.getName() + ", " + s.getEmail() + ", " + s.getPass() + ", " + s.getGender() + ", " + s.getSub() + ", " + s.getRound() + "\n");

        }
        out.close();

    }

    public static void readFormFile(String[] filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));

            }
            reader.close();
        } catch (Exception e) {
        }
    }

    static void readFormFile(String student, DefaultTableModel tableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void writeToFile(String student, List<Student> students) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
