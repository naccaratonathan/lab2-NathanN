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
    }

}

