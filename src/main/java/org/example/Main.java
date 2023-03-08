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

        // 2.6

        java.awt.Rectangle box = new java.awt.Rectangle(5, 10, 20, 30);
        System.out.println(box);
        //java.awt.Rectangle[x=5,y=10,width=20,height=30]

        box.add(0, 0);
        System.out.println(box);
        //java.awt.Rectangle[x=5,y=10,width=25,height=40]


    }

}

