package org.example;

import javax.swing.*;

public class NameViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setTitle("Name Viewer");
        NameComponent component = new NameComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
