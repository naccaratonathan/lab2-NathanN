package org.example;

import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillRect(10, 10, 450, 150);
        g2.setColor(Color.RED);
        g2.drawString("Nathan", 60, 60);
    }

}