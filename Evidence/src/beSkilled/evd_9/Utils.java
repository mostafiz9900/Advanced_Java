/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mostafizur
 */
public class Utils {

    public static void writeTofile(String filename, List<Student> student) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("Crest a new file");
                destFile.createNewFile();

            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : student) {
                out.append(s.getId() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getPass() + ", " + s.getGender() + ", " + s.getSub() + ", " + s.getRound() + ", " + s.getAge() + ", " + s.getNote() + "\n");

            }
            out.close();

        } catch (IOException e) {
            System.out.println("colde not write");
        }

    }

    public static void readFromfile(String filename, DefaultTableModel model) {
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
