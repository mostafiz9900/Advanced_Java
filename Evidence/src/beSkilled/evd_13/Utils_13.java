/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class Utils_13 {

    public static void writeToFile(String filename, List<Student> student) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("Creat a new file");
                destFile.createNewFile();

            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : student) {
                out.append(s.getId() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getPass() + ", " + s.getGender() + ", " + s.getSubj() + ", " + s.getRound() + "\n");

            }
            out.close();
        } catch (Exception e) {
        }

    }

    public static void readFromFile(String filename, DefaultTableModel model) {
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
