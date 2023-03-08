package org.example;

import java.awt.*;

public class PerimeterTester {

    public static void main(String[] args){

        Rectangle rec = new Rectangle(45, 60);
        double perimeter = 2*(rec.getWidth()) + 2*(rec.getHeight());

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Expected: (210.0)");

        //fix later!>!>!>!>!>


    }
}
