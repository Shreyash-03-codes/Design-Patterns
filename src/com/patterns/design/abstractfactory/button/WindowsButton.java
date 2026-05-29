package com.patterns.design.abstractfactory.button;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Window Button Clicked...!!!");
    }
}
