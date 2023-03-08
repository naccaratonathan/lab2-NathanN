package org.example;

public class Main {
    public static void main(String[] args) {


        // 2.1
        String river = "Mississippi";


        System.out.println(river);
        river = river.replace("i","ii");
        System.out.println(river.length());
        river = river.replace("ss","s");
        System.out.println(river.length());

        // 2.6 AddTester

        java.awt.Rectangle box = new java.awt.Rectangle(5, 10, 20, 30);
        box.add(0, 0);

        System.out.println("Location " + box.getLocation());
        System.out.println("Width " + box.getWidth());
        System.out.println("Height " + box.getHeight());

        System.out.println("Expected Location (0, 0)");
        System.out.println("Expected Width (25.0)");
        System.out.println("Expected Height (40.0)");

        //2.15 PointTester

    }

}

