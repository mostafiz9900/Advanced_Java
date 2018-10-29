package beSkilled;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Utils {

    public static void writeTofile(String filename, List<Student> students) throws Exception {
        
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We had to make a new file");
                destFile.createNewFile();

            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getName() + " , " + s.getEmail() + " , " + s.getAge() + " , " + s.getGender() + "," + s.getHobby() + s.getRound() + "," + s.getNote());

            }
        } catch (Exception e) {
        }

    }

    public static void displayStudentsdataFromFile(String filename, DefaultTableModel mode1) {
        String line;
        BufferedReader reader;
        try {
            reader = BufferedReader(new File(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                mode1.addRow(line.split(","));

            }
            reader.close();
        } catch (Exception e) {
        }
    }

    private static BufferedReader BufferedReader(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
