/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {

    public static void writeTofile(String filename, List<Student> students) throws Exception {
        File destFile = new File(filename + ".txt");
        if (destFile.exists() == false) {
            System.out.println("Creat a new File");
            destFile.createNewFile();

        }
        PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
        for (Student s : students) {
            out.append(s.getName() + ", " + s.getEmail() + ", " + s.getPass() + ", " + s.getGender() + ", " + s.getSub() + ", " + s.getRound() + "\n");

        }
        out.close();
    }

    public static void readFormfile(String filename, DefaultTableModel model) {
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
}
