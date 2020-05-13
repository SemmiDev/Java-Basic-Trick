package com.sammidev;

public class DifferentWaysOfInstatiatingObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // cara pertama
        Test test= new Test();
        test.show();

        // cara kedua
        Class c = Class.forName("com.sammidev.Test");
        Test t = (Test)c.newInstance();
        t.show();
    }
}

class Test{
    public void show(){
        System.out.println("hello");
    }
}
