package beSkilled;

import beSkilled.view.Open;
import beSkilled.view.test1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {

    public static void main(String[] args) {
        JFrame f = new JFrame("Common Menu");
        getCommonMenu(f);

        // JMenuBar item1=new JMenuBar("New");
        f.setBounds(10, 20, 400, 250);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);

    }

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
        JMenuItem iteme1 = new JMenuItem("New");
        Object obj = new Object();
        iteme1.setIcon(new javax.swing.ImageIcon(obj.getClass().getResource("/beSkilled/view/Images/New.gif")));
        file.add(iteme1);
        iteme1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new test1().setVisible(true);

            }
        });

        iteme1.setMnemonic('N');
        iteme1.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));

        JMenuItem iteme2 = new JMenuItem("Open_Save");
        //Object obj = new Object();
        iteme2.setIcon(new javax.swing.ImageIcon(obj.getClass().getResource("/beSkilled/view/Images/Open.gif")));

        file.add(iteme2);
        iteme2.setMnemonic('O');
        iteme2.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
        iteme2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Open().setVisible(true);

            }
        });

        JMenuItem iteme3 = new JMenuItem("Exit");
        iteme3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        file.add(iteme3);

        f.setJMenuBar(jMenuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}
