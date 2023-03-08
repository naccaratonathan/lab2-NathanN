package org.example;

public class Rectangle {

// 2.6
    public static void main(String[] args){

        java.awt.Rectangle box = new java.awt.Rectangle(5, 10, 20, 30);
        System.out.println(box);
        //java.awt.Rectangle[x=5,y=10,width=20,height=30]

        box.add(0, 0);
        System.out.println(box);
        //java.awt.Rectangle[x=5,y=10,width=25,height=40]

    }

}

