package com.sammidev;

public class HowToUseStaticBLockInJava {
    static String s = "";

    // the first exe
    static {
        System.out.println("static 1");
        s = "sam";

    }

    // the last exe
    public static void main(String[] args) {
        System.out.println("last execute");
        System.out.println("variable : " + s);
    }

    // the second exe
    static {
        System.out.println("static 2");
    }
}
