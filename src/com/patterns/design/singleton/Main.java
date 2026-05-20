package com.patterns.design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
//        Admin admin=new Admin();   cannot create objet because constructor is private

        Admin admin1=Admin.getInstance();
        admin1.setId("abc-112");
        admin1.setName("Shreyash");
        System.out.println(admin1.hashCode());

        Admin admin2=Admin.getInstance();
        admin2.setId("xyz-990");
        admin2.setName("Abhijeet");
        System.out.println(admin2.hashCode());

//        Admin admin3=Admin.getInstance();
//        System.out.println(admin3.hashCode());
//
//        Constructor<Admin> constructor=Admin.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Admin admin4=constructor.newInstance();
//        System.out.println(admin4.hashCode());

//        Admin admin5=Admin.getInstance();
//        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("object.ob"));
//        outputStream.writeObject(admin5);
//        System.out.println(admin5.hashCode());
//
//        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("object.ob"));
//        Admin admin6=(Admin)inputStream.readObject();
//        System.out.println(admin6.hashCode());

//        Admin admin7=Admin.getInstance();
//        System.out.println(admin7.hashCode());
//
//        Admin admin8=(Admin) admin7.clone();
//        System.out.println(admin8.hashCode());





    }
}
