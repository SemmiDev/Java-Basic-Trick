package com.sammidev;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallingPrivateMethodUsingReflectionAPI {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        Class c = Class.forName("com.sammidev.Testing");
        Testing t = (Testing)c.newInstance();

        Method m = c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        m.invoke(t,null);
    }
}

class Testing{
    private void show(){
        System.out.println("hello");
    }
}
