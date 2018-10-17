
package beSkilled;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class CommonMenu {

   
    public static void main(String[] args) {
        JFrame f=new JFrame("Common Menu");
        JMenuBar jMenuBar=new JMenuBar();
        JMenu file=new JMenu("File");
        jMenuBar.add(file);
        
        JMenu help=new JMenu("Help");
        jMenuBar.add(help);
        
        JMenu about=new JMenu("About");
        jMenuBar.add(about);
        
        
        
       // JMenuBar item1=new JMenuBar("New");
        
       
        
        
        
        
        
        f.setBounds(10, 20, 400, 250);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        
        f.setJMenuBar(jMenuBar);
    }
    
}
