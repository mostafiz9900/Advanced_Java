/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_3;

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

    public static void writeTofile(String fileName, List<Student> students) throws Exception {
        File destFile = new File(fileName + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We had to make a new file");
                destFile.createNewFile();

            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getId() + "," + s.getName() + "," + s.getEmail() + "," + s.getPassWord() + "," + s.getAge() + "," + s.getGender() + "," + s.getHobby() + "," + s.getMessage() + "\n");

            }
            out.close();
        } catch (Exception e) {
        }

    }

    public static void displayStudentsDataFromFile(String fileName, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(","));

            }
            reader.close();
        } catch (Exception e) {
        }
    }
}
