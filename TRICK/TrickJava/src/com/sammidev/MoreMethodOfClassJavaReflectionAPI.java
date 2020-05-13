package com.sammidev;

public class MoreMethodOfClassJavaReflectionAPI {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c = Class.forName("com.sammidev.A");
        System.out.println(c.getSuperclass().getDeclaredMethod("hello",null));
    }
}

class B{
    public void hello(){
        System.out.println("a");
    }

}

class A extends B{

}