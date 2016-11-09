package edu.matc.threaddemo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by paulawaite on 3/28/16.
 */
public class Animate {
    public int x = 1;
    public int y = 1;


    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500,270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++, x++, y++ ) {
            x++;
            drawP.repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public class MyDrawP extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0,0,500,250);
            g.setColor(Color.BLUE);
            g.fillRect(x, y, 500-x*2, 250-y*2);
        }
    }
}
