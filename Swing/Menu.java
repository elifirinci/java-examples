import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class Menu{
    public static void main(String[] args){
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("menu1");
        JMenu m2=new JMenu("menu2");
        JMenu submenu=new JMenu("menu3");

        JMenuItem i1=new JMenuItem("item1");
        JMenuItem i2=new JMenuItem("item2");
        JMenuItem i3=new JMenuItem("item3");
        JMenuItem i4=new JMenuItem("item1");
        JMenuItem i5=new JMenuItem("item2");
        JMenuItem i6=new JMenuItem("item3");
        JMenuItem i7=new JMenuItem("item4");
        JMenuItem i8=new JMenuItem("item5");
        mb.add(m1);
        mb.add(m2);

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(submenu);

        m2.add(i4);
        m2.add(i5);
        m2.add(i6);

        submenu.add(i7);
        submenu.add(i8);

        p.setLayout(new BorderLayout());
        p.add(mb, BorderLayout.NORTH);
        
        f.setLayout(new BorderLayout());
        f.add(p, BorderLayout.CENTER);
        
        f.setSize(500,500);
        f.setVisible(true);



    }
}