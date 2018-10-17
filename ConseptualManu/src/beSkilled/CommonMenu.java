package beSkilled;

import beSkilled.view.Exit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {

    /* public static void main(String[] args) {
        JFrame f = new JFrame("Common Menu");
        getCommonMenu(f);

        // JMenuBar item1=new JMenuBar("New");
        f.setBounds(10, 20, 400, 250);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);

    }
     */
    public static void getCommonMenu(JFrame f) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        jMenuBar.add(file);

        JMenu help = new JMenu("Help");
        jMenuBar.add(help);

        JMenu about = new JMenu("About");
        jMenuBar.add(about);

        jMenuBar.add(new JMenu("Edit"));

        /* JMenuItem iteme1=new JMenuItem("New");
        JMenuItem iteme2=new JMenuItem("Open");
        JMenuItem iteme3=new JMenuItem("Exit");
         */
        JMenuItem iteme1=new JMenuItem("New");
        iteme1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              f.setVisible(false);
              
            }
        });
        file.add(iteme1);
        
        file.add(new JMenuItem("Open"));
        JMenuItem iteme3=new JMenuItem("Exit");
        iteme3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
                
               
            }
        });
        
        file.add(iteme3);
        

        f.setJMenuBar(jMenuBar);
    }

}
