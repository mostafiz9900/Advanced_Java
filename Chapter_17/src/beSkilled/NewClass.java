/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class NewClass {

    static JFrame aWindow = new JFrame("This is the Window Title");

    public static void main(String[] args) {
        int windowWidth = 400;
        int windowHeight = 150;
        aWindow.setBounds(400,100,windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
