package com.patterns.design.singleton;

import java.io.Serial;
import java.io.Serializable;


//public class Admin implements Cloneable, Serializable {

public enum Admin {

    INSTANCE;

    private volatile static Admin admin=null;

    private String name;
    private String id;

    private Admin(){
//        if(admin!=null){
//            throw new RuntimeException("Object Already exists");
//        }

    }

    public static Admin getInstance(){
        if(admin==null){
            synchronized (Admin.class){
                admin=Admin.INSTANCE;
//                admin=new Admin();
            }

        }
        return admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Serial
    public Object readResolve(){
        return admin;
    }

//    protected Object clone(){
//        return admin;
//    }


}
